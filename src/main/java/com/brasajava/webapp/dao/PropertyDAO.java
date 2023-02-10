package com.brasajava.webapp.dao;

import com.brasajava.webapp.domain.Property;

import org.springframework.data.repository.CrudRepository;

public interface PropertyDAO extends CrudRepository<Property, String> {
    
}
