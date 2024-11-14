package com.tfl.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
@RequestMapping("/")
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    public HomeController() {
        System.out.println("Home Controller instance initialized......");
    }

    // Action Methods
    @GetMapping
    public String index() {
        System.out.println("Invoking Home Controller index method.. ");
        return "index"; // Return the "index" view
    }

    @GetMapping("/privacy")
    public String privacy() {
        System.out.println("Invoking Home Controller Privacy method.");
        return "privacy"; // Return the "privacy" view
    }

    @GetMapping("/aboutus")
    public String aboutUs() {
        System.out.println("Invoking Home Controller About us method.");
        return "aboutus"; 
    }

    @GetMapping("/contact")
    public String contact() {
        System.out.println("Invoking Home Controller Contact method.");
        return "contact"; // Return the "contact" view
    }

    @GetMapping("/error")
    public String error(Model model) {
        String requestId = java.util.Optional.ofNullable((String) model.getAttribute("javax.servlet.error.request_uri"))
                .orElse("N/A");
        model.addAttribute("requestId", requestId);
        return "error"; // Return the "error" view with request ID for the error page
    }
}
