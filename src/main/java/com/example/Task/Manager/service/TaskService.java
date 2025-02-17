package com.example.Task.Manager.service;

import com.example.Task.Manager.entities.Task;
import com.example.Task.Manager.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }
    public Task getTaskById(Long id) {
        return taskRepository.findById(id).orElse(null);
    }
    public Task saveTask(Task task) {
        return taskRepository.save(task);
    }
    public void deleteTaskById(Long id) {
        taskRepository.deleteById(id);
    }
}
