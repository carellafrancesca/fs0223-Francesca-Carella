package com.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	    private static final EntityManagerFactory entityManagerFactory;

	    static {
	        try {
	            entityManagerFactory = Persistence
	                    .createEntityManagerFactory("Giorno_5_Progetto5");
	        } catch (Throwable ex) {
	            System.err.println("Initial EntityManagerFactory creation failed."
	                    + ex);
	            throw new ExceptionInInitializerError(ex);
	        }
	    }

	    public static EntityManagerFactory getEntityManagerFactory() {
	        return entityManagerFactory;
	    }
}
	

