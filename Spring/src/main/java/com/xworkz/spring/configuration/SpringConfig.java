package com.xworkz.spring.configuration;

import com.xworkz.spring.internal.TrailClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.xworkx.spring")
public class SpringConfig {
    public SpringConfig(){
        System.out.println("Running in Spring Config.....");
    }

    @Bean

    public String personName(){
        System.out.println("Running Person Name...");
        return "";
    }

    @Bean
    public int[] noOfPerson(){
        System.out.println("Running Person No.....");
        return new int[] {4,2,3};
    }
@Bean
    public TrailClass method(){
        return new TrailClass();
    }


}
