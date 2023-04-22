package com.microcomm.user;


import com.microcomm.user.controller.UserController;
import com.microcomm.user.domaine.User;
import com.microcomm.user.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;

class DefaultUserControllerTest {
    private UserService userService;
    private UserController userController;

    @BeforeEach
    void setUpTest() {
        userService = mock(UserService.class);
        userController = new UserController();
        userController.setUserService(userService);
    }

    @Test
    void testRegister() {
        User user1 = new User();
        // when(userService.register(user1)).thenReturn(true);
        userController.register(user1);
    }


}
