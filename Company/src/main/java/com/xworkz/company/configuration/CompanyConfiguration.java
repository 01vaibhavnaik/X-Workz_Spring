package com.xworkz.company.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.servlet.annotation.WebInitParam;
@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.xworkz.company")
public class CompanyConfiguration implements WebMvcConfigurer {

    public CompanyConfiguration(){
        System.out.println("Company configuration running ");
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    @Bean
    public  InternalResourceViewResolver resourceViewResolver(){
        return new InternalResourceViewResolver("/",".jsp");
    }
}
