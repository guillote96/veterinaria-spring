package InterfazDAO;

import java.util.List;

import dominioAplicacion.Dueño;
import genericDAO.GenericDAO;

public interface DueñoDAO extends GenericDAO<Dueño> {
	
	public Dueño buscarDueño(String email);
	public List<Dueño> listAllDueños();


}
