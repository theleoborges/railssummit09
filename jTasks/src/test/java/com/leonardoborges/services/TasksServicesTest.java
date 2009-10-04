package com.leonardoborges.services;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.leonardoborges.db.TasksRepository;
import com.leonardoborges.models.Task;

public class TasksServicesTest {
	
    @Test
    public void testSayHello() {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"beans.xml"});
        TasksServices tasksService = (TasksServices)context.getBean("tasksServices");
        Task task = new Task("need to finish this sample", 
        		"This is the sample that is going to be used for RailsSummit09");
        tasksService.save(task);
        System.out.println(tasksService.findAll());
    }

}
