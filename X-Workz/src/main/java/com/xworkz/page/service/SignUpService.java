package com.xworkz.page.service;

import com.xworkz.page.dto.SignUpDTO;

public interface SignUpService {

    boolean getSignUp(SignUpDTO signUpDTO);
    boolean getSignin(String email,String password);
}
