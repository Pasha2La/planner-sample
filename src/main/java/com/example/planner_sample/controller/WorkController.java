package com.example.planner_sample.controller;

import com.example.planner_sample.model.Mapper;
import com.example.planner_sample.model.dto.WorkDto;
import com.example.planner_sample.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/RSWork")
public class WorkController {

    @Autowired
    WorkService workService;

    @GetMapping("/getAll")
    public Set<WorkDto> getAll() {
        return Mapper.toWorkDtoSet(workService.getAll());
    }
}
