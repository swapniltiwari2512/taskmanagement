package com.example.taskmanagement.controller;

import org.springframework.web.bind.annotation.*;
import com.example.taskmanagement.service.TaskService;
import com.example.taskmanagement.entity.Task;

import java.util.List;

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

    @GetMapping
    public List<Task> getAllTask(){
        return taskService.getAllTask();
    }

    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable Long id){
        return taskService.getTaskbyId(id);
    }

    @DeleteMapping("/{id}")
    public String deleteTaskById(@PathVariable Long id){
         taskService.deleteTaskById(id);
        return "entry deleted sucessfully";
    }


}
