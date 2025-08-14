package com.xworkz.form.service;

import com.xworkz.form.dto.LoanFormDTO;
import com.xworkz.form.entity.LoanFormEntity;

import java.util.List;

public interface LoanFormService {
    boolean validate(LoanFormDTO loanFormDTO);
    List<LoanFormEntity> getAll();
    boolean deleteById(int id);
}
