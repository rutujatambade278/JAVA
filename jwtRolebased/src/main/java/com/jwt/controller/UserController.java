package com.jwt.controller;

import com.jwt.entity.User;
import com.jwt.entity.Role;
import com.jwt.service.UserService;
import com.jwt.dao.RoleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;
    
    @Autowired
    private RoleDao roleRepository;

    // Create User (Register a new user)
    @PostMapping("/new")
    public ResponseEntity<User> registerUser(@RequestBody User user) {
        String role = user.getRole().iterator().next().getRoleName(); // Assuming you pass a single role name from user
        Role selectedRole = roleRepository.findByRoleName(role);
        
        if (selectedRole != null) {
            user.setRole(Set.of(selectedRole)); // Assign the selected role to the user
            User createdUser = userService.createUser(user);
            return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST); // If the role is invalid
        }
    }

    // Get All Users
    @GetMapping
    public ResponseEntity<Set<User>> getAllUsers() {
        Set<User> users = (Set<User>) userService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    // Get User by ID
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        User user = userService.getUserById(id);
        if (user != null) {
            return new ResponseEntity<>(user, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    // Update User
    @PutMapping("/edit/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User user) {
        User updatedUser = userService.updateUser(id, user);
        if (updatedUser != null) {
            return new ResponseEntity<>(updatedUser, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    // Delete User
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<HttpStatus> deleteUser(@PathVariable Long id) {
        boolean isDeleted = userService.deleteUser(id);
        if (isDeleted) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT); // Successfully deleted
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND); // User not found
    }
}
