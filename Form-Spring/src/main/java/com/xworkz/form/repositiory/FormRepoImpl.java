package com.xworkz.form.repositiory;

import com.xworkz.form.entity.FormEntity;
import org.springframework.stereotype.Repository;

@Repository
public class FormRepoImpl implements  FormRepo{


    @Override
    public boolean save(FormEntity formEntity) {
        System.out.println("formEntity=="+formEntity.toString() );
        return false;
    }
}
