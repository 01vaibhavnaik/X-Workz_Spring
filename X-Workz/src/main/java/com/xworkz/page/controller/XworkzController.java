package com.xworkz.page.controller;

import com.xworkz.page.dto.SignUpDTO;
import com.xworkz.page.service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;
import java.util.Objects;

@Controller
@RequestMapping("/")
public class XworkzController {
    @Autowired
    SignUpService signUpService;

    @RequestMapping("/signup")
    public ModelAndView getXworkz(@Valid SignUpDTO signUpDTO, BindingResult bindingResult,ModelAndView modelAndView){

        if(bindingResult.hasErrors()) {
            modelAndView.addObject("errors", bindingResult.getAllErrors());
            modelAndView.setViewName("SignIn");
            return modelAndView;
        }

        signUpService.getSignUp(signUpDTO);
        modelAndView.setViewName("SignIn");
        return modelAndView;
    }

//    @RequestMapping("/signin")
//    public ModelAndView getdetail(String name, String password,ModelAndView modelAndView){
//        boolean result=signUpService.getSignin(name,password);
//        return modelAndView;
//    }

}
