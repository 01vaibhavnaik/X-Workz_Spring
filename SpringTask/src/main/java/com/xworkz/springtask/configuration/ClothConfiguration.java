package com.xworkz.springtask.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages ="com.xworkz.springtask.cloth")
public class ClothConfiguration {
    public ClothConfiguration(){
        System.out.println("Runnging Configuration In ClothConfiguration");
        System.out.println("==============================================================");
    }

    @Bean
    public int clothPrice(){
        System.out.println("Running Price in ClothConfiguration....");
        return 500;
    }
}
