package com.xworkz.rajajinagar.controller;

import com.xworkz.rajajinagar.dto.FlowerDTO;
import com.xworkz.rajajinagar.dto.ShopDTO;
import com.xworkz.rajajinagar.service.FlowerService;
import com.xworkz.rajajinagar.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;


@Controller
@RequestMapping("/")
public class RajajinagarController {
    public RajajinagarController(){
        System.out.println("Running Rajajinagar Class in Controller ");
    }

    @Autowired
    private ShopService shopService;
    @Autowired
    private FlowerService flowerService;

    @RequestMapping("/shop")
    public ModelAndView getShop(@Valid @ModelAttribute("shopdto") ShopDTO shopDTO, BindingResult bindingResult, ModelAndView model) {

        if (bindingResult.hasErrors()) {
            model.setViewName("Shop");
            return model;
        }

        shopService.save(shopDTO);
        model.addObject("shopdto", shopDTO);
        model.setViewName("ShopResult");
        return model;
    }



    @RequestMapping("/flower")
    public ModelAndView getFlower(@Valid @ModelAttribute("flowerdto")  FlowerDTO flowerDTO,BindingResult bindingResult,ModelAndView modelAndView){

        if(bindingResult.hasErrors()){
            modelAndView.setViewName("Flower");
            return modelAndView;
        }
        flowerService.saveFlower(flowerDTO);
        modelAndView.addObject("flowerdto",flowerDTO);
        modelAndView.setViewName("FlowerResult");
        return modelAndView;
    }


}
