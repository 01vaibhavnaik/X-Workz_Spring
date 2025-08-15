package com.xworkz.form.component;

import com.xworkz.form.dto.FormDTO;
import com.xworkz.form.service.FormService;
import com.xworkz.form.service.FormServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Controller
@RequestMapping("/")
public class FormController implements WebMvcConfigurer {
    @Autowired
    private FormService formService;

    @RequestMapping("/personform")
    public String getForm(FormDTO formDTO, Model model) {
        System.out.println("Name :" + formDTO.getName() + "\nEmail :" + formDTO.getEmail() + "\nAge :" + formDTO.getAge() + "\nAddress :" + formDTO.getAddress() + "\nSalary :" + formDTO.getSalary());
        model.addAttribute("persondetail", formDTO);
        formService.validateAndSave(formDTO);
        return "PersonResult";
    }

}
