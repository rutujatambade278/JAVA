package com.Auth.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.Auth.Entity.User;
import com.Auth.Service.UserService;

@Controller
public class AuthController {

    @Autowired
    private UserService userService;

    @GetMapping("/auth/login")
    public String login() {
        return "login"; // returns login.html
    }

    @PostMapping("/auth/login")
    public String authenticate(String email, String password, Model model) {
        User user = userService.validate(email, password);
        if (user != null) {
            return "redirect:/home/welcome";
        }
        model.addAttribute("error", "Invalid email or password");
        return "login";
    }

    @PostMapping("/auth/logout")
    public String logout() {
        return "redirect:/";
    }
}