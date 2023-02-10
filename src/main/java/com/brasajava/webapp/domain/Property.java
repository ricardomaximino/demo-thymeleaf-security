package com.brasajava.webapp.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Property {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    // @ManyToOne(targetEntity = Owner.class, cascade = CascadeType.ALL)
    // @JoinColumn(name="property_owner_fk", referencedColumnName = "id")
    // private List<Owner> ownerList;

    // @OneToOne(targetEntity = Address.class, cascade = CascadeType.ALL)
    // @JoinColumn(name="property_address_fk", referencedColumnName = "id")
    // private Address address;

    private String type;
    private Double price;
    private Long surface;
    private LocalDate criationDate;
    private LocalDate updateDate;

    // @Builder.Default
    // @ElementCollection
    // private List<String> photoList = new ArrayList<>();

    // @Builder.Default
    // @ElementCollection
    // private List<String> videoList = new ArrayList<>();

    // @Builder.Default
    // @OneToMany(targetEntity = Comment.class, cascade = CascadeType.ALL)
    // @JoinColumn(name="propert_cs_fk", referencedColumnName = "id")
    // private List<Comment> commentList = new ArrayList<>();

    // @Builder.Default
    // @OneToMany(targetEntity = Like.class, cascade = CascadeType.ALL)
    // @JoinColumn(name="property_ls_fk", referencedColumnName = "id")
    // private List<Like> likeList = new ArrayList<>();
    
    // @Builder.Default
    // @ElementCollection
    // private Map<PropertyAttributeType, String> attributes = new HashMap<>();
    // private boolean available;

}
