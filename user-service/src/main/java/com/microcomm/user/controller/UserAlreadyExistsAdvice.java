package com.microcomm.user.controller;

import com.microcomm.user.exceptions.UserAlreadyExitsException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class UserAlreadyExistsAdvice {
    @ResponseBody
    @ExceptionHandler(UserAlreadyExitsException.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public String userAlreadyExists(UserAlreadyExitsException ex) {
        return ex.getMessage();
    }
}
