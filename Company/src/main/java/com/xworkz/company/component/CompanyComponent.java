package com.xworkz.company.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
@Component
@RequestMapping("/")
public class CompanyComponent {
    public CompanyComponent(){
        System.out.println("Running using Component...");
    }

    @RequestMapping("/soap")
    public String getSoap(){
        System.out.println("Soap is Appling On Body...");
        return "soap.jsp";
    }
    @RequestMapping("/bottle")
    public String getBottle(){
        System.out.println("Filling Water In Bottle....");
        return "bottle.jsp";
    }
    @RequestMapping("/butter")
    public String getButter(){
        System.out.println("Appling Butter On Bread....");
        return "butter.jsp";
    }
    @RequestMapping("/biryani")
    public String getBiryani(){
        System.out.println("Eating Biryani..");
        return "biryani.jsp";
    }
    @RequestMapping("/chappal")
    public String getChappal(){
        System.out.println("Wearing Chappal..");
        return "chappal.jsp";
    }
    @RequestMapping("/chutney")
    public String getChutney(){
        System.out.println("Eating Chutney..");
        return "chutney.jsp";
    }
    @RequestMapping("/curry")
    public String getCurry(){
        System.out.println("Eating Curry..");
        return "curry.jsp";
    }
    @RequestMapping("/egg")
    public String getEgg(){
        System.out.println("Eating Egg..");
        return "egg.jsp";
    }
    @RequestMapping("/milk")
    public String getMilk(){
        System.out.println("Eating Milk..");
        return "milk.jsp";
    }
    @RequestMapping("/onion")
    public String getOnion(){
        System.out.println("Eating Onion..");
        return "onion.jsp";
    }
    @RequestMapping("/parotha")
    public String getParotha(){
        System.out.println("Eating parotha..");
        return "parotha.jsp";
    }
    @RequestMapping("/shoe")
    public String getShoe(){
        System.out.println("Waering Shoe..");
        return "shoe.jsp";
    }
    @RequestMapping("/socks")
    public String getSocks(){
        System.out.println("Waering Socks..");
        return "socks.jsp";
    }

}
