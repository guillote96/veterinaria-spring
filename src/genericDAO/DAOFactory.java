package genericDAO;

import InterfazDAO.AdministradorDAO;
import implementacionDAO.AdministradorDAOHibernateJPA;
import implementacionDAO.ConfiguracionPublicaDAOHibernateJPA;
import implementacionDAO.DueñoDAOHibernateJPA;
import implementacionDAO.EventoDAOHibernateJPA;
import implementacionDAO.EventoTipoDAOHibernateJPA;
import implementacionDAO.MascotaDAOHibernateJPA;
import implementacionDAO.TipoDAOHibernateJPA;
import implementacionDAO.VeterinarioDAOHibernateJPA;

public class DAOFactory {
	
	public static AdministradorDAOHibernateJPA getAdministradorDAO() {
		return new AdministradorDAOHibernateJPA();
		
	}
	
	public static ConfiguracionPublicaDAOHibernateJPA getConfiguracionPublicaDAO() {
		return new ConfiguracionPublicaDAOHibernateJPA();
		
	}
	
	public static DueñoDAOHibernateJPA getDueñoDAOHibernateJPA() {
		return new DueñoDAOHibernateJPA();
	}
	
	public static EventoDAOHibernateJPA getEventoDAOHibernateJPA() {
		return new EventoDAOHibernateJPA();
	}
	public static EventoTipoDAOHibernateJPA getEventoTipoDAOHibernateJPA() {
		return new EventoTipoDAOHibernateJPA();
	}
	
	public static TipoDAOHibernateJPA getTipoDAOHibernateJPA() {
		return new TipoDAOHibernateJPA();
	}
	
	public static MascotaDAOHibernateJPA getMascotaDAOHibernateJPA() {
		return new MascotaDAOHibernateJPA();
	}
	public static VeterinarioDAOHibernateJPA getVeterinarioDAOHibernateJPA() {
		return new VeterinarioDAOHibernateJPA();
	}

}
