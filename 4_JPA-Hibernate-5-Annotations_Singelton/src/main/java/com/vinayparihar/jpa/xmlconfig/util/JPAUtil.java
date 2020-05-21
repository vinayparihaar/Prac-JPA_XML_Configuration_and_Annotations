/**
 * 
 */
package com.vinayparihar.jpa.xmlconfig.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author VinayParihar
 * @date May 14, 2020 @time 8:18:44 PM
 */
public class JPAUtil {

	private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = getEntityManagerFactory();

	public static EntityManagerFactory getEntityManagerFactory() {
		if (ENTITY_MANAGER_FACTORY == null) {
			return Persistence.createEntityManagerFactory("PERSISTENCE");
		}
		return ENTITY_MANAGER_FACTORY;
	}

	public static void shutdown() {
		if (ENTITY_MANAGER_FACTORY != null) {
			ENTITY_MANAGER_FACTORY.close();

		}
	}

}
