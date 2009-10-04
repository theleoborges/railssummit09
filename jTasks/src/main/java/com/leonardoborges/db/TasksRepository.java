package com.leonardoborges.db;

import java.util.Collection;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.leonardoborges.models.Status;
import com.leonardoborges.models.Task;

@Repository
public class TasksRepository {
    private HibernateTemplate hibernateTemplate;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.hibernateTemplate = new HibernateTemplate(sessionFactory);
    }
    
    public void save(Task task) {
    	this.hibernateTemplate.save(task);
    }
    
    public Collection<Task> findAll() {
    	return this.hibernateTemplate.find("from com.leonardoborges.models.Task");
    }
    
    public Collection<Task> findByStatus(Status status) {
    	return this.hibernateTemplate.find("from com.leonardoborges.models.Task t where t.status = ? ", 
    			status.toString());
    }

}
