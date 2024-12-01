package com.jwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jwt.entity.User;
import com.jwt.service.UserService;

@Controller
@RequestMapping("/api/users")
public class UserControllerPage {

    @Autowired
    private UserService userService;

    // Method to display the form for creating a new user
    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User()); // Adding a new empty user object to the model
        return "createUserForm"; // View for the registration form
    }

    // Method to handle user creation form submission
    @PostMapping("/register")
    public String createUser(@ModelAttribute User user, Model model) {
        try {
            userService.createUser(user); // Save user using service
            model.addAttribute("message", "User created successfully!");
            return "redirect:/api/users/success"; // Redirect to success page
        } catch (Exception e) {
            model.addAttribute("error", "Error creating user.");
            return "userError"; // Return the error page if there is an error
        }
    }

    // Method to display success page
    @GetMapping("/success")
    public String showSuccessPage(Model model) {
        return "userSuccess"; // Display success page
    }
}
