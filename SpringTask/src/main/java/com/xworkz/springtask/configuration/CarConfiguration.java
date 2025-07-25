package com.xworkz.springtask.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "com.xworkz.springtask.car")
public class CarConfiguration {

    public CarConfiguration() {
        System.out.println("Running Car Configuration Class...");
        System.out.println("==============================================================");
    }

    @Bean
    public String carName() {
        System.out.println("Creating carName bean...");
        return "BMW";
    }
    @Bean
    public int carPrice() {
        System.out.println("Creating carPrice bean...");
        return 5000000;
    }
    @Bean
    public String[] carColors() {
        System.out.println("Creating carColors bean...");
        return new String[]{"Red", "Blue", "Black"};
    }
    @Bean
    public Integer[] carYears() {
        System.out.println("Creating carYears bean...");
        return new Integer[]{2020, 2021, 2022};
    }

    @Bean
    public List<String> carFeatures() {
        System.out.println("Creating carFeatures bean...");
        return Arrays.asList("Sunroof", "Leather Seats", "Navigation System");
    }

    @Bean
    public ArrayList<Integer> carNo(){
        System.out.println("Creating carNo bean...");
        return new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    }
    @Bean
    public String carType() {
        System.out.println("Creating carType bean...");
        return "Sedan";
    }
    @Bean
    public String carEngineType() {
        System.out.println("Creating carEngineType bean...");
        return "V8";
    }
    @Bean
    public boolean isElectric() {
        System.out.println("Creating isElectric bean...");
        return false;
    }
    @Bean
    public String carTransmission() {
        System.out.println("Creating carTransmission bean...");
        System.out.println("==========================================================================");
        return "Manual";
    }

}
