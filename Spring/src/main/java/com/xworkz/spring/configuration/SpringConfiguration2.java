package com.xworkz.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class SpringConfiguration2 {

    @Bean
    public List<String> registerList(){
        System.out.println("Running Register List");
       return  Arrays.asList("Omkareshwar","Akshara");
    }
}
