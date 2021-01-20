package InterfazDAO;

import dominioAplicacion.Evento;
import dominioAplicacion.EventoTipo;
import dominioAplicacion.Tipo;

public interface EventoTipoDAO {
	
	//public EventoTipo buscarEventoTipo(int id);
	public Boolean altaEventoTipo (Evento objeto, Tipo objeto1);
	//public Boolean borrarEventoTipo(int id);
	//public Boolean modificarEventoTipo (EventoTipo objeto);


}
