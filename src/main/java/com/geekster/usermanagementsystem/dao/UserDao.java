package com.geekster.usermanagementsystem.dao;

import com.geekster.usermanagementsystem.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDao {
    private List<User> userList;

    public UserDao(){
        userList = new ArrayList<>();
        userList.add(new User("0","Jhon Doe","jhondoe1","usa","95685765"));
    }

    public void addUser(User user){
        userList.add(user);
    }

    public List<User> getAllUser(){
        return userList;
    }

    public boolean removeUser(User user){
        userList.remove(user);
        return true;
    }

    public boolean updateUser(String userID,String name,String userName,String address,String phoneNum){
         for(User user : userList){
             if(user.getUserID().equals(userID)){
                 removeUser(user);
                 user.setName(name);
                 user.setUserName(userName);
                 user.setAddress(address);
                 user.setPhoneNum(phoneNum);
                 addUser(user);
                 return true;
             }
         }
         return false;
    }


}
