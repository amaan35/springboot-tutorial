package com.prj.SpringBootLoginRegisterSystem.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class UserAlreadyRegisteredException extends Exception{

    public UserAlreadyRegisteredException(String e){
        super(e);
    }
}
