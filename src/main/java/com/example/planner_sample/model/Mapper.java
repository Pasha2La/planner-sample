package com.example.planner_sample.model;

import com.example.planner_sample.model.dto.TaskDto;
import com.example.planner_sample.model.dto.WorkDto;

import java.util.HashSet;
import java.util.Set;

public class Mapper {
    public static WorkDto toWorkDto(Work work) {
        if (work == null) {
            return null;
        }
        return new WorkDto(work.getWorkName(), work.getStatus(), work.getStartDate(), work.getExpireDate(), toTaskDtoSet(work.getTasks()));
    }

    public static Set<WorkDto> toWorkDtoSet(Set<Work> works) {
        if (works == null) {
            return null;
        }
        Set<WorkDto> workDtos = new HashSet<>();
        for (Work work: works) {
            workDtos.add(toWorkDto(work));
        }
        return workDtos;
    }

    public static TaskDto toTaskDto(Task task) {
        if (task == null) {
            return null;
        }
        return new TaskDto(task.getTaskName());
    }

    public static Set<TaskDto> toTaskDtoSet(Set<Task> tasks) {
        if (tasks == null) {
            return null;
        }
        Set<TaskDto> taskDtos = new HashSet<>();
        for (Task task: tasks) {
            taskDtos.add(toTaskDto(task));
        }
        return taskDtos;
    }
}
