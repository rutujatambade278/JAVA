package com.Auth.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index"; // returns index.html
    }

    @GetMapping("/home/welcome")
    public String welcome(Model model) {
        return "welcome"; // returns welcome.html
    }
}