package com.xworkz.towel.confifuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.xworkz.towel")
public class TowelConfiguration {
    public TowelConfiguration(){
        System.out.println("Running Configuration in Towel");
    }

    @Bean
    public String towelBrand(){
        System.out.println("Running Brand");
        return "Nike";
    }
    @Bean
    public int noOfTowel(){
        System.out.println("Running Towel No..");
        return 6;
    }
}
