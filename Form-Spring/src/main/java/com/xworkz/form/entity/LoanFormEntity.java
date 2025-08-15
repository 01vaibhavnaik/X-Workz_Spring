package com.xworkz.form.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "loanform")
@NamedQuery(name = "GetAllLoanDetail",query = "select e from LoanFormEntity e ")
@NamedQuery(name = "UpdateAddressByID",query = "update LoanFormEntity e set e.address =: Address WHERE e.id =: Id")
@NamedQuery(name = "UpdateByName",query = "update LoanFormEntity e set e.age =:Age,e.address =:Address,e.email=:Email  WHERE name =: Name")
@NamedQuery(name = "GetDetailByAge",query = "select e from LoanFormEntity e where e.age between 21 and 29")
@NamedQuery(name = "getEmailAddressByName",query = "select e from LoanFormEntity e where name=: Name")
public class LoanFormEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    @Column
    private String loantype;
    private String name;
    private int age;
    private String email;
    private String address;
    private int income;
    private int amount;
    private String repayment;
}
