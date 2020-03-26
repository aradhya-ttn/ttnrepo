package com.SoringBootsAssignment.SpringAssignment.welcome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @Autowired
    private WelcomeDaoService service;


    @GetMapping("/welcome")
    public String SpringWelcome(){
        return service.RestWelcome();

    }
}
