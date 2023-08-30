package com.sparklead.evocharge.services;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Data
@Builder
@Document(collection = "User")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {

    @Id
    private String userId;

    private String firstName;

    private String lastName;

    private String password;

    private String email;

    private String brand;

    private String model;
}