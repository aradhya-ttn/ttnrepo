package com.ToTheNew.RestfullAssignment2.controllers;

import com.ToTheNew.RestfullAssignment2.daoService.UserDaoService;
import com.ToTheNew.RestfullAssignment2.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.hateoas.EntityModel;
//import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
//import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class UserController {

     @Autowired
    private UserDaoService daoService;

//     HATEOAS
//    @PostMapping("/users")
//    public EntityModel<User> addUser(@RequestBody User user){
//
//        daoService.addUser(user);
//        EntityModel<User> model=new EntityModel<>(user);
//        WebMvcLinkBuilder linkTo=linkTo(methodOn(this.getClass()).addUser(user));
//        model.add(linkTo.withRel("All-User"));
//        return model;
//    }


     @PostMapping("/user")
    public void userInfo(@RequestBody User user){
         daoService.addUser(user);

     }
     @GetMapping("/user")
     public List<User> getUserDetail(){
         return  daoService.getUsers();
     }

     @DeleteMapping("/users/{id}")
    public List<User> deleteUser(@PathVariable Integer id){
         return daoService.deleteUser(id);
     }


}
