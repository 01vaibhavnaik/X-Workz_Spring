package com.xworkz.hospital.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "doctor")
@NamedQuery(name = "viewdetail",query = "select e from DoctorEntity e")
public class DoctorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int docid;
    private String name;
    private String email;
    private String specialist;
    private int age;
    private String address;
    @Column(name = "profile")
    private String profile;
}
