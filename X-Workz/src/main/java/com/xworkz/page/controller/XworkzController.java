package com.xworkz.page.controller;

import com.xworkz.page.dto.SignUpDTO;
import com.xworkz.page.service.SignUpService;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;


@Controller
@RequestMapping("/")

public class XworkzController {


    @Autowired
    SignUpService signUpService;

    @RequestMapping("/signup")
    public ModelAndView getdetail(@RequestParam("image") MultipartFile multipartFile, @Valid SignUpDTO signUpDTO, BindingResult bindingResult, ModelAndView modelAndView) throws IOException {
        if (bindingResult.hasErrors()) {
            modelAndView.addObject("errors", bindingResult.getAllErrors());
            modelAndView.setViewName("SignIn");
            return modelAndView;
        }

        byte[] bytes = multipartFile.getBytes();
        Path path = Paths.get("D:\\ImageData\\" + signUpDTO.getName() + System.currentTimeMillis() + ".jpg");
        Files.write(path, bytes);
        String imageName = path.getFileName().toString();
        signUpDTO.setImagepath(imageName);
        signUpService.getSignUp(signUpDTO);
        modelAndView.setViewName("SignIn");
        return modelAndView;
    }


    @RequestMapping("/signin")
    public ModelAndView getdetail(@Valid String email, String password, ModelAndView modelAndView, HttpSession session) {
        SignUpDTO signUpDTO;
        signUpDTO = signUpService.getSignin(email, password);
        if (signUpDTO.getEmail() == null) {
            modelAndView.addObject("result", "invalid password");
            modelAndView.setViewName("SignIn");
        } else if (signUpDTO.getEmail().equals("Locked")) {
            modelAndView.addObject("result", "your account has locked");
            modelAndView.setViewName("SignIn");
        }
//        else if (signUpDTO.getEmail().equals("TimeOut")) {
//            modelAndView.addObject("result", "reset");
//            modelAndView.setViewName("SignIn");
//        }
        else if (signUpDTO.getEmail().equals("notFound")) {
            modelAndView.addObject("result", "not found");
            modelAndView.setViewName("SignIn");
        } else {
            session.setAttribute("userSigInData", signUpDTO);
            modelAndView.addObject("results", signUpDTO);
            modelAndView.setViewName("Home");

        }
        return modelAndView;
    }


    @RequestMapping("/forgotpass")
    public ModelAndView forgotpass(@Valid String email, String password, ModelAndView modelAndView) {
        boolean results = signUpService.forgotpass(email, password);
        if (!results)
            modelAndView.addObject("results", results);
        modelAndView.setViewName("SignIn");
        return modelAndView;
    }

    @RequestMapping("/userdetail")
    public ModelAndView userDetail(ModelAndView modelAndView, HttpSession session) {
        SignUpDTO signUpDTO = (SignUpDTO) session.getAttribute("userSigInData");
        modelAndView.addObject("dto", signUpDTO);
        modelAndView.setViewName("ProfileUpdate");
        return modelAndView;
    }

    @RequestMapping("/updateprofile")
    public String updateProfile(@Valid SignUpDTO signUpDTO, HttpSession session) {
        signUpService.updateprofile(signUpDTO);
        session.setAttribute("userSigInData", signUpDTO);
        session.setAttribute("name",signUpDTO.getName());
       String name =(String) session.getAttribute("name");
       session.removeAttribute("name");
        return "redirect:/userdetail";
    }

    @GetMapping("/download")
    public void download(HttpServletResponse response, @RequestParam String fileName) throws IOException {

        response.setContentType("imagae/jpeg");
        File file = new File("D:\\ImageData\\" + fileName);
        InputStream inputStream = new BufferedInputStream(new FileInputStream(file));
        ServletOutputStream servletOutputStream = response.getOutputStream();
        IOUtils.copy(inputStream, servletOutputStream);

        response.flushBuffer();
    }

}
