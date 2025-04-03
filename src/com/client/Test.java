package com.client;

import org.hibernate.Session;

import com.configuration.HibernateUtil;
import com.model.Course;
import com.model.Student;

public class Test {

public static void main(String[] args) {
	
	Session session=HibernateUtil.getSessionFactory().openSession();

	Student s=new Student();
	s.setSid(3);
	s.setSname("jitendra");
	
	Student s1=new Student();
	s1.setSid(4);
	s1.setSname("rahulDada");
	
	Course c=new Course();
	c.setCid(104);
	c.setCname("Javac");
	
	Course c1=new Course();
	c1.setCid(105);
	c1.setCname("Pythons");
	
	c.getS().add(s);
	c.getS().add(s1);
	
	
	s.getC().add(c);
	s.getC().add(c1);
	
	session.save(s);
	
	session.beginTransaction().commit();
	
	}
}
