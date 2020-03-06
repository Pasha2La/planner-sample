package com.example.planner_sample.service;

import com.example.planner_sample.model.Work;

public interface WorkService {
    Iterable<Work> getAll();

    Work save(Work work);

    void delete(Work work);
}
