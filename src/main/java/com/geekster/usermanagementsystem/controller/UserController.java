package com.geekster.usermanagementsystem.controller;

import com.geekster.usermanagementsystem.model.User;
import com.geekster.usermanagementsystem.service.UserService;
import jakarta.annotation.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;


    @PostMapping(value = "/addUser")
    public String addUser(@RequestBody User user){
        userService.addUser(user);
        return "User Added !";
    }

    @GetMapping(value = "/getAllUser")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @GetMapping(value = "getUser/{userID}")
    public User getUserByID(@Nullable @PathVariable String  userID ){
        return userService.getUserByID(userID);
    }

    @DeleteMapping(value = "/deleteUser/{userID}")
    public String deleteUser(@PathVariable String userID){
        return userService.deleteUser(userID);
    }

    @PutMapping(value ="/updateUserInfo/{userID}/{name}/{userName}/{address}/{phoneNum}")
    public String updateUser(@PathVariable String userID, @PathVariable String name, @PathVariable String userName,@PathVariable String address,@PathVariable String phoneNum){
        return userService.updateUser(userID,name,userName,address,phoneNum);
    }


}
