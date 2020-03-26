package com.ToTheNew.RestfullAssignment2.controllers;

import com.ToTheNew.RestfullAssignment2.entity.User;
import com.ToTheNew.RestfullAssignment2.entity.UserVersioning1;
import com.ToTheNew.RestfullAssignment2.entity.UserVersioning2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserVersioningController {
//     10. Create 2 API for showing user details. The first api should return only basic details of the user and the other API should return more/enhanced details of the user,
//    Now apply versioning using the following methods:
//    URI versioning------------------------------------------------------------------------>
    @GetMapping("/v1")
    public UserVersioning1 userVersioning1(){
        return new UserVersioning1("aradhya");
    }
    @GetMapping("/v2")
    public UserVersioning2 userVersioning2(){
        return new UserVersioning2(new User(1,"aradhya",21));
    }
//    Request Parameter versioning-------------------------------------------------------------->

    @GetMapping(value = "/user/param",params = "version=1")
    public UserVersioning1 param1(){
        return new UserVersioning1("aradhya");
    }

    @GetMapping(value = "/user/param",params = "version=2")
    public UserVersioning2 param2(){
        return new UserVersioning2(new User(1,"aradhya",21));
    }

//    MimeType Versioning--------------------------------------------------------------------->

    @GetMapping(value = "/user/produces",produces = "application/vnd.company.app-v1+json")
    public UserVersioning1 producesV1(){
        return new UserVersioning1("aradhya");
    }
    @GetMapping(value = "/user/produces",produces = "application/vnd.company.app-v2+json")
    public UserVersioning2 producesV2(){
        return new UserVersioning2(new User(1,"aradhya",21));
    }

//    Custom Header Versioning----------------------------------------------------------------->
    @GetMapping(value = "/user/header",headers = "X-API-VERSION=1")
    public UserVersioning1 header1(){
        return new UserVersioning1("aradhya");
    }
    @GetMapping(value = "/user/header",headers = "X-API-VERSION=2")
    public UserVersioning2 header2(){
        return new UserVersioning2(new User(1,"aradhya",21));
    }

}
