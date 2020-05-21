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
 * @date May 14, 2020 @time 5:31:08 PM
 */
public class CRUD_Client_3_remove {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PERSISTENCE");
		EntityManager entitymanager = entityManagerFactory.createEntityManager();
		entitymanager.getTransaction().begin();

		Student student = entitymanager.find(Student.class, 4);

		entitymanager.remove(student);

		entitymanager.getTransaction().commit();

		entitymanager.close();
		entityManagerFactory.close();

		System.out.println("ID : " + student.getId() + " Deleted successfully. ");

	}

}
