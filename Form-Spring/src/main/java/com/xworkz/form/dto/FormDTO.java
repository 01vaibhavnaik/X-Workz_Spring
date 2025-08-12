package com.xworkz.form.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FormDTO {
    private String name;
    private String email;
    private int age;
    private String address;
    private int salary;
}
