package com.sparklead.evocharge.controllers;

import com.sparklead.evocharge.models.User;
import com.sparklead.evocharge.payload.SignInRequest;
import com.sparklead.evocharge.payload.SignupRequest;
import com.sparklead.evocharge.repositories.UserRepository;
import com.sparklead.evocharge.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/register")
    private ResponseEntity<String> registerUser(@RequestBody SignupRequest signupRequest){
        if(userRepository.existsByEmail(signupRequest.getEmail())) {
            return ResponseEntity
                    .badRequest()
                    .body("Error: Email is already in use!");
        }
        userService.registerUser(signupRequest);
        return ResponseEntity.ok("User registered successfully!");
    }

    @PostMapping("/signIn")
    private ResponseEntity<?> signInUser(@RequestBody SignInRequest signInRequest){
        User user = userRepository.findByEmail(signInRequest.getEmail());
        if(userService.verifyUser(user,signInRequest)){
            return ResponseEntity.ok(user);
        }
        return ResponseEntity.badRequest().body("Error:Login Unsuccessful");
    }
}