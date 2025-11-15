package com.example.todo.service;

import com.example.todo.entity.Task;
import com.example.todo.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository repo;

    public TaskService(TaskRepository repo){
        this.repo = repo;
    }

    public Task addTask(Task task){
        return repo.save(task);
    }

    public List<Task> getAllTasks(){
        return repo.findAll();
    }

    public Task getTaskById(Integer id){
        return repo.findById(id).orElse(null);
    }

    public Task updateTask(Integer id,Task updated){
        Task existing = repo.findById(id).orElse(null);
        if(existing == null){
            return null;
        }
        existing.setTitle(updated.getTitle());
        existing.setCompleted(updated.isCompleted());
        return repo.save(existing);

    }

    public boolean deleteTask(Integer id){
        if(!repo.existsById(id)){
            return false;
        }
        repo.deleteById(id);
        return true;
    }
}
