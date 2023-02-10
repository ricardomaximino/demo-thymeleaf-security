package com.brasajava.webapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.brasajava.webapp.dao.PropertyDAO;
import com.brasajava.webapp.domain.Property;

import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service
public class PropertyServiceImp implements PropertyService {
    private PropertyDAO dao;
    public PropertyServiceImp(PropertyDAO dao){
        Assert.notNull(dao, "The DAO cannot be null");

        this.dao = dao;
    }

    @Override
    public Property create(Property property) {
        Assert.notNull(dao, "The property object cannot be null");
        property.setId(UUID.randomUUID().toString());
        return dao.save(property);
    }

    @Override
    public Property update(Property property) {
        Assert.notNull(dao, "The property object cannot be null");
        Assert.notNull(dao, "The property.id field cannot be null");
        if(dao.existsById(property.getId())){
            return dao.save(property);
        }else{
            throw new RuntimeException("Property with Id: " + property.getId() + " not found!");
        }
    }

    @Override
    public boolean delete(String id) {
        dao.deleteById(id);
        return true;
    }

    @Override
    public Optional<Property> findById(String id) {
        return dao.findById(id);
    }

    @Override
    public List<Property> findAll() {
        List<Property> list = new ArrayList<>();
        dao.findAll().forEach(p -> list.add(p));
        return list;
    }
    
}
