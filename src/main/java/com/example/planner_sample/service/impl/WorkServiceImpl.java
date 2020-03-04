package com.example.planner_sample.service.impl;

import com.example.planner_sample.model.Work;
import com.example.planner_sample.repository.WorksCrudRepository;
import com.example.planner_sample.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class WorkServiceImpl implements WorkService {

    private final WorksCrudRepository repository;

    @Autowired
    public WorkServiceImpl(WorksCrudRepository repository) {
        this.repository = repository;
    }

    @Override
    public Set<Work> getAll() {
        return StreamSupport.stream(repository.findAll().spliterator(), false)
                            .collect(Collectors.toSet());
    }
}
