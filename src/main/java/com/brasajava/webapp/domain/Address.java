package com.brasajava.webapp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String country;
    private String state;
    private String city;
    private String town;
    private String street;
    private String number;
    private String cp;
    private String notes;
    private String latitude;
    private String longitude;
    private String address;
}