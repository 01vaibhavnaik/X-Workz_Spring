package com.xworkz.company.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class CompanyComponent {
    public CompanyComponent(){
        System.out.println("Running using Component...");
    }

    @RequestMapping("/soap")
    public String getSoap(@RequestParam String soap,@RequestParam int price){
        System.out.println("Name :"+soap);
        System.out.println("Price :"+price);
        System.out.println("Soap is Appling On Body...");
        return "soap.jsp";
    }
    @RequestMapping("/bottle")
    public String getBottle(@RequestParam String botttleName,@RequestParam int price){
        System.out.println("Name :"+botttleName);
        System.out.println("Price :"+price);
        System.out.println("Filling Water In Bottle....");
        return "bottle.jsp";
    }
    @RequestMapping("/butter")
    public String getButter(@RequestParam String butterName,@RequestParam int price ){
        System.out.println("Name :"+butterName);
        System.out.println("Price :"+price);
        System.out.println("Appling Butter On Bread....");
        return "butter.jsp";
    }
    @RequestMapping("/biryani")
    public String getBiryani(@RequestParam String biryaniName,@RequestParam int price){
        System.out.println("Name :"+biryaniName);
        System.out.println("Price :"+price);
        System.out.println("Eating Biryani..");
        return "biryani.jsp";
    }
    @RequestMapping("/chappal")
    public String getChappal(@RequestParam String chappalName,@RequestParam int price ){
        System.out.println("Name :"+chappalName);
        System.out.println("Price :"+price);
        System.out.println("Wearing Chappal..");
        return "chappal.jsp";
    }
    @RequestMapping("/chutney")
    public String getChutney(@RequestParam String chutney,@RequestParam int price){
        System.out.println("Name :"+chutney);
        System.out.println("Price :"+price);
        System.out.println("Eating Chutney..");
        return "chutney.jsp";
    }
    @RequestMapping("/curry")
    public String getCurry(@RequestParam String curry,@RequestParam int price){
        System.out.println("Name :"+curry);
        System.out.println("Price :"+price);
        System.out.println("Eating Curry..");
        return "curry.jsp";
    }
    @RequestMapping("/egg")
    public String getEgg(@RequestParam String egg,@RequestParam int price){
        System.out.println("Name :"+egg);
        System.out.println("Price :"+price);
        System.out.println("Eating Egg..");
        return "egg.jsp";
    }
    @RequestMapping("/milk")
    public String getMilk(@RequestParam String milk,@RequestParam int price){
        System.out.println("Name :"+milk);
        System.out.println("Price :"+price);
        System.out.println("Eating Milk..");
        return "milk.jsp";
    }
    @RequestMapping("/onion")
    public String getOnion(@RequestParam String onion,@RequestParam int price){
        System.out.println("Name :"+onion);
        System.out.println("Price :"+price);
        System.out.println("Eating Onion..");
        return "onion.jsp";
    }
    @RequestMapping("/parotha")
    public String getParotha(@RequestParam String parotha,@RequestParam int price){
        System.out.println("Name :"+parotha);
        System.out.println("Price :"+price);
        System.out.println("Eating parotha..");
        return "parotha.jsp";
    }
    @RequestMapping("/shoe")
    public String getShoe(@RequestParam String shoe,@RequestParam int price){
        System.out.println("Name :"+shoe);
        System.out.println("Price :"+price);
        System.out.println("Waering Shoe..");
        return "shoe.jsp";
    }
    @RequestMapping("/socks")
    public String getSocks(@RequestParam String scoks,@RequestParam int price){
        System.out.println("Name :"+scoks);
        System.out.println("Price :"+price);
        System.out.println("Waering Socks..");
        return "socks.jsp";
    }

}
