package com.example.jBCryptAuth.web;

import com.example.jBCryptAuth.infrastructure.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class AuthController {
    @Autowired
    AppUserRepository userRepository;

    @GetMapping("/login")
    public String getLoginPage()
    {
        return "/login.html";
    }
    @GetMapping("/loginWithSecret")
    public String getLoginPageWithSecret()
    {
        return "/userLoggedin.html";
    }
    @GetMapping("/signup")
    public String getSignupPage()
    {
        return "/signup.html";
    }
}
