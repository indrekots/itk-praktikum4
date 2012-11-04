package ee.itcollege.i377.praktikum4;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import ee.itcollege.i377.praktikum4.entities.Guard;

public class GuardDAO {
	
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("Praktikum4");
	
	public List<Guard> getGuards() {
		EntityManager em = emf.createEntityManager();
		try {
			TypedQuery<Guard> g = em.createNamedQuery("Guard.findAll", Guard.class);
			List<Guard> guards = g.getResultList();
			return guards;
		}
		finally {
			em.close();
		}
	}

}
