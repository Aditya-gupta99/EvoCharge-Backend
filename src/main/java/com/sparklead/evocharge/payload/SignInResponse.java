package com.sparklead.evocharge.payload;

import com.sparklead.evocharge.models.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignInResponse {

    private User user;

}