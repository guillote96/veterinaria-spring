package implementacionDAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import InterfazDAO.EventoDAO; 
import dominioAplicacion.Evento;
import genericDAO.GenericDAOHibernateJPA;
@Repository
public class EventoDAOHibernateJPA extends GenericDAOHibernateJPA<Evento> implements EventoDAO {

	public EventoDAOHibernateJPA() {
		super(Evento.class);
		
	}

	
	/*private static EntityManagerFactory emf = (EntityManagerFactory) Persistence.createEntityManagerFactory("persistencia");
    private static EntityManager manager = emf.createEntityManager();*/

	/*@Override
	public Evento buscarEvento(int id) {
		Evento evento = manager.find(Evento.class,id);
		return evento;
	}

	@Override
	public Boolean altaEvento(Evento objeto) {
		manager.getTransaction().begin();
		manager.merge(objeto);
	    manager.getTransaction().commit();
	    return true;
	}

	@Override
	public Boolean borrarEvento(int id) {
		Evento evento = manager.find(Evento.class, id);
		  if(evento != null) {
	        manager.getTransaction().begin();
	        manager.remove(evento);
	        manager.getTransaction().commit();
	        return true;
		  }
       return false;
     
	}

	@Override
	public Boolean modificarEvento(Evento objeto) {
		manager.getTransaction().begin();
        manager.merge(objeto);
        manager.getTransaction().commit();
        return true;
	}*/

}
