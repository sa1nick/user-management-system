package com.geekster.usermanagementsystem.service;

import com.geekster.usermanagementsystem.dao.UserDao;
import com.geekster.usermanagementsystem.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public void addUser(User user){
        userDao.addUser(user);
    }

    public List<User> getAllUser(){
        return userDao.getAllUser();
    }

    public User getUserByID(String userID){
        if(userID != null){
            List<User> allUserList = getAllUser();
            for(User user :allUserList){
                if(user.getUserID().equals(userID)){
                    return user;
                }
            }

        }
        return null;
    }

    public String deleteUser(String userID){
        if(userID == null){
            return "Error !! id  cannot be null !";
        } else {
             for(User user : userDao.getAllUser()){
                 if(user.getUserID().equals(userID)){
                    boolean isDeleted = userDao.removeUser(user);
                     if(isDeleted) return "User with id "+userID+" removed.";
                     else return "Unable to remove user";
                 }
                 else return  "User with id "+userID+" is not found ";
             }
        }
        return "Failed ! Unable to remove user";
    }

    public String updateUser(String userID,String name,String userName,String address,String phoneNum){
        boolean isDeleted = userDao.updateUser(userID,name,userName,address,phoneNum);

        if(userID == null){
            return "Error !! id  cannot be null !";
        }
        else if(isDeleted){
            return  "User with id "+userID+" updated.";
        }
        return "Unable to update user with id "+userID +" id doesn't exists !";
    }
}
