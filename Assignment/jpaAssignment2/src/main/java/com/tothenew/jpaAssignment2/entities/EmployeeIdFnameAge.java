package com.tothenew.jpaAssignment2.entities;

public class EmployeeIdFnameAge {
     private Integer id ;
     private String firstname;
     private Integer age;

    public EmployeeIdFnameAge(Integer id, String firstname, Integer age) {
        this.id = id;
        this.firstname = firstname;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
