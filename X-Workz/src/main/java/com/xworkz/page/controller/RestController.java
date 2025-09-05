package com.xworkz.page.controller;

import com.xworkz.page.service.SignUpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/")
@Slf4j
public class RestController {

    @Autowired
    SignUpService signUpService;

    @GetMapping(value = "checkEmail/{emailName}",produces = MediaType.APPLICATION_JSON_VALUE)
    public String checkCount(@PathVariable String emailName){
        log.info(emailName);
        int count=signUpService.getCount(emailName);
        if (count==0){
            return "Email Valid";
        }
        else  {
            return "Email already Exist";
        }

    }


}
