package com.xworkz.rajajinagar.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "bag")
public class BagEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String bagname;
    private int bagprice;
    private String bagcolor;
}
