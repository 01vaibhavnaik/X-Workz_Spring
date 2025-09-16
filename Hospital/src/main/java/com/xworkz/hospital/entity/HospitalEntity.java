package com.xworkz.hospital.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "hospital")
@Entity
@NamedQuery(name="findByEmail",query = "select e from HospitalEntity e ")
@NamedQuery(name = "Counts",query = "select count(e) from HospitalEntity e where email=:email")
@NamedQuery(name = "findEmail", query = "SELECT h FROM HospitalEntity h WHERE h.email = :email")
@NamedQuery(name = "update",query = "update HospitalEntity e set e.otpnum=:otpnum,e.time=:time where email =:email")
public class HospitalEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String email;
    private String otpnum;
    private LocalDateTime time;
}
