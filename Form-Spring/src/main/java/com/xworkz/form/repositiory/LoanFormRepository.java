package com.xworkz.form.repositiory;

import com.xworkz.form.dto.LoanFormDTO;
import com.xworkz.form.entity.LoanFormEntity;

import java.util.List;

public interface LoanFormRepository {
    boolean save(LoanFormEntity loanFormEntity);
    List<LoanFormEntity> getAll();
    boolean deleteById(int id);
    boolean updateAddressById(int id,String address);
    boolean updateAAEByName(String name,int age,String address,String email);
    List<LoanFormEntity> getAgeBetLoanDetails();
    LoanFormEntity getEmailAddressByName(String name);

}
