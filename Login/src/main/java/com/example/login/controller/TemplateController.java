package com.example.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TemplateController {

    @RequestMapping("/login")
    public String login(@ModelAttribute("userdata") User user){
        System.out.println(user.getUsername()+" , "+user.getPassword());
//        return "redirect:index";
        return "view/login";
    }


    @RequestMapping(value = "/")
    public String index(Model model) {

        model.addAttribute("userdata",new User());
        return "index";
    }
//    @RequestMapping(value = "/contact")
//    public String contact() {
//        return "view/contact";
//    }


}
