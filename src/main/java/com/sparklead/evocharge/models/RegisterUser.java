package com.sparklead.evocharge.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterUser {

    private String name;

    private String password;

    private String email;

    private String matchingPassword;
}