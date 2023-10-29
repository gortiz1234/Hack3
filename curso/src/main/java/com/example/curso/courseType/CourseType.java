package com.example.curso.courseType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CourseType {
    @Id
    private String name;
    private Long id;
    public CourseType(){}
    public CourseType(String name, Long id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public Long getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(Long id) {
        this.id = id;
    }
}
