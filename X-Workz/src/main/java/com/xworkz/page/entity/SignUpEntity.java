package com.xworkz.page.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "xworkzsignup")
@NamedQuery(name="signIn",query = "select e from SignUpEntity e where email=:email")
@NamedQuery(name = "UpdatePass",query = "update SignUpEntity e set e.password=:password where email =:email")
@NamedQuery(name = "UpdateDetail",query = "update SignUpEntity e set e.name=:name,e.age=:age,e.address=:address where email =:email")
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
    private int is_lock=0;
    private LocalDateTime local_date_time;
}
