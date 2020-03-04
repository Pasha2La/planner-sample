package com.example.planner_sample.service;

import com.example.planner_sample.model.User;

import java.util.List;

public interface UserService {
    List<User> getAll();

    void save(User user);
}
