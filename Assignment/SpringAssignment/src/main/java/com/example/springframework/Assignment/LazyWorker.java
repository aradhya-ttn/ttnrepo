package com.example.springframework.Assignment;

import org.springframework.stereotype.Component;

@Component
public class LazyWorker implements Worker {


    public void doWork() {
        System.out.println("Lazy Worker is doing job");

    }
}
