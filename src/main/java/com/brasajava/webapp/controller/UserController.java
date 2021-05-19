package com.brasajava.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/welcome")
    public String welcome(Model model, Principal principal){
        model.addAttribute("helloPage","/user/hello");
        return "index";
    }

    @GetMapping("/hello")
    public String hello(Model model, Principal principal){
        model.addAttribute("name",principal.getName());
        model.addAttribute("indexPage","/user/welcome");
        return "hello";
    }
}
