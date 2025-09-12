package com.xworkz.hospital.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DoctorDTO {


    private int docid;
    @NotNull
    @Size(min=3,max = 25,message = " Name Must Contain Min 3 And Max 25 Character")
    private String name;
    @NotNull
    @Pattern(regexp = "^[A-Za-z0-9]+@gmail\\.com$", message = "Enter Correct Email")
    private String email;
    private String specialist;
    @NotNull(message = "Age Is Required ")
    private int age;
    @NotNull(message = "Address Is Required ")
    private String address;
    private String profile;
}
