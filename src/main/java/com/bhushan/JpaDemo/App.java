package com.bhushan.JpaDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {     
        Alien a = new Alien(1005, "Rajesh", "C#");
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        Alien b = em.find(Alien.class, 107);
        em.persist(a);
        em.getTransaction().commit();
        
        System.out.println("b is: " +b);
    }
}
