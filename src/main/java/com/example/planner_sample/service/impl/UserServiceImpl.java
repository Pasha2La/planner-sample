package com.example.planner_sample.service.impl;

import com.example.planner_sample.model.User;
import com.example.planner_sample.repository.UsersCrudRepository;
import com.example.planner_sample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UsersCrudRepository repository;

    @Autowired
    public UserServiceImpl(UsersCrudRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional
    public List<User> getAll() {
        return (List<User>) repository.findAll();
    }

    @Override
    @Transactional
    public void save(User user) {
        repository.save(user);
    }
}
