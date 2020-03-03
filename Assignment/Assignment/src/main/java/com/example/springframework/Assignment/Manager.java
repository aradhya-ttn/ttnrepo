package com.example.springframework.Assignment;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

//(3) Use @Compenent and @Autowired annotations to in Loosely Coupled code for dependency management

@Component
public class Manager {
    @Autowired
    private Worker worker;
//(6) Perform Constructor Injection in a Spring Bean
    public Manager(Worker worker) {
        this.worker=worker;

    }
//
//    public Manager(ExcellentWorker excellentWorker) {
//        this.excellentWorker=excellentWorker;
//    }

    public  void myCall(){
        worker.doWork();
//        excellentWorker.doWork();
    }

}
