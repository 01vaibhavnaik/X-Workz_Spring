package com.xworkz.springtask.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "com.xworkz.springtask.bag")
public class BagConfiguration {

    public BagConfiguration(){
        System.out.println("Using Configuration ComponentScan Running BagConfiguration Class....");
    }

    @Bean
    public List<String> bagBrand(){
        System.out.println("Running Bag Brand in Bag Config Class...");
        return Arrays.asList("Nike,Puma");
    }
    @Bean
    public int noOfBags(){
        System.out.println("Running No Of Bags in Bag Config Class...");
        return 100;
    }
    @Bean
    public String bagName(){
        System.out.println("Running Bag Name in Bag Config Class...");
        return "Nike";
    }
    @Bean
    public float bagWaterproof(){
        System.out.println("Running Bag WaterProof in Bag Config Class...");
        return 8.7f;
    }
    @Bean
    public float[] bagWaterproofs(){
        System.out.println("Running Bag WaterProofs in Bag Config Class...");
        return new float[]{5.3f,6.4f};
    }

    @Bean
    public String[] bagsName(){
        System.out.println("Running Bag Names in Bag Config Class...");
        return new String[]{"Nike","Adiddas"};
    }
    @Bean
    public double bagPrice(){
        System.out.println("Running Bag Price in Bag Config Class...");
        return 589.0;
    }

    @Bean
    public double[] bagsPrice(){
        System.out.println("Running Bags Price in Bag Config Class...");
        return new double[]{589.0,650.35,873.7};
    }

    @Bean
    public ArrayList<Integer> totalNoBags(){
        System.out.println("Running Total No Bags in Bag Config Class...");
        return new ArrayList<>(Arrays.asList(3,4,5,2));
    }

    @Bean
    public int[][] arraysInt(){
        System.out.println("Running Arrays Int in Bag Config Class...");
        return  new int[][]{{2,4,5},{6,4,3},{9,4,2}};
    }
}
