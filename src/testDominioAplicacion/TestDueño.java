package testDominioAplicacion;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominioAplicacion.Administrador;
import dominioAplicacion.ConfiguracionPublica;
import dominioAplicacion.Dueño;
import dominioAplicacion.Mascota;
import dominioAplicacion.Veterinario;
import genericDAO.DAOFactory;


public class TestDueño {


	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		
		//altaDueño();
		//agregarMascotasDueños();
		
		//modificarDueño();
		   
		//modificarConfiguracionDueño();
		   
		/*ConfiguracionPublica cp=DAOFactory.getConfiguracionPublicaDAO().buscar(19);
		DAOFactory.getConfiguracionPublicaDAO().borrar(cp.getIdConfiguracionPublica());*/
       
		   
		    
		   
		   
	}

	public static void agregarMascotasDueños() {
		//Agregar para determinado dueño sus mascotas (En este caso
		   Dueño dueño= DAOFactory.getDueñoDAOHibernateJPA().buscarDueño("bla@gmail.com");
		   List <Mascota> list = new ArrayList<Mascota>();
		   Veterinario v= new Veterinario("NombVet", "apeVet", "0051349","vet@vet.com","ghasas",
					"DomVet", false);
		   list.add(new Mascota("bla1",new Date("13/10/2005"),"Perra","mantoNegro","hembra","negra","manchas marrones",dueño));
		   list.add(new Mascota("bla2",new Date("13/10/2005"),"Perra","Labradora","hembra","negra","Ninguna",dueño,v));
		   
		   dueño.setMascotas(list);
		   DAOFactory.getDueñoDAOHibernateJPA().modificar(dueño);
	}

	public static void modificarConfiguracionDueño() {
		//modificar configuracion de determinado Dueño
		 Dueño dueño= DAOFactory.getDueñoDAOHibernateJPA().buscarDueño("guillotejuarez96@gmail.com");
		   dueño.getConfiguracion().setNombre(false);
		   DAOFactory.getDueñoDAOHibernateJPA().modificar(dueño);
	}

	public static void modificarDueño() {
		//Modificar Dueño
		 Dueño dueño= DAOFactory.getDueñoDAOHibernateJPA().buscarDueño("guillotejuarez96@gmail.com");
		   dueño.setApellido("apellidoModificad");
		   DAOFactory.getDueñoDAOHibernateJPA().modificar(dueño);
	}

	public static void altaDueño() {
		// Alta Dueño con su respectiva configuracion publica (Cuando se hace el alta del usuario se hace su configuracion publica en su tabla)
		ConfiguracionPublica cp= new ConfiguracionPublica(true, false, true, false, false, true, true);
		Dueño dueño = new Dueño("bla","Juárez","02032520","bla@gmail.com","1234",cp);
		DAOFactory.getDueñoDAOHibernateJPA().alta(dueño);
	}
	
	

}
