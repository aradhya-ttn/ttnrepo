package com.SoringBootsAssignment.SpringAssignment.welcome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@Component
public class WelcomeDaoService {

    public String RestWelcome(){
        return "Welcome to spring boot";
    }
}