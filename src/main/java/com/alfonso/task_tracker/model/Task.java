package com.alfonso.task_tracker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task implements Remindable {
    private Long id;
    private String title;
    private LocalDate date;
    private Importance importance;
    private Status status;

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public LocalDate getDate() {
        return date;
    }

    @Override
    public Importance getImportance() {
        return importance;
    }

    @Override
    public Status getStatus() {
        return status;
    }
}

