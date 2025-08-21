package com.xworkz.page.repository;

import com.xworkz.page.dto.SignUpDTO;
import com.xworkz.page.entity.SignUpEntity;

public interface SignUpRepository {
    boolean getSignUp(SignUpEntity signUpEntity);
    SignUpEntity getSignIn(String email);
    boolean forgotpass(String email,String pass);
    boolean updateprofile(SignUpEntity entity);
}
