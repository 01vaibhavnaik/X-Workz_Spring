package com.xworkz.rajajinagar.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.validation.constraints.Size;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class FlowerDTO {
    @Size(min = 4,max = 15,message = "Letter Should be minimum 4 and max 15 ")
    private String flowername;
    private int flowerprice;
    private String flowercolor;
}
