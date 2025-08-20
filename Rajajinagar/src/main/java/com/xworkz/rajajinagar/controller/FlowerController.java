package com.xworkz.rajajinagar.controller;

import com.xworkz.rajajinagar.dto.FlowerDTO;
import com.xworkz.rajajinagar.service.FlowerService;
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
public class FlowerController {

@Autowired
    FlowerService flowerService;


    @RequestMapping("flower")
    public ModelAndView getFlower(@Valid FlowerDTO flowerDTO,BindingResult bindingResult , ModelAndView modelAndView ){

        if(bindingResult.hasErrors()){
            modelAndView.addObject("flowererrors",bindingResult.getAllErrors());
            modelAndView.setViewName("FlowerResult");
            return  modelAndView;
        }

        flowerService.saveFlower(flowerDTO);
        modelAndView.addObject("flowerdto",flowerDTO);
        modelAndView.setViewName("FlowerResult");
        return modelAndView;
    }
}
