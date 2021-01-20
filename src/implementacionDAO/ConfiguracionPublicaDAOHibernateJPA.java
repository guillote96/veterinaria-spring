package implementacionDAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import InterfazDAO.ConfiguracionPublicaDAO;
import dominioAplicacion.Administrador;
import dominioAplicacion.ConfiguracionPublica;
import genericDAO.EM;
import genericDAO.GenericDAOHibernateJPA;
@Repository
public class ConfiguracionPublicaDAOHibernateJPA extends GenericDAOHibernateJPA<ConfiguracionPublica> implements ConfiguracionPublicaDAO {
	

	public ConfiguracionPublicaDAOHibernateJPA() {
		super(ConfiguracionPublica.class);
		// TODO Auto-generated constructor stub
	}


}
