package com.example.curso.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CourseAssessment {
    @Id
    private Long id;
    public CourseAssessment(){}
}
