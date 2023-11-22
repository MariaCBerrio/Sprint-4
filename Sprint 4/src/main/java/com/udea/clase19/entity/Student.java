package com.udea.clase19.entity;
import jakarta.persistence.*;

@Entity
@Table (name = "student")
public class Student {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String name;
    @Column
    private String surName;
    @Column
    private int age;
    @Column
    private String degree;
    @Column
    private boolean available;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSurName(){return surName;}
    public void setSurName(String surName){this.surName = surName;}

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getDegree(){return degree;}
    public void setDegree(String degree){this.degree = degree;}

    public boolean isAvailable() {
        return available;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }
}
