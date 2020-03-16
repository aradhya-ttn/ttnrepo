package com.tothenew.jpaAssignment2.entities.tablePerclass;


import javax.persistence.Entity;

@Entity

public class CarTable extends MahindraTable {
    private String car;

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }
}
