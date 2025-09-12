package com.xworkz.hospital.restcontroller;

import com.xworkz.hospital.service.HospitalService;
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
    HospitalService hospitalService;
@GetMapping(value ="checkEmail/{email}" ,produces = MediaType.APPLICATION_JSON_VALUE)
    public String getDetail(@PathVariable String email) {
    int count = hospitalService.getDetail(email);
    if (count == 0) {
        return "Not Valid Email";
    } else {
        return "";
    }
}
}
