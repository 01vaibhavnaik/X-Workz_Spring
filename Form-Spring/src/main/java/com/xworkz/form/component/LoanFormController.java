package com.xworkz.form.component;

import com.xworkz.form.dto.LoanFormDTO;
import com.xworkz.form.service.LoanFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class LoanFormController {
@Autowired
private LoanFormService loanFormService;

    @RequestMapping("/loanform")
    public String getLoan(LoanFormDTO loanFormDTO, Model model){
        System.out.println("LoanType :"+loanFormDTO.getLoantype()+"\nFull Name :"+loanFormDTO.getName()+"\nAge :"+loanFormDTO.getAge()+"\nEmail :"+loanFormDTO.getEmail()+"\nAddress :"+loanFormDTO.getAddress()+"\nMonthly Income :"+loanFormDTO.getIncome()+"\nAmount Req :"+loanFormDTO.getAmount()+"\nPeriod Of Time :"+loanFormDTO.getRepayment());
        model.addAttribute("loandetail",loanFormDTO);
        loanFormService.validate(loanFormDTO);
        return "LoanResult";
    }
}
