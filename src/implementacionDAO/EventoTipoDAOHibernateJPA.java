package implementacionDAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import InterfazDAO.EventoTipoDAO;
import dominioAplicacion.Evento;
import dominioAplicacion.EventoTipo;
import dominioAplicacion.Tipo;
import genericDAO.EM;
import genericDAO.GenericDAOHibernateJPA;
@Repository
public class EventoTipoDAOHibernateJPA extends GenericDAOHibernateJPA<EventoTipo> implements EventoTipoDAO {

    
	public EventoTipoDAOHibernateJPA() {
		super(EventoTipo.class);
	}

	@Override
	public Boolean altaEventoTipo(Evento objeto, Tipo objeto1) {
		EntityManager manager= EM.getEM();
		EventoTipo eventotipo= new EventoTipo(objeto,objeto1);
		manager.getTransaction().begin();
		manager.persist(eventotipo);
	    manager.getTransaction().commit();
	    return true;
	}
	

}
