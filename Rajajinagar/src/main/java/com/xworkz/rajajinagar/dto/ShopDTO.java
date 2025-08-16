package com.xworkz.rajajinagar.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@NonNull
public class ShopDTO {
    @Size(min = 3, max = 15, message = "Your Name Size Should Be Between 3 to 15 letters")
    private String shopname;

    @Size(min = 3, max = 25, message = "Shop Location Should Be Between 3 to 25 letters")
    private String shoploc;

    @Email(message = "Invalid email format")
    @NotBlank(message = "Email is required")
    private String shopemail;

    @Min(value = 6000000000L, message = "Phone number must start with 6, 7, 8, or 9")
    @Max(value = 9999999999L, message = "Phone number must be exactly 10 digits")
    private long shophno;

    @Min(value = 1, message = "Opening time must be between 1 and 12")
    @Max(value = 12, message = "Opening time must be between 1 and 12")
    private int openingtime;

    @Min(value = 1, message = "Closing time must be between 1 and 12")
    @Max(value = 12, message = "Closing time must be between 1 and 12")
    private int closingtime;

}
