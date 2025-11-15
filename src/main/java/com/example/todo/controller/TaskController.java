package com.example.todo.controller;

import com.example.todo.entity.Task;
import com.example.todo.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    @PostMapping
    public Task AddTask(@RequestBody Task task){
        return service.addTask(task);
    }

    @GetMapping
    public List<Task> getAll(){
        return service.getAllTasks();
    }


    @GetMapping("/{id}")
    public Task getById(@PathVariable Integer id){
        return service.getTaskById(id);
    }

    @PutMapping("/{id}")
    public Task updateTask(@PathVariable Integer id,@RequestBody Task task){
        return service.updateTask(id,task);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable  Integer id){
        boolean deleted = service.deleteTask(id);
        return deleted ? "Deleted SuccessFully" :"Task not found";
    }
}
