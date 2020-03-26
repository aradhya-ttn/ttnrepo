package com.tothenew.jpaAssignment2.entities.tablePerclass;


import javax.persistence.Entity;

@Entity

public class BikeTable extends MahindraTable {
    private String bike;

    public String getBike() {
        return bike;
    }

    public void setBike(String bike) {
        this.bike = bike;
    }
}
