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
    public String getButter(ButterDTO butterDTO,Model model){
        System.out.println("Name :"+butterDTO.getButterName()+"Price :"+butterDTO.getPrice());
        System.out.println("Appling Butter On Bread....");
        model.addAttribute("butterdto",butterDTO);
        return "ButterResult";
    }
    @RequestMapping("/biryani")
    public String getBiryani(BiryanyDTO biryanyDTO,Model model){
        System.out.println("Name :"+biryanyDTO.getBiryaniName()+"Price :"+biryanyDTO.getPrice());
        System.out.println("Eating Biryani..");
        model.addAttribute("biryanidto",biryanyDTO);
        return "BiryaniResult";
    }
    @RequestMapping("/chappal")
    public String getChappal(ChapppalDTO chapppalDTO,Model model){
        System.out.println("Name :"+chapppalDTO.getChappalName()+"Price :"+chapppalDTO.getPrice());
        System.out.println("Wearing Chappal..");
        model.addAttribute("chappaldto",chapppalDTO);
        return "ChappalResult";
    }
    @RequestMapping("/chutney")
    public String getChutney(ChutneyDTO chutneyDTO,Model model){
        System.out.println("Name :"+chutneyDTO.getName()+"Price :"+chutneyDTO.getPrice());
        model.addAttribute("chutneydto",chutneyDTO);
        return "ChutneyResult";
    }
    @RequestMapping("/curry")
    public String getCurry( CurryDTO curry,Model model){
        System.out.println("Name :"+curry.getName()+"Price :"+curry.getPrice());
        System.out.println("Eating Curry..");
        model.addAttribute("currydto",curry);
        return "CurryResult";
    }
    @RequestMapping("/egg")
    public String getEgg(EggDTO egg,Model model){
        System.out.println("Name :"+egg.getName()+"Price :"+egg.getPrice());
        model.addAttribute("eggdto",egg);
        return "EggResult";
    }
    @RequestMapping("/milk")
    public String getMilk(MilkDTO milk,Model model){
        System.out.println("Name :"+milk.getName()+"Price :"+milk.getPrice());
        System.out.println("Eating Milk..");
        model.addAttribute("milkdto",milk);
        return "MilkResult";
    }
    @RequestMapping("/onion")
    public String getOnion(OnionDTO onion,Model model){
        System.out.println("Name :"+onion.getName()+"Price :"+onion.getPrice());
        model.addAttribute("oniondto",onion);
        return "OnionResult";
    }
    @RequestMapping("/parotha")
    public String getParotha(ParothaDTO parothaDTO,Model model){
        System.out.println("Name :"+parothaDTO.getName()+"Price :"+parothaDTO.getPrice());
        System.out.println("Eating parotha..");
        model.addAttribute("parothadto",parothaDTO);
        return "ParothaResult";
    }
    @RequestMapping("/shoe")
    public String getShoe(ShoeDTO shoeDTO,Model model){
        System.out.println("Name :"+shoeDTO.getName()+"Price :"+shoeDTO.getPrice());
        System.out.println("Waering Shoe..");
        model.addAttribute("shoedto",shoeDTO);
        return "ShoeResult";
    }
    @RequestMapping("/socks")
    public String getSocks(SocksDTO socksDTO,Model model){
        System.out.println("Name :"+socksDTO.getName()+"Price :"+socksDTO.getPrice());
        System.out.println("Waering Socks..");
        model.addAttribute("socksdto",socksDTO);
        return "SocksResult";
    }



}
