package com.jwt.service;

import com.jwt.entity.User;
import com.jwt.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserService {

    @Autowired
    private UserDao userRepository;

    public User createUser(User user) {
        return userRepository.save(user); // Save the new user to the database
    }

    public Set<User> getAllUsers() {
        return (Set<User>) userRepository.findAll(); // Retrieve all users from the database
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null); // Retrieve user by ID
    }

    public User updateUser(Long id, User user) {
        if (userRepository.existsById(id)) {
            user.setId(id); // Make sure we update the user with the correct ID
            return userRepository.save(user); // Save the updated user to the database
        }
        return null;
    }

    public boolean deleteUser(Long id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id); // Delete the user from the database
            return true;
        }
        return false;
    }
    public void saveUser(User user) {
        // Save user to the database
        userRepository.save(user);
    }
}
