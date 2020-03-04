package com.example.planner_sample.repository;

import com.example.planner_sample.model.Work;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorksCrudRepository extends CrudRepository<Work, Long> {
}
