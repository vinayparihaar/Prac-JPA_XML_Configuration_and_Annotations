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
 * @date May 14, 2020 @time 2:48:31 PM
 */
public class CRUD_Client_1_persiste {

	public static void main(String[] args) {
		Student student = new Student();
		// student.setId(1);
		student.setFirstName("Aaryan1");
		student.setLastName("Parihar1");
		student.setEmail("aaryan1@gmail.com");

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PERSISTENCE");

		EntityManager entitymanager = entityManagerFactory.createEntityManager();
		entitymanager.getTransaction().begin();

		entitymanager.persist(student);

		entitymanager.getTransaction().commit();

		entitymanager.close();
		entityManagerFactory.close();

		System.out.println("Record Inserted Successfully from CRUD_Client_1_persiste");
	}

}
