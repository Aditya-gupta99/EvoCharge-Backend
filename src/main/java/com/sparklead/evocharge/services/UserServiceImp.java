package com.sparklead.evocharge.services;

import com.sparklead.evocharge.models.RegisterUser;
import com.sparklead.evocharge.models.User;
import com.sparklead.evocharge.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public String saveUser(User user) {
        return userRepository.save(user).getUserId();
    }

    @Override
    public User registerUser(RegisterUser registerUser) {
        User user = new User();
        user.setEmail(registerUser.getEmail());
        user.setFirstName(registerUser.getName());
        user.setPassword(passwordEncoder.encode(registerUser.getPassword()));
        userRepository.save(user);
        return user;
    }
}