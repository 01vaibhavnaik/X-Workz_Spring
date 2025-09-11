package com.xworkz.hospital.service;

import com.xworkz.hospital.dto.DoctorDTO;
import com.xworkz.hospital.entity.DoctorEntity;
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
import java.util.*;

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

    }

    @Override
    public boolean check(String otp) {
        if(otp.equals(generatedOtp)){
            generatedOtp="";
            return true;
        }else
        {
            return false;
        }
    }


    @Override
    public void saveDetails(DoctorDTO doctorDTO) {
        DoctorEntity doctorEntity=new DoctorEntity();
        doctorEntity.setDocid(doctorDTO.getDocid());
        doctorEntity.setName(doctorDTO.getName());
        doctorEntity.setEmail(doctorDTO.getEmail());
        setDocEmail(doctorEntity.getEmail());
        doctorEntity.setSpecialist(doctorDTO.getSpecialist());
        doctorEntity.setAge(doctorDTO.getAge());
        doctorEntity.setAddress(doctorDTO.getAddress());
        doctorEntity.setProfile(doctorDTO.getProfile());

        hospitalRepository.saveDetails(doctorEntity);

    }

    @Override
    public List<DoctorDTO> viewDetail() {

        List<DoctorEntity> doctorEntities = new HospitalRepositoryImp().viewDetail();

        if (doctorEntities.isEmpty()){
            return null;
        }

        List<DoctorDTO> doctorDTOs = new ArrayList<>();
        for (DoctorEntity entity : doctorEntities) {
            DoctorDTO dto = new DoctorDTO();
            dto.setDocid(entity.getDocid());
            dto.setName(entity.getName());
            dto.setEmail(entity.getEmail());
            dto.setSpecialist(entity.getSpecialist());
            dto.setAge(entity.getAge());
            dto.setAddress(entity.getAddress());
            doctorDTOs.add(dto);
        }

        return doctorDTOs;
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

    private void setDocEmail(String email) {
        final String username = "vaibhavnaik32275@gmail.com";
        final String password = "ndof jelk psyn wnvx";

        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true");

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
            message.setSubject("Hospital");
            message.setText("Hi Doctor");

            Transport.send(message);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}

