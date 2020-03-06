package com.example.planner_sample.controller;

import com.example.planner_sample.model.Work;
import com.example.planner_sample.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Work")
public class WorkController {

    private final WorkService workService;

    @Autowired
    public WorkController(WorkService workService) {
        this.workService = workService;
    }

    @GetMapping("/getAll")
    public Iterable<Work> getAll() {
        return workService.getAll();
    }

    @PostMapping("/save")
    public Work save(@RequestBody Work work) {
        return workService.save(work);
    }

    @PostMapping("/delete")
    public void delete(@RequestBody Work work) {
        workService.delete(work);
    }
}
