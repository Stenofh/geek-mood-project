package com.geekmood.server.connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAFactory {

    private EntityManagerFactory factory;
    private static JPAFactory jpaFactory;

    private JPAFactory() {
	factory = Persistence.createEntityManagerFactory("nerd_mood");
    }

    public static synchronized JPAFactory getInstance() {
	if (jpaFactory == null) {
	    jpaFactory = new JPAFactory();
	}
	return jpaFactory;
    }

    public EntityManager getEntityManager() {
	return factory.createEntityManager();
    }

}
