package com.xworkz.page.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "xworkzsignup")
@NamedQuery(name="signIn",query = "select e from SignUpEntity e where email=:email")
public class SignUpEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    private String email;
    private  int age;
    private String gender;
    private String address;
    private String password;
}
