package com.example.planner_sample.controller;

import com.example.planner_sample.model.Role;
import com.example.planner_sample.model.User;
import com.example.planner_sample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/RSUser")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    @RequestMapping("/getAll")
    public List<User> getAll() {
        return userService.getAll();
    }

    @GetMapping
    @RequestMapping("/save")
    public void save() {
        User user = new User("ololo", "pswd", null);
        Role role = new Role("testRole1", Collections.singletonList(user));
        user.setRole(role);
        userService.save(user);
    }
}
