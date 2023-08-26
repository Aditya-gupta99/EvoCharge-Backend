package com.sparklead.evocharge.services;

import com.sparklead.evocharge.models.User;
import com.sparklead.evocharge.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public String saveUser(User user) {
        return userRepository.save(user).getUserId();
    }
}