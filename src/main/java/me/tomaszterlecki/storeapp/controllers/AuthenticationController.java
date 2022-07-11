package me.tomaszterlecki.storeapp.controllers;

import me.tomaszterlecki.storeapp.services.UserAuthentication;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthenticationController {
    @Autowired
    UserAuthentication userAuthentication;

    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String login (){
        return "login";
    }

    @RequestMapping(value="/login", method = RequestMethod.POST)
    public String main (@RequestParam String login, @RequestParam String password) {
        return userAuthentication.authenticate(login, password) ? "redirect:products" : "login";
    }
}
