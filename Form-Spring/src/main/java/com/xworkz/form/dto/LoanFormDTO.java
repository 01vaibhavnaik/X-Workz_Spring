package com.xworkz.form.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class LoanFormDTO {
    private String loantype;
    private String name;
    private int age;
    private String email;
    private String address;
    private int income;
    private int amount;
    private String repayment;
}
