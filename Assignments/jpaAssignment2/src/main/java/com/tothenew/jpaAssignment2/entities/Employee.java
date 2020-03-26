package com.tothenew.jpaAssignment2.entities;

import com.fasterxml.jackson.annotation.JsonFilter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employeetable")
public class Employee {
    public Employee() {
    }

    @Id
    @Column(name = "empid")
    private Integer id;
    @Column(name = "empfirstname")
    private String firstname;

//    public Employee(Integer id, String firstname, String lastname, Double salary, Integer age) {
//        this.id = id;
//        this.firstname = firstname;
//        this.lastname = lastname;
//        this.salary = salary;
//        this.age = age;
//    }

    @Column(name = "emplastname")
    private String lastname;

    @Column(name = "empsalary")
    private Integer salary;

    @Column(name = "empage")
    private  Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getfirstname() {
        return firstname;
    }

    public void setfirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getlastname() {
        return lastname;
    }

    public void setlastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstname + '\'' +
                ", lastName='" + lastname + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
