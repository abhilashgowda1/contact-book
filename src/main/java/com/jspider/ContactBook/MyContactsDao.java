package com.jspider.ContactBook;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

@Component
public class MyContactsDao {
  public void savecontact(Mycontacts mc) {
	  EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("abhi");
	  EntityManager entityManager=entityManagerFactory.createEntityManager();
	  EntityTransaction  entityTransaction=entityManager.getTransaction();
	   
	  entityTransaction.begin();
	  entityManager.persist(mc);
	  entityTransaction.commit();
  }
  public List<Mycontacts> getAllContacts() {
	  EntityManagerFactory emf =Persistence.createEntityManagerFactory("abhi");
	  EntityManager em=emf.createEntityManager();
	  Query q=em.createQuery("select c from Mycontact c",Mycontacts.class);
	   List<Mycontacts> contacts=q.getResultList();
	return contacts;
	   
  }
}
