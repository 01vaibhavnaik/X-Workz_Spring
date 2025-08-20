package com.xworkz.rajajinagar.controller;

import com.xworkz.rajajinagar.dto.BagDTO;
import com.xworkz.rajajinagar.service.BagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/")
public class BagController {
        @Autowired
          BagService bagService;


    @RequestMapping("/bag")
    public ModelAndView getBag(@Valid BagDTO bagDTO, BindingResult bindingResult, ModelAndView modelAndView) {
        if (bindingResult.hasErrors()) {
            modelAndView.addObject("errors", bindingResult.getAllErrors());
            modelAndView.setViewName("BagResult");
            return modelAndView;
        }

        bagService.getBag(bagDTO);
        modelAndView.addObject("bagdto",bagDTO);
        modelAndView.setViewName("Bag");
        return modelAndView;
    }
}