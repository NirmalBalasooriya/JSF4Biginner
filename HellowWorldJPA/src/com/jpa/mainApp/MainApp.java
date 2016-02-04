package com.jpa.mainApp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpa.entity.Student;

public class MainApp {
	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("HellowWorldJPA");
		//"HellowWorldJPA" is the persistence unit name which we spesify in persistence.xml
		
		EntityManager em=emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Student std=new Student();
		std.setID(5);
		std.setFirstName("AANilanka");
		std.setLastName("AAASubhash");
		std.setAge(35);
		
		em.persist(std);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}
