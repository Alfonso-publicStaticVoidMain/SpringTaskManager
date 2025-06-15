package com.alfonso.task_tracker.model;

import java.time.LocalDate;

public class Birthday implements Remindable {

    private String person;
    private LocalDate date;

    @Override
    public String getTitle() {
        return "";
    }

    @Override
    public LocalDate getDate() {
        return date;
    }

    @Override
    public Importance getImportance() {
        return null;
    }

    @Override
    public Status getStatus() {
        return null;
    }
}
