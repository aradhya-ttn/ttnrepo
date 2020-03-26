package com.ToTheNew.RestfullAssignment2.controllers;

import com.ToTheNew.RestfullAssignment2.daoService.MyUserDao;

import com.ToTheNew.RestfullAssignment2.entity.MyUser;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DynamicFilteringController {

@Autowired
    private MyUserDao myUserDao;


    @PostMapping("/filter")

    public MappingJacksonValue getUserDetail(@RequestBody MyUser myUser){
        myUserDao.getDynamicFilter(myUser);
        MyUser myUser1=new MyUser(myUser.getId(),myUser.getName(),myUser.getPassword());


        SimpleBeanPropertyFilter filter= SimpleBeanPropertyFilter.filterOutAllExcept("id","name");
        FilterProvider filters= new SimpleFilterProvider().addFilter("MyUserFilter",filter);

        MappingJacksonValue mapping= new MappingJacksonValue(myUser1);
        mapping.setFilters(filters);
        return  mapping;
    }

}
