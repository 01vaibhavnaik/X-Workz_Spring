package com.xworkz.rajajinagar.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.Size;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BagDTO {
    @Size(min = 4,max = 15,message = "Letter Should be minimum 4 and max 15 ")
    private String bagname;
    private int bagprice;
    private String bagcolor;
}
