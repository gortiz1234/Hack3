package com.example.curso.periodo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Periodo {
    @Id
    private Long id;
    private String name;
    private String code;
    public Periodo() {}
    public Periodo(Long id,String name, String code) {
        this.id = id;
        this.name=name;
        this.code=code;
    }
    //getters and setters

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
       
}
