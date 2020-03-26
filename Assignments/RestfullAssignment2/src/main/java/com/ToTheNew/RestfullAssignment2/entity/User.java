package com.ToTheNew.RestfullAssignment2.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Size;

@ApiModel(description="All Details about user")
public class User {
    private  int id;

    @Size(min =3,message = "name should have atleast three alphabets")
    @ApiModelProperty(notes="minimum alphabet required for name is 3 ")
    private String name;
    @ApiModelProperty(notes = "age should not be negative in number")
    private int age;

    public User(){}

    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
