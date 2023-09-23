package com.sparklead.evocharge.services;

import com.sparklead.evocharge.payload.SignInRequest;
import com.sparklead.evocharge.payload.SignupRequest;
import com.sparklead.evocharge.models.User;

import java.util.Optional;

public interface UserService {

    String saveUser(User user);

    String registerUser(SignupRequest signupRequest);

    Boolean verifyUser(User user, SignInRequest signInRequest);

    Optional<User> findById(String id);
}
