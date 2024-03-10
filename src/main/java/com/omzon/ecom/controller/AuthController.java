package com.omzon.ecom.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @PostMapping("/signin")
    public String signIn() {

    }

    @PostMapping("/signup")
    public void createUser() {

    }

    @GetMapping("/test")
    public String test() {
        return "you have hit the /test route. app is working";
    }
}
