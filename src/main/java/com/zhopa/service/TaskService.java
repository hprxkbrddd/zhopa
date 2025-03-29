package com.zhopa.service;

import com.zhopa.model.Task;
import com.zhopa.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {
    private final TaskRepository repository;

    public List<Task> getAllTasks(){
        return repository.findAll();
    }
}
