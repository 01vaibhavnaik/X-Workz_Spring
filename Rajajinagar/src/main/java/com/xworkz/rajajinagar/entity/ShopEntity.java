package com.xworkz.rajajinagar.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "shop")
public class ShopEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String shopname;
    private String shoploc;
    private String shopemail;
    private long shophno;
    private int openingtime;
    private int closingtime;
}
