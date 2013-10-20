package com.geekmood.server.connection;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAFactory implements Serializable{

    private static final long serialVersionUID = 1L;
    private static EntityManagerFactory entityManagerFactory;

    /*
     * Cria a unidade de persistencia de acordo com o persistence.xml. Na hora
     * da montagem da classe pela JVM ele ja faz esse bloco
     */
    static {
	entityManagerFactory = Persistence
		.createEntityManagerFactory("nerd_mood");
    }

    // Recupera o entityManager criado a partir da factory
    public static EntityManager getEntityManager() {
	return entityManagerFactory.createEntityManager();
    }

    public void close(EntityManager em) {
	em.close();
    }

}
