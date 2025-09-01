package com.xworkz.page.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class SignUpDTO {
    @NotNull
    @Size(min=3,max = 25,message = "Your Name Must Contain Min 3 And Max 25 Character")
    private String name;
    @NotNull
    @Pattern(regexp = "^[A-Za-z0-9]+@gmail\\.com$", message = "Enter Correct Email")
    private String email;
    @NotNull
    @Min(value = 18,message = "Age Should Above 18")
    @Max(value = 60,message = "Age Should Below 60")
    private  int age;
    @NotNull(message = "Gender Is Required")
    private String gender;
    @NotNull(message = "Address Is Required ")
    private String address;
    @Pattern(regexp = "^(?=.*[A-Z])(?=.*[^A-Za-z0-9])(?=(.*\\d){3,}).{3,15}$", message = "Put A Strong Password")
    private String password;
}
