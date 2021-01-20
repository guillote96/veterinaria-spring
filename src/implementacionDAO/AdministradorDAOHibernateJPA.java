package implementacionDAO;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import InterfazDAO.AdministradorDAO;
import dominioAplicacion.Administrador;
import genericDAO.EM;
import genericDAO.GenericDAOHibernateJPA;

@Repository
public class AdministradorDAOHibernateJPA extends GenericDAOHibernateJPA<Administrador> implements AdministradorDAO {

	public AdministradorDAOHibernateJPA() {
		super(Administrador.class);

	}
    
	@Override
	public Administrador buscarAdministrador(String username) {
		EntityManager manager= EM.getEM();
		ArrayList<Administrador> admin= (ArrayList<Administrador>) manager.createQuery("SELECT a FROM dominioAplicacion.Administrador a WHERE a.username='"+username+"'").getResultList();
		
		if(!admin.isEmpty()) {
			return admin.get(0);
		}
		return null;
	}

	
	

}
