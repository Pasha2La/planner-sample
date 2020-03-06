package com.example.planner_sample.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(name = "works", schema = "public")
public class Work {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "work_name")
    private String workName;

    @Column(name = "status")
    private String status;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "expire_date")
    private Date expireDate;

    @OneToMany(mappedBy = "work", cascade = CascadeType.ALL)
    private Set<Task> tasks;

    public Work(String workName, String status, Date startDate, Date expireDate, Set<Task> tasks) {
        this.workName = workName;
        this.status = status;
        this.startDate = startDate;
        this.expireDate = expireDate;
        this.tasks = tasks;
    }
}
