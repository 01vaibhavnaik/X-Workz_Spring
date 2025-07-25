package com.xworkz.springtask.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "com.xworkz.springtask.shoe")
public class ShoeConfiguration {
    public ShoeConfiguration(){
        System.out.println("Using Configuration ComponentScan Running ShoeConfiguration Class....");
        System.out.println("===================================================================");
    }

    @Bean
    public int noOfShoe(){
        System.out.println("Running No Of Shoe in Shoe Config Class...");
        return 10;
    }

    @Bean
    public List<String> shoeBrand(){
        System.out.println("Running Shoe Brand in Shoe Config Class...");
        return Arrays.asList("Nike,RedTape,Puma");
    }
    @Bean
    public double shoePrice(){
        System.out.println("Running Shoe Price in Shoe Config Class...");
        return 589.0;
    }


    @Bean
    public int[][] arraysIntShoe(){
        System.out.println("Running Arrays Int in Shoe Config Class...");
        return  new int[][]{{2,4,5},{6,4,3},{9,4,2}};
    }
    @Bean
    public float[] ShoesSize(){
        System.out.println("Running Shoes Size in Shoe Config Class...");
        return new float[]{8.3f,7.4f};
    }

    @Bean
    public String[] ShoeName(){
        System.out.println("Running Shoe Names in Shoe Config Class...");
        return new String[]{"Nike","Adiddas"};
    }
    @Bean
    public String shoeName(){
        System.out.println("Running Shoe Name in Shoe Config Class...");
        return "Woodland";
    }


    @Bean
    public double[] shoesPrice(){
        System.out.println("Running Shoes Price in Shoe Config Class...");
        return new double[]{789.0,1650.35,830};
    }

    @Bean
    public ArrayList<Integer> totalNoShoe(){
        System.out.println("Running Total No Shoe in Shoe Config Class...");
        return new ArrayList<>(Arrays.asList(3,4,5,2));
    }
    @Bean
    public float ShoeSize(){
        System.out.println("Running Shoe Size in Shoe Config Class...");
        System.out.println("====================================================================");
        return 6.9f;
    }


}
