/**
 * 
 */
package com.vinayparihar.jpa.xmlconfig.client;

import javax.persistence.EntityManager;

import com.vinayparihar.jpa.xmlconfig.model.Student;
import com.vinayparihar.jpa.xmlconfig.util.JPAUtil;

/**
 * @author VinayParihar
 * @date May 14, 2020 @time 5:31:08 PM
 */
public class CRUD_Client_3_remove {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		EntityManager entitymanager = JPAUtil.getEntityManagerFactory().createEntityManager();
		entitymanager.getTransaction().begin();

		Student student = entitymanager.find(Student.class, 2);

		entitymanager.remove(student);

		entitymanager.getTransaction().commit();

		entitymanager.close();
		JPAUtil.shutdown();

		System.out.println("ID : " + student.getId() + " Deleted successfully. ");

	}

}
