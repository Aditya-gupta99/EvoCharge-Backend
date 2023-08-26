package com.sparklead.evocharge.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document(collection = "User")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {

    @Id
    private String userId;

    private String firstName;

    private String lastName;

    private String email;

    private String brand;

    private String model;
}