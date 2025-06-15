package com.alfonso.task_tracker.controller;

import com.alfonso.task_tracker.model.Importance;
import com.alfonso.task_tracker.model.Status;
import com.alfonso.task_tracker.model.Task;
import com.alfonso.task_tracker.service.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TaskController {

    private final TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("tasks", service.findAll());
        model.addAttribute("task", new Task()); // for the form
        model.addAttribute("importances", Importance.values());
        model.addAttribute("statuses", Status.values());
        return "index";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute Task task) {
        service.save(task);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "redirect:/";
    }
}

