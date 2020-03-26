package com.tothenew.jpaAssignment2.controllers;

import com.tothenew.jpaAssignment2.entities.singleTable.BikeSingle;
import com.tothenew.jpaAssignment2.entities.singleTable.CarSingle;
import com.tothenew.jpaAssignment2.repositories.MahindraSingleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SingleClassController {

   @Autowired
   MahindraSingleRepository repository;


    @GetMapping("/single")
    public void mahindra(){
        BikeSingle bike= new BikeSingle();
        bike.setBike("Royal Enfield");
        bike.setAmount(196000);
        bike.setId(1);
        CarSingle car= new CarSingle();
        car.setCar("Mustang");
        car.setAmount(4000000);
        car.setId(2);
        repository.save(car);
        repository.save(bike);
    }


}
