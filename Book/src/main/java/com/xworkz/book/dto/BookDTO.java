package com.xworkz.book.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BookDTO {
    @NotNull
    @Size(min = 3,max = 15,message = "book name")
    private String bookname;
    @NotNull
    @Min(value = 100,message = "price")
    private int bookprice;
    @NotNull
    @Pattern(regexp = "^[A-Za-z0-9]+@gmail\\.com$",message = "book email")
    private String email;
    @NotNull
    @Pattern(regexp = "^(?=.*[A-Z])(?=.*[^A-Za-z0-9])(?=(.*\\d){3,}).{3,15}$",message = "book pass")
    private String password;

}
