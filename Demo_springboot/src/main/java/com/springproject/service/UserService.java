package com.springproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springproject.Dao.UserDao;
import com.springproject.entity.User;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    // Create User
    public void createUser(User user) {
        userDao.insertUser(user);
    }

    // Get User by ID
    public User getUserById(int userId) {
        return userDao.getUserById(userId);
    }

    // Update User
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    // Delete User
    public void deleteUser(int userId) {
        userDao.deleteUser(userId);
    }

    // Get All Users
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }
}