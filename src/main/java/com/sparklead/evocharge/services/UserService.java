package com.sparklead.evocharge.services;

import com.sparklead.evocharge.payload.SignInRequest;
import com.sparklead.evocharge.payload.SignupRequest;
import com.sparklead.evocharge.models.User;

public interface UserService {

    String saveUser(User user);

    User registerUser(SignupRequest signupRequest);

    Boolean verifyUser(User user, SignInRequest signInRequest);
}
