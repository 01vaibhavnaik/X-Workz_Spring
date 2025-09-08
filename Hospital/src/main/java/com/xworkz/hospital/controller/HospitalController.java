package com.xworkz.hospital.controller;

import com.xworkz.hospital.entity.HospitalEntity;
import com.xworkz.hospital.service.HospitalService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
@Controller
@RequestMapping("/")
public class HospitalController {

    @Autowired
    HospitalService hospitalService;

    @RequestMapping("/sendotp")
    public String sendOtp(@RequestParam(value = "email") String email, Model model) {
        if (email.isEmpty()) {
            log.info("=-----------------===");
        }else {
            hospitalService.getOtp(email);
            model.addAttribute("result", "OTP sent to " + email);
        }
        return "SignIn";

    }


}
