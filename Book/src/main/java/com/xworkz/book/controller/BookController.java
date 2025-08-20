package com.xworkz.book.controller;

import com.xworkz.book.dto.BookDTO;
import com.xworkz.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import javax.validation.Valid;
import java.util.List;


@Controller
@RequestMapping("/")
public class BookController {
    @Autowired
    BookService bookService;

    @RequestMapping("/book")
    public ModelAndView fetch(@Valid BookDTO bookDTO, BindingResult bindingResult, ModelAndView modelAndView){
        if(bindingResult.hasErrors()){
         List<ObjectError> errors=bindingResult.getAllErrors();
            System.out.println(errors);
            return modelAndView;
        }
        bookService.save(bookDTO);
        modelAndView.addObject("save",bookDTO);
        modelAndView.setViewName("ViewResult");
        return modelAndView;
    }

}
