package com.brasajava.demothymeleafsecurity;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class TestController {

    @GetMapping("/page/hello")
    public ModelAndView hello(ModelAndView model){
        model.addObject("nome","Ricardo");
        model.setViewName("hello");
        return model;
    }
}
