package com.microcomm.user;


import com.microcomm.user.controller.UserAlreadyExistsAdvice;
import com.microcomm.user.exceptions.UserAlreadyExitsException;
import org.junit.jupiter.api.Test;

class UserAlreadyExistAdviceTest {


    public static final String USER_ALREADY_REGISTERED = "User already registered ";

    @Test
    void userAlreadyExistsExceptionMessage() {

        UserAlreadyExistsAdvice userAlreadyExistsAdvice = new UserAlreadyExistsAdvice();
        String id = "user@domaine.com";
        UserAlreadyExitsException exception = new UserAlreadyExitsException(id);
        assert (userAlreadyExistsAdvice.userAlreadyExists(exception).equals(exception.getMessage()));

    }
}
