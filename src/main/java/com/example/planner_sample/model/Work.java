package com.example.planner_sample.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Entity
@Table(name = "works", schema = "public")
public class Work {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "work_name")
    private String workName;

    @Column(name = "status")
    private String status;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "expire_date")
    private Date expireDate;

    @OneToMany(mappedBy = "work", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Task> tasks;

    public Work() {}

    public Work(String workName, String status, Date startDate, Date expireDate, Set<Task> tasks) {
        this.workName = workName;
        this.status = status;
        this.startDate = startDate;
        this.expireDate = expireDate;
        this.tasks = tasks;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Set<Task> getTasks() {
        return tasks;
    }

    public void setTasks(Set<Task> tasks) {
        this.tasks = tasks;
    }
}
