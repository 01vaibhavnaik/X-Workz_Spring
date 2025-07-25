package com.xworkz.springtask.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;

@Configuration
@ComponentScan(basePackages = "com.xworkz.springtask.watch")
public class WatchConfiguration {
    public WatchConfiguration() {
        System.out.println("Running Watch Configuration...");
        System.out.println("==============================================================================");
    }
    @Bean
    public String watchBrand() {
        System.out.println("Registering brand in Watch Configuration...");
        return "Rolex";
    }

    @Bean
    public String watchType() {
        System.out.println("Registering type in Watch Configuration...");
        return "Analog";
    }

    @Bean
    public String watchColor() {
        System.out.println("Registering color in Watch Configuration...");
        return "Black";
    }
    @Bean
    public int watchPrice() {
        System.out.println("Registering price in Watch Configuration...");
        return 50000;
    }

    @Bean
    public boolean isWaterResistant() {
        System.out.println("Registering water resistance in Watch Configuration...");
        return true;
}
    @Bean
    public String watchMaterial() {
        System.out.println("Registering material in Watch Configuration...");
        return "Stainless Steel";
    }

    @Bean
    public String watchSize() {
        System.out.println("Registering size in Watch Configuration...");
        return "Medium";
    }

    @Bean
    public String watchWarranty() {
        System.out.println("Registering warranty in Watch Configuration...");
        return "2 Years";
    }
    @Bean
    public ArrayList<String> watchFeatures() {
        System.out.println("Registering features in Watch Configuration...");
        ArrayList<String> features = new ArrayList<>();
        features.add("Water Resistant");
        features.add("Scratch Resistant");
        features.add("Automatic Movement");
        return features;
    }
    @Bean
    public ArrayList<Integer> watchRatings() {
        System.out.println("Registering ratings in Watch Configuration...");
        System.out.println("==============================================================================");
        return new ArrayList<>(Arrays.asList(5, 4, 4, 5, 3));
    }
}
