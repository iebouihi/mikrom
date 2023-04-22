package com.microcomm.user.exceptions;

public class UserAlreadyExitsException extends RuntimeException {
    public UserAlreadyExitsException(String id) {
        super("User already registered " + id);
    }
}
