package implementacionDAO;




import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import InterfazDAO.MascotaDAO;
import dominioAplicacion.Dueño;
import dominioAplicacion.Mascota;
import genericDAO.GenericDAOHibernateJPA;
@Repository
public class MascotaDAOHibernateJPA extends GenericDAOHibernateJPA<Mascota> implements MascotaDAO{

	public MascotaDAOHibernateJPA() {
		super(Mascota.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Mascota> listAllMascotaDeDueño(int idDueño) {
		List<Mascota> dueño= (List<Mascota>) this.getEntityManager().createQuery("SELECT a FROM dominioAplicacion.Mascota a WHERE a.dueño.idDueño="+idDueño+"").getResultList();
		return dueño;
	}
	



}
