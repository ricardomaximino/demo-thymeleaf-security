package com.brasajava.webapp.service;

import java.util.List;
import java.util.Optional;

import com.brasajava.webapp.domain.Property;

public interface PropertyService {

    public Property create(Property Property);
    public Property update(Property property);
    public boolean delete(String id);
    public Optional<Property> findById(String id);
    public List<Property> findAll();
}
