package com.example.planner_sample.repository;

import com.example.planner_sample.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersCrudRepository extends CrudRepository<User, Long> {
}
