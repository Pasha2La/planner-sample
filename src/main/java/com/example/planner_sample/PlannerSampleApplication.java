package com.example.planner_sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class PlannerSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlannerSampleApplication.class, args);
    }

}
