package com.microcomm.user.service;

import com.microcomm.user.domaine.User;
import com.microcomm.user.exceptions.UserAlreadyExitsException;

import java.util.List;

public interface UserService {
    void register(User userToQuery) throws UserAlreadyExitsException;

    List<User> getAllUsers();
}
