package com.xworkz.page.service;

import com.sun.mail.smtp.SMTPTransport;
import com.xworkz.page.dto.SignUpDTO;
import com.xworkz.page.entity.SignUpEntity;
import com.xworkz.page.repository.SignUpRepository;
import com.xworkz.page.repository.SignUpRepositoryImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

@Service
public class SignUpServiceImp implements SignUpService {
    @Autowired
    SignUpRepository signUpRepository;



    BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();


    @Override
    public boolean getSignUp(SignUpDTO signUpDTO) {
        SignUpEntity signUpEntity=new SignUpEntity();
        signUpEntity.setName(signUpDTO.getName());
        signUpEntity.setEmail(signUpDTO.getEmail());
        setEmail(signUpEntity.getEmail());
        signUpEntity.setAge(signUpDTO.getAge());
        signUpEntity.setGender(signUpDTO.getGender());
        signUpEntity.setAddress(signUpDTO.getAddress());
        String enc = bCryptPasswordEncoder.encode(signUpDTO.getPassword());
        signUpEntity.setPassword(enc);

        signUpRepository.getSignUp(signUpEntity);
        return false;
    }

    @Override
    public SignUpDTO getSignin(String email, String password) {
        SignUpEntity sign = signUpRepository.getSignIn(email);
        SignUpDTO signUpDTO=new SignUpDTO();
        signUpDTO.setEmail(sign.getEmail());
        signUpDTO.setName(sign.getName());
        signUpDTO.setAddress(sign.getAddress());
        signUpDTO.setAge(sign.getAge());
        signUpDTO.setGender(sign.getGender());
        if (sign !=null && bCryptPasswordEncoder.matches(password, sign.getPassword())) {
            return signUpDTO;
        }
    return null;
    }

    @Override
    public boolean forgotpass(String email, String password) {
        String pas= bCryptPasswordEncoder.encode(password);
        signUpRepository.forgotpass(email,pas);
        return true;
    }

    @Override
    public boolean updateprofile(SignUpDTO signUpDTO) {
        SignUpEntity signUpEntity=new SignUpEntity();
        signUpEntity.setName(signUpDTO.getName());
        signUpEntity.setEmail(signUpDTO.getEmail());
        signUpEntity.setAge(signUpDTO.getAge());
        signUpEntity.setGender(signUpDTO.getGender());
        signUpEntity.setAddress(signUpDTO.getAddress());
        signUpRepository.updateprofile(signUpEntity);
        return false;
    }

    private void setEmail(String email) {


        final String username = "vaibhavnaik32275@gmail.com";
        final String password = "ndof jelk psyn wnvx";

        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true"); //TLS

        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(email));
            message.setSubject("Xworkz");
            message.setText("Hi Welcome to xworkz");

            Transport.send(message);

            System.out.println("Done");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


