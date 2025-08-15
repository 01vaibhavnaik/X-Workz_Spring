package com.xworkz.rajajinagar.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@AllArgsConstructor
@NoArgsConstructor
@Data
@NonNull
public class ShopDTO {
    @Size(min = 3,max = 15,message = "Your Name Size Should Between 3 to 15 letter")
    private String shopname;
    private String shoploc;
    private String shopemail;
    private long shophno;
    private int openingtime;
    private int closingtime;

}
