package me.tomaszterlecki.storeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @RequestMapping(value="/main", method = RequestMethod.GET)
    public String main (){
        return "index";
    }

    @RequestMapping(value="/contact", method = RequestMethod.GET)
    public String contact() { return "contact"; }

    @RequestMapping(value="/products", method = RequestMethod.GET)
    public String listProducts{
        return "product-list";
    }
}
