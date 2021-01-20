package genericDAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
@Transactional
public class EM {
	private static EntityManagerFactory emf = (EntityManagerFactory) Persistence.createEntityManagerFactory("persistencia");
    private static EntityManager manager = emf.createEntityManager();
    @PersistenceContext
    public static EntityManager getEM() {
    	return manager;
    }

}
