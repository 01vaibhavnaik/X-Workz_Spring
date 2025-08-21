package com.xworkz.page.service;

import com.xworkz.page.dto.SignUpDTO;
import com.xworkz.page.entity.SignUpEntity;

public interface SignUpService {

    boolean getSignUp(SignUpDTO signUpDTO);
    SignUpDTO getSignin(String email, String password);
    boolean forgotpass(String email,String password);
    boolean updateprofile(SignUpDTO signUpDTO);
}
