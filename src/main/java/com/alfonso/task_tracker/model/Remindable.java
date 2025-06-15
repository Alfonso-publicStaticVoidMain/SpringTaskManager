package com.alfonso.task_tracker.model;

import java.time.LocalDate;

public interface Remindable {

    String getTitle();
    LocalDate getDate();
    Importance getImportance();
    Status getStatus();

}
