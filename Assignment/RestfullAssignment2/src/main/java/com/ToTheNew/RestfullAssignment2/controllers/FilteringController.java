package com.ToTheNew.RestfullAssignment2.controllers;

import com.ToTheNew.RestfullAssignment2.daoService.MyUserDao;
import com.ToTheNew.RestfullAssignment2.entity.MyUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FilteringController {

    @Autowired
    private MyUserDao userDao;



    @GetMapping("/myusers")
    public List<MyUser> getAll(){
        return userDao.getUsers();
    }

    @PostMapping("/myusers")
    public List<MyUser> userInfo(@RequestBody MyUser myUser){
        return userDao.addUser(myUser);

    }


}
