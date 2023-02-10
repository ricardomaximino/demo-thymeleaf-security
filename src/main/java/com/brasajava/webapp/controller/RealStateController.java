package com.brasajava.webapp.controller;

import java.util.List;

import com.brasajava.webapp.domain.Property;
import com.brasajava.webapp.service.PropertyService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/realstate")
public class RealStateController {

    private PropertyService service;

    public RealStateController(PropertyService service){
        this.service = service;
    }
    
    @PostMapping
    public Property create(@RequestBody Property property){
        return service.create(property);
    }

    @GetMapping
    public List<Property> findAll(){
        service.create(new Property());
        return service.findAll();
    }
}
