package implementacionDAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import InterfazDAO.DueñoDAO;
import dominioAplicacion.ConfiguracionPublica;
import dominioAplicacion.Dueño;
import genericDAO.EM;
import genericDAO.GenericDAOHibernateJPA;
@Repository

public class DueñoDAOHibernateJPA extends GenericDAOHibernateJPA<Dueño> implements DueñoDAO {
	

	public DueñoDAOHibernateJPA() {
		super(Dueño.class);
	}

	@Override
	public  Dueño buscarDueño(String email) {
		ArrayList<Dueño> dueño= (ArrayList<Dueño>) this.getEntityManager().createQuery("SELECT a FROM dominioAplicacion.Dueño a WHERE a.email='"+email+"'").getResultList();
		
		if(!dueño.isEmpty()) {
			return dueño.get(0);
		}
		return null;
		
		
	}
	
	public List<Dueño> listAllDueños() {
		List<Dueño> dueño= (ArrayList<Dueño>) this.getEntityManager().createQuery("SELECT a FROM dominioAplicacion.Dueño a").getResultList();
		return dueño;
		
		
	}

	
}
