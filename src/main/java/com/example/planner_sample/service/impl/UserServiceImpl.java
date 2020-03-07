package com.example.planner_sample.service.impl;

import com.example.planner_sample.model.User;
import com.example.planner_sample.repository.UsersCrudRepository;
import com.example.planner_sample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserServiceImpl implements UserService {

    private final UsersCrudRepository repository;

    @Autowired
    public UserServiceImpl(UsersCrudRepository repository) {
        this.repository = repository;
    }

    @Override
    public Iterable<User> getAll() {
        return repository.findAll();
    }

    @Override
    public User getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public User save(User user) {
        return repository.save(user);
    }

    @Override
    @Transactional
    public void delete(User user) {
        repository.delete(user);
    }
}
