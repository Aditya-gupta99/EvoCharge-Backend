package com.sparklead.evocharge.controllers;

import com.sparklead.evocharge.error.EmailAlreadyUseException;
import com.sparklead.evocharge.models.User;
import com.sparklead.evocharge.payload.SignInRequest;
import com.sparklead.evocharge.payload.SignUpResponse;
import com.sparklead.evocharge.payload.SignupRequest;
import com.sparklead.evocharge.repositories.UserRepository;
import com.sparklead.evocharge.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpServerErrorException;

@RestController
public class AuthController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/signUp")
    private ResponseEntity<SignUpResponse> registerUser(@RequestBody SignupRequest signupRequest) throws EmailAlreadyUseException {
        if (userRepository.existsByEmail(signupRequest.getEmail())) {
//            return ResponseEntity.internalServerError()
//                    .body(new SignUpResponse("Email is already in use!"));
//            throw new HttpServerErrorException(HttpStatus.INTERNAL_SERVER_ERROR,"Email is already in use!");
            throw new EmailAlreadyUseException("Email is already in use!");
        }
        userService.registerUser(signupRequest);
        return ResponseEntity.ok(new SignUpResponse("User registered successfully!"));
    }

    @PostMapping("/signIn")
    private ResponseEntity<?> signInUser(@RequestBody SignInRequest signInRequest) {
        User user = userRepository.findByEmail(signInRequest.getEmail());
        if(user==null) return  ResponseEntity.badRequest().body("Error:User not exits");
        if (userService.verifyUser(user, signInRequest)) {
            return ResponseEntity.ok(user);
        }
        return ResponseEntity.badRequest().body("Error:Login Unsuccessful");
    }
}