package com.xworkz.towel.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClothComponent {

    @Autowired
    private String towelBrand;
    private int noOfTowel;

    public ClothComponent(){
    }
}
