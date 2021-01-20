package implementacionDAO;



import org.springframework.stereotype.Repository;

import InterfazDAO.TipoDAO;

import dominioAplicacion.Tipo;
import genericDAO.GenericDAOHibernateJPA;
@Repository
public class TipoDAOHibernateJPA extends GenericDAOHibernateJPA<Tipo> implements TipoDAO {


	public TipoDAOHibernateJPA() {
		super(Tipo.class);
	}


}
