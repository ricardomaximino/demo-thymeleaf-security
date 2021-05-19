package com.brasajava.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;
import java.time.LocalDateTime;
import java.util.Date;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/welcome")
    public String welcome(Model model, Principal principal){
        model.addAttribute("helloPage","/admin/hello");
        model.addAttribute("datetime", new Date());
        return "index";
    }

    @GetMapping("/hello")
    public String hello(Model model, Principal principal){
        model.addAttribute("name",principal.getName());
        model.addAttribute("indexPage","/admin/welcome");
        model.addAttribute("datetime", new Date());
        return "hello";
    }

}
