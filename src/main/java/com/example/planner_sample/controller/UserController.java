package com.example.planner_sample.controller;

import com.example.planner_sample.model.User;
import com.example.planner_sample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/User")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/getAll")
    public Iterable<User> getAll() {
        return userService.getAll();
    }

    @PostMapping("/save")
    public User save(@RequestBody User user) {
        return userService.save(user);
    }

    @PostMapping("/delete")
    public void delete(@RequestBody User user) {
        userService.delete(user);
    }
}
