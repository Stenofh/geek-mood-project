package com.geekmood.server.bean;

import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;

import com.geekmood.server.connection.JPAFactory;
import com.geekmood.server.model.User;

@ManagedBean
public class UserBean {
    
    private EntityManager entityManager = JPAFactory.getEntityManager();
    User user = new User();
    
    public void inserir(){
	entityManager.getTransaction().begin();
	
	user.setImagePath("sdcard://teste.png");
	entityManager.persist(user);
	
	entityManager.getTransaction().commit();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    
}
