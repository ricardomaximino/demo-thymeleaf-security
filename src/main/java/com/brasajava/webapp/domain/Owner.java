package com.brasajava.webapp.domain;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    @OneToMany(targetEntity = Contact.class, cascade = CascadeType.ALL)
    @JoinColumn(name="owner_contact_fk", referencedColumnName = "id")
    private List<Contact> contactList;
    @ElementCollection
    private Map<DocumentType, String> documents;

}
