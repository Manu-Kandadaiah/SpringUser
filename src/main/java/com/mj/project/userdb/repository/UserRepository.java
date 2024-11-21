package com.mj.project.userdb.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;


import com.mj.project.userdb.entity.User;



@Repository
public class UserRepository {

	EntityManagerFactory emf= Persistence.createEntityManagerFactory("mysql-config");
	
	public User addUser(User user) {
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		
		em.persist(user);
		
		et.commit();
		em.close();
		
		return user;
	}

	public List<User> getAllUser() {
		
		EntityManager em = emf.createEntityManager();
		
		Query query  = em.createQuery("from User user",User.class);
		
		List<User> students = query.getResultList();
		
		return students;
		
	}
	
public List<User> findUser(String userName) {
		
		EntityManager em = emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		
		
		
		List<User> students = (List<User>) em.find(User.class, userName);
		et.commit();
		em.close();
		return students;
		
	}
	
	
}
