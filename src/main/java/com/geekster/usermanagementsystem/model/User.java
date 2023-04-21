package com.geekster.usermanagementsystem.model;

public class User {
    private String userID;
    private String name;
    private String userName;
    private String address;
    private String phoneNum;

    public User(String userID, String name, String userName, String address, String phoneNum) {
        this.userID = userID;
        this.name = name;
        this.userName = userName;
        this.address = address;
        this.phoneNum = phoneNum;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
