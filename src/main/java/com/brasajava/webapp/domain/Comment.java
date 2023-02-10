package com.brasajava.webapp.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
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
public class Comment implements Likeable, Commentable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    private String subjectId;
    private String userId;

    @Builder.Default
    @OneToMany(targetEntity = Like.class, cascade = CascadeType.ALL)
    // @JoinColumn(name="subjectId", referencedColumnName = "id")
    private List<Like> likeList = new ArrayList<>();
    
    @Builder.Default
    @ManyToMany(targetEntity = Comment.class, cascade = CascadeType.ALL)
    // @JoinColumn(name="subjectId", referencedColumnName = "id")
    private List<Comment> commentList = new ArrayList<>();

    private String message;
    private LocalDate criationDate;
    private LocalDate updateDate;
    
}
