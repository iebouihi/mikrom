package com.microcomm.user.service.impl;

import com.microcomm.user.domaine.User;
import com.microcomm.user.exceptions.UserAlreadyExitsException;
import com.microcomm.user.repository.UserRepository;
import com.microcomm.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultUserService implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public void register(User userToQuery) throws UserAlreadyExitsException {
        User user = userRepository.findUserByEmail(userToQuery.getEmail());
        if (user != null)
            throw new UserAlreadyExitsException(user.getEmail());
        userRepository.save(userToQuery);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public DefaultUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
