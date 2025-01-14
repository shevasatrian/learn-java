package com.pembekalan.xsisacademy.service;

import java.util.List;

import com.pembekalan.xsisacademy.entity.User;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(Integer id);
    User savUser(User user);
    void deleteUserById(Integer id);
}
