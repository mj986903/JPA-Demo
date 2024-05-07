package com.mohit.JPADemo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
    	/*
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();
        
        Alien a = em.find(Alien.class, 500);
        System.out.println(a);
        */
    	
    	Alien a = new Alien();
    	a.setAid(1);
    	a.setName("Joshi");
    	
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(a);
    	tx.commit();
    	
    	Alien al = em.find(Alien.class, 1);
        System.out.println(al);
    }
}
