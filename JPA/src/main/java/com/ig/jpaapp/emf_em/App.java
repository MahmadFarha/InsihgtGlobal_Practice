package com.ig.jpaapp.emf_em;

import com.ig.jpaapp.model.User;

import jakarta.persistence.EntityManager;

public class App {
	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		
		//Create(Insert the records in the table - persist)
		User user1 = new User("Ram", 22);
		em.getTransaction().begin();
		em.persist(user1);
		em.getTransaction().commit();
		System.out.println("User Saved: "+user1);
		
		//Read(Find)
		User foundUser = em.find(User.class, user1.getId());
		System.out.println("User Found: "+foundUser);
		
		//Update
		em.getTransaction().begin();
		foundUser.setName("Jassu Bhai");
		em.getTransaction().commit();
		System.out.println("User Updated: "+foundUser);
		
		//Delete
		em.getTransaction().begin();
		em.remove(foundUser);
		em.getTransaction().commit();
		System.out.println("User Deleted");
		
		
		//Close EntityManager
		em.close();
		JPAUtil.close();
	}
}
