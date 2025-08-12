package com.xworkz.company.component;

import com.xworkz.company.dto.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class CompanyComponent {
    public CompanyComponent(){
        System.out.println("Running using Component...");
    }

    @RequestMapping("/soap")
    public String getSoap(SoapDTO soapDTO,Model model){
        System.out.println("Name :"+soapDTO.getSoapName()+"Name :"+soapDTO.getPrice());
        System.out.println("Soap is Appling On Body...");
        model.addAttribute("soapdto",soapDTO);
        return "SoapResult";
    }
    @RequestMapping("/bottle")
    public String getBottle(BottleDTO bottleDTO,Model model){
        System.out.println("Name :"+bottleDTO.getBottleName()+"Price :"+bottleDTO.getPrice());
        System.out.println("Filling Water In Bottle....");
        model.addAttribute("bottledto",bottleDTO);
        return "BottleResult";
    }
    @RequestMapping("/butter")
    public String getButter(ButterDTO butterDTO){
        System.out.println("Name :"+butterDTO.getButterName()+"Price :"+butterDTO.getPrice());
        System.out.println("Appling Butter On Bread....");
        return "butter";
    }
    @RequestMapping("/biryani")
    public String getBiryani(BiryanyDTO biryanyDTO,Model model){
        System.out.println("Name :"+biryanyDTO.getBiryaniName()+"Price :"+biryanyDTO.getPrice());
        System.out.println("Eating Biryani..");
        model.addAttribute("biryanidto",biryanyDTO);
        return "BiryaniResult";
    }
    @RequestMapping("/chappal")
    public String getChappal(ChapppalDTO chapppalDTO){
        System.out.println("Name :"+chapppalDTO.getName()+"Price :"+chapppalDTO.getPrice());

        System.out.println("Wearing Chappal..");
        return "chappal";
    }
    @RequestMapping("/chutney")
    public String getChutney(ChutneyDTO chutneyDTO){
        System.out.println("Name :"+chutneyDTO.getName()+"Price :"+chutneyDTO.getPrice());
        System.out.println("Eating Chutney..");
        return "chutney";
    }
    @RequestMapping("/curry")
    public String getCurry( CurryDTO curry){
        System.out.println("Name :"+curry.getName()+"Price :"+curry.getPrice());
        System.out.println("Eating Curry..");
        return "curry";
    }
    @RequestMapping("/egg")
    public String getEgg(EggDTO egg){
        System.out.println("Name :"+egg.getName()+"Price :"+egg.getPrice());
        System.out.println("Eating Egg..");
        return "egg";
    }
    @RequestMapping("/milk")
    public String getMilk(MilkDTO milk){
        System.out.println("Name :"+milk.getName()+"Price :"+milk.getPrice());

        System.out.println("Eating Milk..");
        return "milk";
    }
    @RequestMapping("/onion")
    public String getOnion(OnionDTO onion){
        System.out.println("Name :"+onion.getName()+"Price :"+onion.getPrice());
        System.out.println("Eating Onion..");
        return "onion";
    }
    @RequestMapping("/parotha")
    public String getParotha(ParothaDTO parothaDTO){
        System.out.println("Name :"+parothaDTO.getName()+"Price :"+parothaDTO.getPrice());

        System.out.println("Eating parotha..");
        return "parotha";
    }
    @RequestMapping("/shoe")
    public String getShoe(ShoeDTO shoeDTO){
        System.out.println("Name :"+shoeDTO.getName()+"Price :"+shoeDTO.getPrice());
        System.out.println("Waering Shoe..");
        return "shoe";
    }
    @RequestMapping("/socks")
    public String getSocks(SocksDTO socksDTO){
        System.out.println("Name :"+socksDTO.getName()+"Price :"+socksDTO.getPrice());
        System.out.println("Waering Socks..");
        return "socks";
    }



}
