package com.xworkz.hospital.controller;

import com.xworkz.hospital.entity.HospitalEntity;
import com.xworkz.hospital.service.HospitalService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
    public ModelAndView logIn(@RequestParam String otpname,
                              @RequestParam String email,
                              ModelAndView modelAndView) {

        if (otpname == null || otpname.isEmpty()) {
            modelAndView.addObject("result", "Enter Otp");
            modelAndView.addObject("email", email);
            modelAndView.setViewName("SignIn");
        } else {
            boolean check = hospitalService.check(otpname);

            if (check) {
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


}
