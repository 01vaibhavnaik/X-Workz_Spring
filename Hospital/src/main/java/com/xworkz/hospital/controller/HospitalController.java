package com.xworkz.hospital.controller;

import com.xworkz.hospital.dto.DoctorDTO;
import com.xworkz.hospital.entity.HospitalEntity;
import com.xworkz.hospital.service.HospitalService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Controller
@RequestMapping("/")
public class HospitalController {

    @Autowired
    HospitalService hospitalService;

    @RequestMapping("/sendotp")
    public String sendOtp(@RequestParam String email, Model model) {
        if (email == null || email.isEmpty()) {
            model.addAttribute("result", "Email Not Found");
        } else {
            hospitalService.getOtp(email);
            model.addAttribute("result", "OTP sent to " + email);
            model.addAttribute("email", email);
        }
        return "SignIn";
    }

    @RequestMapping("/signin")
    public ModelAndView logIn(@RequestParam String otpname, @RequestParam String email, ModelAndView modelAndView) {

        if (otpname == null || otpname.isEmpty()) {
            modelAndView.addObject("result", "Enter Otp");
            modelAndView.addObject("email", email);
            modelAndView.setViewName("SignIn");
        } else {
            boolean check = hospitalService.check(otpname);
            if (check) {
//
//                httpSession.setAttribute("loggedIn", true);
//                httpSession.setAttribute("email", email);

                modelAndView.addObject("message", "Successful");
                modelAndView.setViewName("Home");
            } else {
                modelAndView.addObject("result", "Incorrect Otp");
                modelAndView.addObject("email", email);
                modelAndView.setViewName("SignIn");
            }
        }
        return modelAndView;
    }
    
    @PostMapping("/doctordetails")
    public ModelAndView saveDetails(@RequestParam("profileimage") MultipartFile multipartFile,@Valid DoctorDTO doctorDTO, BindingResult bindingResult, ModelAndView modelAndView) throws IOException {
        if(bindingResult.hasErrors()){
            modelAndView.addObject("fail",doctorDTO);
            modelAndView.setViewName("DoctorForm");
            List<ObjectError> objectError=bindingResult.getAllErrors();
                System.out.println(objectError);

        }else {
            byte[] bytes=multipartFile.getBytes();
            Path path=Paths.get("D:\\DocProfile\\"+doctorDTO.getName()+System.currentTimeMillis()+".jpg");
            Files.write(path,bytes);
            String imageName=path.getFileName().toString();
            doctorDTO.setProfile(imageName);
            modelAndView.addObject("success",doctorDTO);
            modelAndView.setViewName("Home");
            hospitalService.saveDetails(doctorDTO);
        }
        return modelAndView;
    }

    @RequestMapping("/viewdetail")
    public ModelAndView viewDetail(ModelAndView modelAndView){
        List<DoctorDTO> list=hospitalService.viewDetail();
        if (list == null){
            log.info("returning null");
        }
        modelAndView.addObject("show",list);
        modelAndView.setViewName("Details");
        System.out.println(list);
        return modelAndView;
    }

    @GetMapping("/download")
    public void download(HttpServletResponse response, @RequestParam String fileName) throws IOException {

        response.setContentType("imagae/jpeg");
        File file = new File("D:\\DocProfile\\" + fileName);
        InputStream inputStream = new BufferedInputStream(new FileInputStream(file));
        ServletOutputStream servletOutputStream = response.getOutputStream();
        IOUtils.copy(inputStream, servletOutputStream);
        response.flushBuffer();
    }

}
