package com.xworkz.hospital.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "hospital")
@Entity
@NamedQuery(name="findEmail",query = "select e from HospitalEntity e where email=:email")
@NamedQuery(name = "Counts",query = "select count(e) from HospitalEntity e where email=:email")
public class HospitalEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String email;
}
