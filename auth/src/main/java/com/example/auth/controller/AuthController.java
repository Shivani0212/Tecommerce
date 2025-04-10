package com.example.auth.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        // Logic for authentication
        return "Login successful for " + username;
    }

    @PostMapping("/register")
    public String register(@RequestParam String username, @RequestParam String password) {
        // Logic for registration
        return "Registration successful for " + username;
    }
}
