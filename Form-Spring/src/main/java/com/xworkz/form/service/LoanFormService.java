package com.xworkz.form.service;

import com.xworkz.form.dto.LoanFormDTO;

public interface LoanFormService {
    boolean validate(LoanFormDTO loanFormDTO);
}
