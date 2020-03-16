package com.tothenew.jpaAssignment2.controllers;

import com.tothenew.jpaAssignment2.entities.joinedTable.BikeJoined;
import com.tothenew.jpaAssignment2.entities.joinedTable.CarJoined;
import com.tothenew.jpaAssignment2.entities.tablePerclass.BikeTable;
import com.tothenew.jpaAssignment2.entities.tablePerclass.CarTable;
import com.tothenew.jpaAssignment2.repositories.MahindraJoinedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JoinedClassController {

    @Autowired
    MahindraJoinedRepository  mahindraJoinedRepository;

    @GetMapping("/joined/bike")
    public void tableClass() {
        BikeJoined bike = new BikeJoined();
        bike.setBike("Royal Enfield");
        bike.setAmount(196000);
        bike.setId(1);
        mahindraJoinedRepository.save(bike);

    }

    @GetMapping("/joined/car")
    public void mahindra() {
        CarJoined car = new CarJoined();
        car.setCar("Mustang");
        car.setAmount(4000000);
        car.setId(2);
        mahindraJoinedRepository.save(car);

    }

}
