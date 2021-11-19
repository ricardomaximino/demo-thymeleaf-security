package com.brasajava.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;

@Controller
@RequestMapping("/public")
public class PublicController {

    @GetMapping("/welcome")
    public String welcome(Model model){
        model.addAttribute("helloPage","/public/hello");
        return "index";
    }

    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("indexPage","/public/welcome");
        return "hello";
    }

    @GetMapping("/portifolio")
    public String portifolio(Model model){
        model.addAttribute("brand","Ricardo Maximino");
        return "portifolio";
    }
}
