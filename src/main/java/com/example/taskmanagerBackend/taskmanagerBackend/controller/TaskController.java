package com.example.taskmanagerBackend.taskmanagerBackend.controller;

import com.example.taskmanagerBackend.taskmanagerBackend.entity.Task;
import com.example.taskmanagerBackend.taskmanagerBackend.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.ExecutionException;


@RestController
@RequestMapping("/api")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @PostMapping("/tasks")
    public String saveTask(@RequestBody Task task) throws ExecutionException, InterruptedException{
            return taskService.saveTask(task);
    }

    @GetMapping("/tasks/{id}")
    public Task getTaskById(@PathVariable String id) throws ExecutionException, InterruptedException {
        return taskService.getTaskDetailsById(id);
    }

    @GetMapping("/tasks")
    public List<Task> getTask() throws ExecutionException, InterruptedException {
        return taskService.getTaskDetails();
    }

    @PutMapping("/tasks")
    public String updateTask(@RequestBody Task task) throws ExecutionException, InterruptedException{
        return taskService.updateTask(task);
    }

    @DeleteMapping("/tasks/{id}")
    public String deleteTask(@PathVariable String id) throws ExecutionException, InterruptedException{
        return taskService.deleteTask(id);
    }
}
