package com.xworkz.form.service;

import com.xworkz.form.dto.FormDTO;
import com.xworkz.form.entity.FormEntity;
import com.xworkz.form.repositiory.FormRepo;
import com.xworkz.form.repositiory.FormRepoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormServiceImpl implements  FormService {
@Autowired
private  FormRepo formRepo;

    @Override
    public boolean validateAndSave(FormDTO formDTO) {
        System.out.println(formDTO.toString());
        FormEntity formEntity = new FormEntity();
        formEntity.setName(formDTO.getName());
formEntity.setAge(formDTO.getAge());
formEntity.setEmail(formDTO.getEmail());
formEntity.setAddress(formDTO.getAddress());
formEntity.setSalary(formDTO.getSalary());


           formRepo.save(formEntity);
        return false;
    }
}
