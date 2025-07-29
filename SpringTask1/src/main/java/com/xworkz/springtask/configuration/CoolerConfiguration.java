package com.xworkz.springtask.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.xworkz.springtask.configuration")
public class CoolerConfiguration {

    public CoolerConfiguration(){
        System.out.println("Running Configuration");
    }

    @Bean
    public String personName(){
        System.out.println("Person Name ");
        return "Vaibhav";
    }
}
