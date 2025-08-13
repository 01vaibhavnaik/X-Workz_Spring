package com.xworkz.form.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "user_table")

public class FormEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name ="user_name")
    private String name;
    @Column(name ="user_email")
    private String email;
    @Column(name ="user_age")
    private int age;
    @Column(name ="user_address")
    private String address;
    @Column(name ="user_salary")
    private int salary;


}
