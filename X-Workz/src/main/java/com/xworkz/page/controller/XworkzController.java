package com.xworkz.page.controller;

import com.xworkz.page.dto.SignUpDTO;
import com.xworkz.page.service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
            modelAndView.setViewName("SignIn");
            return modelAndView;
        }

        signUpService.getSignUp(signUpDTO);
        modelAndView.setViewName("SignIn");
        return modelAndView;
    }

    @RequestMapping("/signin")
    public ModelAndView getdetail(String email, String password,ModelAndView modelAndView) {
        boolean result = signUpService.getSignin(email, password);
        if(!result)
        modelAndView.addObject("result",result);
        modelAndView.setViewName("SignIn");
        return modelAndView;
        }


    @RequestMapping("/forgotpass")
    public ModelAndView forgotpass(String email, String password, ModelAndView modelAndView) {
        boolean results = signUpService.forgotpass(email, password);
        if (!results)
            modelAndView.addObject("results",results);
            modelAndView.setViewName("SignInSuccessfull");
            return modelAndView;
        }




}
