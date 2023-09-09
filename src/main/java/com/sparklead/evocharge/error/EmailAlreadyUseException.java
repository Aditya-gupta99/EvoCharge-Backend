package com.sparklead.evocharge.error;

import java.io.IOException;

public class EmailAlreadyUseException extends IOException {

    public EmailAlreadyUseException(String message){
        super(message);
    }

}