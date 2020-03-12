package com.tothenew.Assignmentjpa.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//(1) Create an Employee Entity which contains following fields
//        Name
//        Id
//        Age
//        Location

@Entity
@Table
public class Employee {

    @Id
    private Integer id;
    private String name;
    private Integer age;
    private String location;

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
