package com.Auth.Service;


import org.springframework.stereotype.Service;

import com.Auth.Entity.User;

import java.util.List;

@Service
public class UserService {

    private final List<User> users = List.of(
        new User("ravi.tambade@transflower.in", "seed"),
        new User("shubhangi.tambade@gmail.com", "transflower")
    );

    public User validate(String email, String password) {
        return users.stream()
            .filter(user -> user.getEmail().equals(email) && user.getPassword().equals(password))
            .findFirst()
            .orElse(null);
    }
}