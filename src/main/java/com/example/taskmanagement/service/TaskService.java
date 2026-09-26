package com.example.taskmanagement.service;

import com.example.taskmanagement.entity.Task;
import org.springframework.stereotype.Service;
import com.example.taskmanagement.repository.TaskRepository;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }

    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

}
