package com.example.planner_sample.model.dto;

import java.sql.Date;
import java.util.Set;

public class WorkDto {
    private String workName;
    private String status;
    private Date startDate;
    private Date expireDate;
    private Set<TaskDto> taskDtos;

    public WorkDto() {

    }

    public WorkDto(String workName, String status, Date startDate, Date expireDate, Set<TaskDto> taskDtos) {
        this.workName = workName;
        this.status = status;
        this.startDate = startDate;
        this.expireDate = expireDate;
        this.taskDtos = taskDtos;
    }

    public String getWorkName() {
        return workName;
    }

    public void setWorkName(String workName) {
        this.workName = workName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public Set<TaskDto> getTaskDtos() {
        return taskDtos;
    }

    public void setTaskDtos(Set<TaskDto> taskDtos) {
        this.taskDtos = taskDtos;
    }
}
