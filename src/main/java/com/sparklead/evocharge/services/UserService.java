package com.sparklead.evocharge.services;

import com.sparklead.evocharge.models.RegisterUser;
import com.sparklead.evocharge.models.User;

public interface UserService {

    String saveUser(User user);

    User registerUser(RegisterUser registerUser);
}
