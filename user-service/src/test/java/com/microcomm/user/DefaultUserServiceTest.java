package com.microcomm.user;


import com.microcomm.user.domaine.User;
import com.microcomm.user.exceptions.UserAlreadyExitsException;
import com.microcomm.user.repository.UserRepository;
import com.microcomm.user.service.UserService;
import com.microcomm.user.service.impl.DefaultUserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class DefaultUserServiceTest {
    private UserRepository userRepository;
    User user1 = new User();
    UserService userService;

    @BeforeEach
    void setUpTest() {
        userRepository = mock(UserRepository.class);
        userService = new DefaultUserService(userRepository);
        user1.setEmail("user1@email.com");

    }

    @Test
    void nonRegisteredUser() {

        when(userRepository.findUserByEmail("user1@email.com")).thenReturn(null);
        Assertions.assertDoesNotThrow(() -> {
            userService.register(user1);
        });
    }

    @Test
    void alreadyRegistereddUser() {
        when(userRepository.findUserByEmail("user1@email.com")).thenReturn(user1);
        Assertions.assertThrows(UserAlreadyExitsException.class, () -> {
            userService.register(user1);
        });

    }


}
