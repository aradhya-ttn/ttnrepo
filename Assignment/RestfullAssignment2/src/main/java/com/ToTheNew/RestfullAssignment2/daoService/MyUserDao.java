package com.ToTheNew.RestfullAssignment2.daoService;

import com.ToTheNew.RestfullAssignment2.entity.MyUser;
import com.ToTheNew.RestfullAssignment2.entity.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MyUserDao {

    List<MyUser> myUsers= new ArrayList<>();
    public List<MyUser>  addUser(MyUser myUser){
         myUsers.add(myUser);
        return myUsers;
    }


    public List<MyUser> getUsers() {
        return myUsers;
    }

    public void getDynamicFilter(MyUser myUser){
        myUsers.add(myUser);
    }

}
