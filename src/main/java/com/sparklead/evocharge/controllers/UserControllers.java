package com.sparklead.evocharge.controllers;

import com.sparklead.evocharge.models.User;
import com.sparklead.evocharge.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/user")
public class UserControllers {

    @Autowired
    private UserService userService;

    @GetMapping("/greeting")
    public String greeting() {
        return "Hello World!!";
    }

    @PostMapping("/user")
    public String saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

}