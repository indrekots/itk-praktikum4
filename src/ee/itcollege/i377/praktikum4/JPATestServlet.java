package ee.itcollege.i377.praktikum4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ee.itcollege.i377.praktikum4.entities.Guard;

/**
 * Servlet implementation class JPATestServlet
 */
@WebServlet("/JPATestServlet")
public class JPATestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("Praktikum4");

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EntityManager em = emf.createEntityManager();
		try {
			Guard guard = em.find(Guard.class, 1);
			PrintWriter out = response.getWriter();
			out.println("Guard " + guard.getId() + ": " + guard.getName());
		}
		finally {
			em.clear();
		}
	}
	
	@Override
	public void destroy() {
		emf.close();
	}

}
