package com.alfonso.task_tracker.model;

import java.time.LocalDate;
import java.time.LocalTime;

public abstract class AbstractTask implements Remindable {
    private LocalDate date;
    private LocalTime time;
}
