package testDominioAplicacion;


import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominioAplicacion.ConfiguracionPublica;
import dominioAplicacion.Dueño;
import dominioAplicacion.Evento;
import dominioAplicacion.Mascota;
import dominioAplicacion.Veterinario;
import genericDAO.DAOFactory;


public class TestMascota {


	public static void main(String[] args) {

		
		
		//editarMascota();
		
		
		//altaMascota();
		
		
		
		//Eliminar Mascota
		// DAOFactory.getMascotaDAOHibernateJPA().borrar(9);
		
		
		

	}

	public static void altaMascota() {
		//Dar de alta una mascota y tambien hace alta de dueño y configuracion publica (Las tablas al estar 
		//relacionadas, si el dueño no esta cargado, lo da de alta)
		ConfiguracionPublica cp= new ConfiguracionPublica(true, false, true, false, false, true, true);
	
	    Dueño dueño = new Dueño("dueñNomb","dueñoApe","02032520","nomape@gmail.com","1234",cp);
	
	     DAOFactory.getMascotaDAOHibernateJPA().alta((new Mascota("Nnnn",new Date("13/10/2005"),"Perra","mantoBLanc","macho","blanco","manchas marrones",dueño)));
	}

	public static void editarMascota() {
		// Editar Mascota
		Mascota mascota=   DAOFactory.getMascotaDAOHibernateJPA().buscar(6);
		
		mascota.setColor("bla");

		DAOFactory.getMascotaDAOHibernateJPA().modificar(mascota);
	}


}
