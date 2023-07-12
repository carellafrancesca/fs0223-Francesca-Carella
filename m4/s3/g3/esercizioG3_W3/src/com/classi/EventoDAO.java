package com.classi;

import java.sql.SQLException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import com.utili.JPAUtil;

public class EventoDAO extends JPAUtil{

	public EntityManagerFactory emf = getEntityManagerFactory();
	public EntityManager em = emf.createEntityManager();
	
	public void salvaEvento(Evento e) throws SQLException {
        em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();
        em.refresh(e);
        System.out.println(e);
    }

	public Evento leggiDettaglioEvento(long id) throws SQLException {
        em.getTransaction().begin();
        Evento e = em.find(Evento.class, id);
        em.getTransaction().commit();
        return e;
    }

	public void cancellaEvento(Evento e) throws SQLException {
        em.getTransaction().begin();
        em.remove(e);
        em.getTransaction().commit();
        em.refresh(e);
        System.out.println(e.getTitolo() + " " + e.getEventType() + " deleted!!!");
    }

	
}
