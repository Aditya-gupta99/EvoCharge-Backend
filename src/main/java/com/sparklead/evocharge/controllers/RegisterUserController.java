package com.sparklead.evocharge.controllers;

import com.sparklead.evocharge.models.RegisterUser;
import com.sparklead.evocharge.models.User;
import com.sparklead.evocharge.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterUserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    private String registerUser(@RequestBody RegisterUser registerUser){
        User user = userService.registerUser(registerUser);
        return "Success";
    }

}