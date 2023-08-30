package com.sparklead.evocharge.services;

import com.sparklead.evocharge.models.RegisterUser;

public interface UserService {

    String saveUser(User user);

    User registerUser(RegisterUser registerUser);
}
