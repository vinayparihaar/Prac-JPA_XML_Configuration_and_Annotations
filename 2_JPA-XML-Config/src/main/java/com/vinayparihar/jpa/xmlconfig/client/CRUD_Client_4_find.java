/**
 * 
 */
package com.vinayparihar.jpa.xmlconfig.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.vinayparihar.jpa.xmlconfig.model.Student;

/**
 * @author VinayParihar
 * @date May 14, 2020 @time 5:36:54 PM
 */
public class CRUD_Client_4_find {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PERSISTENCE");
		EntityManager entitymanager = entityManagerFactory.createEntityManager();
		// entitymanager.getTransaction().begin();

		Student student = entitymanager.find(Student.class, 1);

		System.out.println("Student Details :");
		System.out.println("Student ID : " + student.getId());
		System.out.println("First Name : " + student.getFirstName());
		System.out.println("Last Name : " + student.getLastName());
		System.out.println("Email : " + student.getEmail());
		entitymanager.getTransaction().commit();

		// entitymanager.close();
		entityManagerFactory.close();

	}

}
