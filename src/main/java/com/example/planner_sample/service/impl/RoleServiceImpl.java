package com.example.planner_sample.service.impl;

import com.example.planner_sample.model.Role;
import com.example.planner_sample.repository.RolesCrudRepository;
import com.example.planner_sample.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    private final RolesCrudRepository repository;

    @Autowired
    public RoleServiceImpl(RolesCrudRepository repository) {
        this.repository = repository;
    }

    @Override
    public Iterable<Role> getAll() {
        return repository.findAll();
    }

    @Override
    public Role getById(Long id) {
        return repository.findById(id).orElse(null);
    }
}
