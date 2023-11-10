package com.example.Java.preproject312.service;


import com.example.Java.preproject312.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers ();
    User getUserById(long id);
    void addUser(User user);
    void removeUser(long id);
    void updateUser(User user);

}
