package com.xworkz.hospital.service;

import com.xworkz.hospital.dto.DoctorDTO;
import com.xworkz.hospital.entity.HospitalEntity;

import java.util.List;

public interface HospitalService {
    int getDetail(String email);
    void getOtp(String email);
    boolean check(String otp);
    void saveDetails(DoctorDTO doctorDTO);
    List<DoctorDTO> viewDetail();
}
