package com.xworkz.towel.confifuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import java.applet.AppletContext;

public class TowelRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(TowelConfiguration.class);


        String brand= applicationContext.getBean("towelBrand",String.class);
        System.out.println(brand);

        int noOfTowel =applicationContext.getBean("noOfTowel",int.class);
        System.out.println(noOfTowel);


    }
}
