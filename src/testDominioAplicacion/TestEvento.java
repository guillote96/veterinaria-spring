package testDominioAplicacion;



import java.util.Date;
import java.util.ArrayList;
import java.util.List;



import dominioAplicacion.Evento;
import dominioAplicacion.Mascota;
import dominioAplicacion.Tipo;
import dominioAplicacion.Veterinario;
import genericDAO.DAOFactory;



public class TestEvento {
	

	public static void main(String[] args) {
		
		//EventoImp e = new EventoImp();
		
		//MascotaImp m= new MascotaImp();
		
		
		altaEventoDeterminadaMascota();


       		
		//DAOFactory.getEventoDAOHibernateJPA().borrar(7);
		
		
	   //modificarEvento();
		
		
		//agregarTiposAEventos();
		
		
	

	}

	public static void agregarTiposAEventos() {
		//Agregar Tipos de evento
		Evento evento=DAOFactory.getEventoDAOHibernateJPA().buscar(7);
		List<Tipo> list= new ArrayList<Tipo>();
		list.add(DAOFactory.getTipoDAOHibernateJPA().buscar(2));
		list.add(DAOFactory.getTipoDAOHibernateJPA().buscar(3));
		evento.setTipos(list);
		DAOFactory.getEventoDAOHibernateJPA().modificar(evento);
	}

	public static void modificarEvento() {
		//Modificar Evento
		Evento evento=DAOFactory.getEventoDAOHibernateJPA().buscar(7);
		evento.setDescripcion("otra descripcion");
		DAOFactory.getEventoDAOHibernateJPA().modificar(evento);
	}

	public static void altaEventoDeterminadaMascota() {
		//Alta de evento para una determinada mascota y con su respectivo veterinario.
		Mascota mascota= DAOFactory.getMascotaDAOHibernateJPA().buscar(6);
	    Veterinario vet = DAOFactory.getVeterinarioDAOHibernateJPA().buscar(4);
		Evento evento = new Evento(new Date("29/10/2019"),"Una Descripcion",vet,0);
		evento.setMascota(mascota);
		DAOFactory.getEventoDAOHibernateJPA().alta(evento);
	}
	
	

}
