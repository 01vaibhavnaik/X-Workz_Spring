package com.xworkz.page.controller;

import com.xworkz.page.dto.SignUpDTO;
import com.xworkz.page.service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
@RequestMapping("/")

public class XworkzController {


    @Autowired
    SignUpService signUpService;

    @RequestMapping("/signup")
    public ModelAndView getdetail(@Valid SignUpDTO signUpDTO, BindingResult bindingResult,ModelAndView modelAndView){
        if(bindingResult.hasErrors()) {
            modelAndView.addObject("errors", bindingResult.getAllErrors());
//            modelAndView.setViewName("SignIn");
            return modelAndView;
        }

        signUpService.getSignUp(signUpDTO);
        modelAndView.setViewName("SignIn");
        return modelAndView;
    }



    @RequestMapping("/signin")
    public ModelAndView getdetail(@Valid String email, String password, ModelAndView modelAndView, HttpSession session) {
        SignUpDTO signUpDTO;
        signUpDTO = signUpService.getSignin(email, password);
        if(signUpDTO==null){
        modelAndView.addObject("result","fail");
        modelAndView.setViewName("SignInFail");
        return modelAndView;

        }else {
            session.setAttribute("userSigInData",signUpDTO);
            modelAndView.addObject("results", signUpDTO);
            modelAndView.setViewName("Home");
            return modelAndView;
        }
    }


    @RequestMapping("/forgotpass")
    public ModelAndView forgotpass(@Valid String email, String password, ModelAndView modelAndView) {
        boolean results = signUpService.forgotpass(email, password);
        if (!results)
            modelAndView.addObject("results",results);
            modelAndView.setViewName("Home");
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
        return "redirect:/userdetail";
    }







}
