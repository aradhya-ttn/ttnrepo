package com.tothenew.jpaAssignment2.controllers;

import com.tothenew.jpaAssignment2.entities.singleTable.BikeSingle;
import com.tothenew.jpaAssignment2.entities.singleTable.CarSingle;
import com.tothenew.jpaAssignment2.entities.tablePerclass.BikeTable;
import com.tothenew.jpaAssignment2.entities.tablePerclass.CarTable;
import com.tothenew.jpaAssignment2.repositories.MahindraTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TableClassController {

    @Autowired
    MahindraTableRepository mahindraTableRepository;

    @GetMapping("/table/bike")
    public void tableClass() {
        BikeTable bike = new BikeTable();
        bike.setBike("Royal Enfield");
        bike.setAmount(196000);
        bike.setId(1);
        mahindraTableRepository.save(bike);

    }

    @GetMapping("/table/car")
    public void mahindra() {
        CarTable car= new CarTable();
        car.setCar("Mustang");
        car.setAmount(4000000);
        car.setId(2);
       mahindraTableRepository.save(car);

    }


}


