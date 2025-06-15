package com.alfonso.task_tracker.service;

import com.alfonso.task_tracker.model.Task;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TaskService {

    private final Map<Long, Task> tasks = new HashMap<>();
    private long nextId = 1;

    public List<Task> findAll() {
        return new ArrayList<>(tasks.values());
    }

    public void save(Task task) {
        if (task.getId() == null) {
            task.setId(nextId++);
        }
        tasks.put(task.getId(), task);
    }

    public Task findById(Long id) {
        return tasks.get(id);
    }

    public void delete(Long id) {
        tasks.remove(id);
    }
}

