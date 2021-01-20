package InterfazDAO;

import java.util.List;

import dominioAplicacion.Mascota;
import genericDAO.GenericDAO;

public interface MascotaDAO extends GenericDAO<Mascota>  {
	public List<Mascota> listAllMascotaDeDueño(int idDueño);


}
