package com.xworkz.hospital.repository;

import com.xworkz.hospital.entity.DoctorEntity;
import com.xworkz.hospital.entity.HospitalEntity;

import java.util.List;

public interface HospitalRepository {
    long getDetail(String email);
    void saveDetails(DoctorEntity doctorEntity);
    List<DoctorEntity> viewDetail();
}
