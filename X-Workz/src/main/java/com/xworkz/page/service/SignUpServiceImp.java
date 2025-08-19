package com.xworkz.page.service;

import com.xworkz.page.dto.SignUpDTO;
import com.xworkz.page.entity.SignUpEntity;
import com.xworkz.page.repository.SignUpRepository;
import com.xworkz.page.repository.SignUpRepositoryImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class SignUpServiceImp implements SignUpService{
    @Autowired
    SignUpRepository signUpRepository;


    BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder();

    @Override
    public boolean getSignUp(SignUpDTO signUpDTO) {
        SignUpEntity signUpEntity=new SignUpEntity();
        signUpEntity.setName(signUpDTO.getName());
        signUpEntity.setEmail(signUpDTO.getEmail());
        signUpEntity.setAge(signUpDTO.getAge());
        signUpEntity.setGender(signUpDTO.getGender());
        signUpEntity.setAddress(signUpDTO.getAddress());
        String enc=bCryptPasswordEncoder.encode(signUpDTO.getPassword());
        signUpEntity.setPassword(enc);

        signUpRepository.getSignUp(signUpEntity);
        return false;
    }

    @Override
    public boolean getSignin(String email,String password) {
        System.out.println("Email :"+email);
        SignUpEntity sign = signUpRepository.getSignIn(email);
        if(email.equals(sign.getEmail()) && bCryptPasswordEncoder.matches(password, sign.getPassword()));{
            return true;
        }
    }
}
