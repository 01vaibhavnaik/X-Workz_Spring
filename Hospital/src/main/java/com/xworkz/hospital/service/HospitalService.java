package com.xworkz.hospital.service;

import com.xworkz.hospital.dto.DoctorDTO;
import com.xworkz.hospital.dto.TimeSlotDTO;
import com.xworkz.hospital.entity.HospitalEntity;

import java.util.List;

public interface HospitalService {
    int getDetail(String email);
    void getOtp(String email);
    void saveDetails(DoctorDTO doctorDTO);
    List<DoctorDTO> viewDetail();
    boolean logIn(String otp,String email);
    void saveSlot(TimeSlotDTO slotDTO);
}
