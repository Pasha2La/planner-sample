package com.example.planner_sample.repository;

import com.example.planner_sample.model.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolesCrudRepository extends CrudRepository<Role, Long> {
}
