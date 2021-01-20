package testDominioAplicacion;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dominioAplicacion.Administrador;
import genericDAO.DAOFactory;

import implementacionDAO.AdministradorDAOHibernateJPA;
import ttps.spring.config.AppConfig;

public class TestAdministrador {


	public static void main(String[] args) {
	 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    // System.out.println("Spring container está listo!!");
	//UserController bean = context.getBean(UserController.class);
	//bean.doSomething();


		
		//Buscar por nombre
		//Administrador entidad=DAOFactory.getAdministradorDAO().buscarAdministrador("safasfasdf");
		
		
		//System.out.println(entidad);
		
		
		//Alta Entidad
		//DAOFactory.getAdministradorDAO().alta(entidad);
		
		//Modificar un usuario
		//entidad.setPassword("cambiado");
		//DAOFactory.getAdministradorDAO().modificar(entidad);
		
		// Eliminar Administrador
		//DAOFactory.getAdministradorDAO().borrar(4);
		
		
		
		
		
		

	}
	
	

}
