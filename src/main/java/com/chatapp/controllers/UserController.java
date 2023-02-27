package com.chatapp.controllers;

import com.chatapp.entities.User;
import com.chatapp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    private final UserService userService;
    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }
    @GetMapping("/register")
    public String showRegistrationPage(){
        return "register";
    }
    @PostMapping("/register")
    public String handleUserRegistration(User user){
        try {
            this.userService.createUser(user);
        }catch (Exception e){
            return "redirect:login?message=signup_failed&error="+e.getMessage();
        }
        return "redirect:login?message=signup_success";
    }
    @GetMapping("/login")
    public String showLoginPage(){
        return "login";
    }
}
