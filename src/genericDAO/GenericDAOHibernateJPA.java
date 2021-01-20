package genericDAO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Transactional
public class GenericDAOHibernateJPA<T> implements GenericDAO<T> {
	private EntityManager entityManager;
	
	@PersistenceContext
	public void setEntityManager (EntityManager em) {
		this.entityManager=em;
	}
	public EntityManager getEntityManager() {
		return entityManager;
	}
	
	
	protected Class <T> persistentClass;
	public GenericDAOHibernateJPA(Class <T> clase){
		this.persistentClass=clase;
	}
	
	public Class<T> getPersistentClass() {
		return this.persistentClass;
	}
	
	
	
	


	@Override
	public T buscar(int id) {
		//T obj = EM.getEM().find(this.getPersistentClass(),id);
		T obj = this.getEntityManager().find(this.getPersistentClass(),id);
		return obj;
	}

	@Override
	public Boolean alta(T entidad) {
		//EntityManager manager= EM.getEM();
		
		this.getEntityManager().getTransaction().begin();
		this.getEntityManager().persist(entidad);
		this.getEntityManager().getTransaction().commit();
	    return true;
	}

	@Override
	public Boolean borrar(int id) {
		T obj = this.getEntityManager().find(this.getPersistentClass(),id);
		//EntityManager manager= EM.getEM();
		if(obj != null) {
			this.getEntityManager().getTransaction().begin();
			this.getEntityManager().remove(obj);
			this.getEntityManager().getTransaction().commit();
	        return true;
		}
        return false;
	}

	@Override
	public Boolean modificar(T entidad) {
		//EntityManager manager= EM.getEM();
		this.getEntityManager().getTransaction().begin();
		this.getEntityManager().merge(entidad);
		this.getEntityManager().getTransaction().commit();
        return true;
	}
	
	

}
