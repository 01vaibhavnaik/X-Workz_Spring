package com.xworkz.rajajinagar.controller;

import com.xworkz.rajajinagar.dto.ShopDTO;
import com.xworkz.rajajinagar.service.ShopService;
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
public class ShopController {
    public ShopController(){
        System.out.println("Running Rajajinagar Class in Controller ");
    }

    @Autowired
    private ShopService shopService;

    @RequestMapping("/shop")
    public ModelAndView getShop(@Valid ShopDTO shopDTO, BindingResult bindingResult, ModelAndView model) {

        if (bindingResult.hasErrors()) {
            List<ObjectError> errors = bindingResult.getAllErrors();
            model.addObject("errors", errors);
            model.setViewName("ShopResult");
            System.out.println(errors);
            return model;
        }

        shopService.save(shopDTO);
        model.addObject("shopdto", shopDTO);
        model.setViewName("ShopResult");
        return model;
    }





}
