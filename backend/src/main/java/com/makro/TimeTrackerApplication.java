package com.makro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class TimeTrackerApplication {
    public static void main(String[] args) {
        SpringApplication.run(TimeTrackerApplication.class, args);
    }
}