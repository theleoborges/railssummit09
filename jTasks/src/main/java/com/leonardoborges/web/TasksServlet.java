package com.leonardoborges.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.leonardoborges.models.Task;
import com.leonardoborges.services.TasksServices;

public class TasksServlet extends HttpServlet {
    ApplicationContext context = new ClassPathXmlApplicationContext(
            new String[] {"beans.xml"});	

    public void doPost(HttpServletRequest req, HttpServletResponse resp)
    		throws ServletException, IOException {
    	String summary = (String) req.getParameter("title");
    	String detail = (String) req.getParameter("description");
    	TasksServices tasksService = (TasksServices)context.getBean("tasksServices");
    	tasksService.save(new Task(summary, detail));
    	
    	resp.getOutputStream().println("<b>Task successfully created!</b>");
    }
}
