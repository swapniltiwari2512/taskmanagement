package com.example.taskmanagement.controller;

import org.springframework.web.bind.annotation.*;
import com.example.taskmanagement.service.TaskService;
import com.example.taskmanagement.entity.Task;

@RestController
    @RequestMapping("/api/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/test")
    public String test(){
        return "hello";
    }

    @PostMapping
    public Task creatTask(@RequestBody Task task){
        return taskService.createTask(task);
    }





}
