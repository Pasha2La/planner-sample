package com.example.planner_sample.model.dto;

public class TaskDto {
    private String taskName;

    public TaskDto() {

    }

    public TaskDto(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }
}
