package com.xworkz.form.component;

import com.xworkz.form.dto.LoanFormDTO;
import com.xworkz.form.entity.LoanFormEntity;
import com.xworkz.form.service.LoanFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

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
    @RequestMapping("/getAllLoanDetails")
    public ModelAndView getAll(ModelAndView modelAndView){
        List<LoanFormEntity> list=loanFormService.getAll();
        modelAndView.addObject("loandto",list);
        modelAndView.setViewName("GetLoanFormDetail");
        return modelAndView;
    }
     @RequestMapping("/deleteById")
     public String deleteById(int id) {
        loanFormService.deleteById(id);
        return "redirect:/getAllLoanDetails";
    }
    @RequestMapping("/updateAddressById")
    public String updateAddressById(int id,String address) {
        loanFormService.updateAddressById(id,address);
        return "redirect:/getAllLoanDetails";
    }

    @RequestMapping("/updateAAEByName")
    public String updateAAEByName(String name,int age,String address,String email) {
        loanFormService.updateAAEByName(name,age,address,email);
        return "redirect:/getAllLoanDetails";
    }
    @RequestMapping("/getAgeBetLoanDetails")
    public ModelAndView getAgeBetLoanDetails(ModelAndView modelAndView) {
        List<LoanFormEntity> list= loanFormService.getAgeBetLoanDetails();
        modelAndView.addObject("loandto",list);
        modelAndView.setViewName("GetLoanFormDetail");
        return modelAndView;
    }
    @RequestMapping("/getEmailAddressByName")
    public ModelAndView getEmailAddressByName(String name,ModelAndView modelAndView) {
        LoanFormEntity loanFormEntity=loanFormService.getEmailAddressByName(name);
        modelAndView.addObject("loandto",loanFormEntity);
        modelAndView.setViewName("ResultByName");
        return modelAndView;
    }
}
