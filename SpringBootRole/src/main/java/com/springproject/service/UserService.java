package com.springproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springproject.Dao.UserRepository;
import com.springproject.entity.User;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void createUser(User user) {
        userRepository.insertUser(user);
    }

    public User getUserById(int userId) {
        return userRepository.getUserById(userId);
    }

    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    public void updateUser(User user) {
        userRepository.updateUser(user);
    }

    public void deleteUser(int userId) {
        userRepository.removeUser(userId);
    }
}
