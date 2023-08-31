package com.sparklead.evocharge.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterUser {

    private String name;

    private String password;

    private String email;

    private String matchingPassword;
}