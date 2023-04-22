package com.microcomm.user.controller;

import com.microcomm.user.domaine.User;
import com.microcomm.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/users")
    List<User> getUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("register")
    public void register(@RequestBody User user) {
        userService.register(user);
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
