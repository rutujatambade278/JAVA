package com.tfl.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class AuthController {

    public AuthController() {
        System.out.println("Auth Controller instance initialized......");
    }

    @GetMapping("/login")
    public String login() {
        System.out.println("Invoking AuthController login method.");
        return "login";
    }

    @PostMapping("/validate")
    public String validate(@RequestParam String email, @RequestParam String password, RedirectAttributes redirectAttributes) {
        System.out.println("Validating user credentials...");

        if ("ravi.tambade@transflower.in".equals(email) && "seed".equals(password)) {
            System.out.println("Successful validation of user...");
            System.out.println("Redirecting to welcome...");
            return "redirect:/welcome";
        }

        redirectAttributes.addFlashAttribute("error", "Invalid credentials");
        return "redirect:/login";
    }

    @GetMapping("/welcome")
    public String welcome() {
        System.out.println("Invoking AuthController welcome method.");
        return "welcome";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }
}