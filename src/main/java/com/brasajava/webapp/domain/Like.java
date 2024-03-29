package com.brasajava.webapp.domain;

import java.time.LocalDate;

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
public class Like {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String subjectId;
    private String userId;
    private LocalDate criationDate;
    private LocalDate updateDate;
}
