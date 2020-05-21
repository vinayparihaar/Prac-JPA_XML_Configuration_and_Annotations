/**
 * 
 */
package com.vinayparihar.jpa.xmlconfig.client;

import javax.persistence.EntityManager;

import com.vinayparihar.jpa.xmlconfig.model.Student;
import com.vinayparihar.jpa.xmlconfig.util.JPAUtil;

/**
 * @author VinayParihar
 * @date May 14, 2020 @time 2:48:31 PM
 */
public class CRUD_Client_0_persiste {

	public static void main(String[] args) {
		Student student = new Student();
		// student.setId(1);
		student.setFirstName("aadhya");
		student.setLastName("Parihar");
		student.setEmail("aadhya@gmail.com");

		EntityManager entitymanager = JPAUtil.getEntityManagerFactory().createEntityManager();

		entitymanager.getTransaction().begin();

		entitymanager.persist(student);

		entitymanager.getTransaction().commit();

		entitymanager.close();

		JPAUtil.shutdown();

	}

}
