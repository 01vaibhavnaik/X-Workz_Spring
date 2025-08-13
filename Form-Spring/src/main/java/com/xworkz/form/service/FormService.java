package com.xworkz.form.service;

import com.xworkz.form.dto.FormDTO;

public interface FormService {

    boolean validateAndSave(FormDTO formDTO);

}
