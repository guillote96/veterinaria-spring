package implementacionDAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import InterfazDAO.VeterinarioDAO;
import dominioAplicacion.Tipo;
import dominioAplicacion.Veterinario;
import genericDAO.GenericDAOHibernateJPA;
@Repository
public class VeterinarioDAOHibernateJPA extends GenericDAOHibernateJPA<Veterinario>implements VeterinarioDAO {

	public VeterinarioDAOHibernateJPA() {
		super(Veterinario.class);
		// TODO Auto-generated constructor stub
	}


}
