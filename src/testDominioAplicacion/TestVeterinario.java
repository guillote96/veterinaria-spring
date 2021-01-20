package testDominioAplicacion;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominioAplicacion.Mascota;
import dominioAplicacion.Veterinario;
import genericDAO.DAOFactory;


public class TestVeterinario {


	public static void main(String[] args) {
		
		
		Veterinario vet = buscarVeterinario();
		
	    modificarVeterinario();
		
		//Eliminar Veterinario
		DAOFactory.getVeterinarioDAOHibernateJPA().borrar(4);
		
		
		
		
		
		
		
		


	}

	public static void modificarVeterinario() {
		//Modificar veterinario
		Veterinario vet=DAOFactory.getVeterinarioDAOHibernateJPA().buscar(4);
		vet.setApellido("otroApellido");
		DAOFactory.getVeterinarioDAOHibernateJPA().modificar(vet);
	}

	public static Veterinario buscarVeterinario() {
		//Buscar Veterinario
		Veterinario vet=DAOFactory.getVeterinarioDAOHibernateJPA().buscar(4);
		return vet;
	}
	


}
