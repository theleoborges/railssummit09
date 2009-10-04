package com.leonardoborges.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leonardoborges.db.TasksRepository;
import com.leonardoborges.models.Task;

@Service
public class TasksServices {
    @Autowired
    private TasksRepository repository;
    
    public Collection<Task> findAll() {
    	return repository.findAll();
    }
    
    public void save(Task task) {
    	repository.save(task);
    }
}
