package com.xworkz.form.service;

import com.xworkz.form.dto.LoanFormDTO;
import com.xworkz.form.entity.FormEntity;
import com.xworkz.form.entity.LoanFormEntity;
import com.xworkz.form.repositiory.LoanFormRepository;
import com.xworkz.form.repositiory.LoanFormRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class LoanFormServiceImpl implements  LoanFormService{

    @Autowired
    private LoanFormRepository loanFormRepository;

    public boolean validate(LoanFormDTO loanFormDTO) {
        System.out.println("Running In Service....");
        System.out.println("LoanType :"+loanFormDTO.getLoantype()+"  Full Name :"+loanFormDTO.getName()+"  Age :"+loanFormDTO.getAge()+"  Email :"+loanFormDTO.getEmail()+"  Address :"+loanFormDTO.getAddress()+"  Monthly Income :"+loanFormDTO.getIncome()+"  Amount Req :"+loanFormDTO.getAmount()+"  Period Of Time :"+loanFormDTO.getRepayment());
        LoanFormEntity loanFormEntity=new LoanFormEntity();
        loanFormEntity.setLoantype(loanFormDTO.getLoantype());
        loanFormEntity.setName(loanFormDTO.getName());
        loanFormEntity.setAge(loanFormDTO.getAge());
        loanFormEntity.setEmail(loanFormDTO.getEmail());
        loanFormEntity.setAddress(loanFormDTO.getAddress());
        loanFormEntity.setIncome(loanFormDTO.getIncome());
        loanFormEntity.setAmount(loanFormDTO.getAmount());
        loanFormEntity.setRepayment(loanFormDTO.getRepayment());

        loanFormRepository.save(loanFormEntity);

        return false;
    }

    @Override
    public List<LoanFormEntity> getAll() {
        return new LoanFormRepositoryImpl().getAll();
    }

    @Override
    public boolean deleteById(int id) {
        loanFormRepository.deleteById(id);
        return false ;
    }
}
