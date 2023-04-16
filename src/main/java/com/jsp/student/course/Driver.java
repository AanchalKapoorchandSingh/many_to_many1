package com.jsp.student.course;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("aanchal");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	Student student=new Student();
	student.setName("neha");
	student.setEmail("sdftgyhj");
	
	Course c1=new Course();
	c1.setName("java");
	c1.setDuration(1);
	
	
	Course c2=new Course();
	c2.setName("sql");
	c2.setDuration(2);
	
	
	Course c3=new Course();
	c3.setName("web");
	c3.setDuration(3);
	
	ArrayList<Course>course=new ArrayList<Course>();
	course.add(c3);
	course.add(c2);
	course.add(c1);
	
	et.begin();
	em.persist(student);
	em.persist(c3);
	em.persist(c2);
	em.persist(c1);
	et.commit();
}
}
