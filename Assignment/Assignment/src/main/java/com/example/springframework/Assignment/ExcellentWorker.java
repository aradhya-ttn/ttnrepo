package com.example.springframework.Assignment;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
//(5) Demonstrate how you will resolve ambiguity while autowiring bean (Hint : @Primary)
@Component
@Primary
public class ExcellentWorker implements Worker {

    public void doWork(){
        System.out.println("Excellent Worker is doing job");

    }
}
