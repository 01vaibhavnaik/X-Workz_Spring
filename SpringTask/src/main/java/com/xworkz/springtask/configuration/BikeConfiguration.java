package com.xworkz.springtask.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
@ComponentScan(basePackages = "com.xworkz.springtask.bike")
public class BikeConfiguration {
    public BikeConfiguration() {
        System.out.println("Running Configuration in BikeConfiguration Class...");
        System.out.println("==============================================================");
    }

    @Bean
    public Map<String, String> bikeMap() {
        System.out.println("Registering Map in BikeConfiguration Class...");
        Map<String, String> map = new HashMap<>();
        map.put("mountain", "MTB100");
        map.put("road", "RB200");
        return map;
    }
    @Bean
    public String bikeBrand() {
        System.out.println("Registering brand in BikeConfiguration Class...");
        return "Trek";
    }
    @Bean
    public String bikeType() {
        System.out.println("Registering type in BikeConfiguration Class...");
        return "Mountain";
    }
    @Bean
    public String bikeColor() {
        System.out.println("Registering color in BikeConfiguration Class...");
        return "Red";
    }
    @Bean
    public int bikePrice() {
        System.out.println("Registering price in BikeConfiguration Class...");
        return 15000;
    }
    @Bean
    public String bikeSize() {
        System.out.println("Registering size in BikeConfiguration Class...");
        return "Medium";
    }
    @Bean
    public String bikeMaterial() {
        System.out.println("Registering material in BikeConfiguration Class...");
        return "Aluminum";
    }
    @Bean
    public String bikeWarranty() {
        System.out.println("Registering warranty in BikeConfiguration Class...");
        return "1 Year";
    }
    @Bean
    public boolean isBikeElectric() {
        System.out.println("Registering electric status in BikeConfiguration Class...");
        return false;
    }
    @Bean
    public String bikeFeatures() {
        System.out.println("Registering features in BikeConfiguration Class...");
        System.out.println("===================================================================");
        return "Disc Brakes, Suspension Fork, Lightweight Frame";
    }

}
