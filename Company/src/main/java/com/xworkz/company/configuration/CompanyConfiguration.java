package com.xworkz.company.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.xworkz.company")
public class CompanyConfiguration {

    public CompanyConfiguration(){
        System.out.println("Company configuration running ");
    }

}
