package com.xworkz.hospital.service;

import com.xworkz.hospital.entity.HospitalEntity;

public interface HospitalService {
    int getDetail(String email);
    void getOtp(String email);
    boolean check(String otp);
}
