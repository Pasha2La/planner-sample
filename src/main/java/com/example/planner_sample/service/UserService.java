package com.example.planner_sample.service;

import com.example.planner_sample.model.User;

public interface UserService {
    Iterable<User> getAll();

    User save(User user);

    void delete(User user);

    User getById(Long id);
}
