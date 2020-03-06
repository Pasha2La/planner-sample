package com.example.planner_sample.service.impl;

import com.example.planner_sample.model.Work;
import com.example.planner_sample.repository.WorksCrudRepository;
import com.example.planner_sample.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class WorkServiceImpl implements WorkService {

    private final WorksCrudRepository repository;

    @Autowired
    public WorkServiceImpl(WorksCrudRepository repository) {
        this.repository = repository;
    }

    @Override
    public Iterable<Work> getAll() {
        return repository.findAll();
    }

    @Override
    @Transactional
    public Work save(Work work) {
        return repository.save(work);
    }

    @Override
    @Transactional
    public void delete(Work work) {
        repository.delete(work);
    }
}
