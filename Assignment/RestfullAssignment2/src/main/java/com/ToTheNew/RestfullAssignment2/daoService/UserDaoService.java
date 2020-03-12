package com.ToTheNew.RestfullAssignment2.daoService;

import com.ToTheNew.RestfullAssignment2.entity.User;
import com.google.common.io.LittleEndianDataInputStream;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class UserDaoService {

    List<User> users= new ArrayList<>();
    public void addUser(User user){
        users.add(user);
    }

    public List<User> getUsers(){
        return  users;
    }

    public List<User> deleteUser(Integer id){
        Iterator<User>  iterator= users.iterator();
        while(iterator.hasNext()){
            if(iterator.next().getId()==id){
                iterator.remove();
            }
        }
        return users;
    }


}
