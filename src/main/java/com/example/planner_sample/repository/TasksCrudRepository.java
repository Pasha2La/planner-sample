package com.example.planner_sample.repository;

import com.example.planner_sample.model.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TasksCrudRepository extends CrudRepository<Task, Long> {
}
