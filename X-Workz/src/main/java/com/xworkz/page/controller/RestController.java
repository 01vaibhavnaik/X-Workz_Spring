package com.xworkz.page.controller;

import com.xworkz.page.service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/")
public class RestController {

    @Autowired
    SignUpService signUpService;

    @GetMapping("checkEmail/{email}")
    private String checkCount(@PathVariable String email){
        int count=signUpService.getCount(email);
        if (count==0)
            return "Email Valid";
        else  return "Email already Exist";


    }




}
