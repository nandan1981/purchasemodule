package com.rent.controller;

import com.rent.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PurchaseController {

    @RequestMapping(value = "/showProductPage/{type}",method = RequestMethod.GET)
    public String showProductPage(@PathVariable(name="type",required = true) String type, Model model){
        model.addAttribute("isEnabledSignUp",true);
        model.addAttribute("isEnabledLogin",true);
        model.addAttribute("isLoggedIn",false);
        return "purchasePage";
    }

    @RequestMapping(value="/LoginPopup")
    public String LoginPopup(Model model){
        model.addAttribute("isEnabledSignUp",true);
        model.addAttribute("isEnabledLogin",true);
        model.addAttribute("isLoggedIn",false);
        //Was testing AOP here
        return "LoginPopup";
    }
    @RequestMapping(value = "postProductAndGetDetails")
    public Product postProductAndGetDetails(){
        return null;
    }

    @RequestMapping(value = "/fetchPurchaseData/{searchKey}")
    public String fetchPurchaseData(Model model, @PathVariable("searchKey") String searchKey){
        model.addAttribute("isLoggedIn",true);
        return "purchasePage";
    }

    @RequestMapping(value = "/insertPurchaseData/{Gadget}")
    public String insertPurchaseData(Model model){
        model.addAttribute("isLoggedIn",true);
        return "purchasePage";
    }

    @RequestMapping(value = "/updatePurchaseData")
    public String updatePurchaseData(Model model){
        model.addAttribute("isLoggedIn",true);
        return "purchasePage";
    }

    @RequestMapping(value = "/deletePurchaseData")
    public String deletePurchaseData(Model model){
        model.addAttribute("isLoggedIn",true);
        return "purchasePage";
    }

}
