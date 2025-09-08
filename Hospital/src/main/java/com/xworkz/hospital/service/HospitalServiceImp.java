package com.xworkz.hospital.service;

import com.xworkz.hospital.entity.HospitalEntity;
import com.xworkz.hospital.repository.HospitalRepository;
import com.xworkz.hospital.repository.HospitalRepositoryImp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
import java.util.Random;

@Service
@Slf4j
public class HospitalServiceImp implements HospitalService {
@Autowired
    HospitalRepository hospitalRepository;
    @Override
    public int getDetail(String email) {
        return Math.toIntExact(hospitalRepository.getDetail(email));
    }
    private String generatedOtp=" ";
    @Override
    public void getOtp(String email) {
        int count = getDetail(email);
        if (count > 0) {
            Random random = new Random();
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < 6; i++) {
                builder.append(random.nextInt(10));
            }
            generatedOtp = builder.toString();
            setEmail(email, "Dear User,\n\nThe OTP for you is: " + generatedOtp);
        }
//        hospitalRepository.save(generatedOtp);
    }

    private void setEmail(String recipientEmail,String body) {
        final String username = "vaibhavnaik32275@gmail.com";
        final String password = "ndof jelk psyn wnvx";

        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true");

        Session session = Session.getInstance(prop, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(recipientEmail));
            message.setSubject("Hi Welcome to X-workz");
            message.setText(body);

            Transport.send(message);

            System.out.println("OTP Email Sent Successfully to " + recipientEmail);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

