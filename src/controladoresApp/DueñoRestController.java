package controladoresApp;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import InterfazDAO.DueñoDAO;
import dominioAplicacion.Dueño;
import genericDAO.GenericDAO;
import implementacionDAO.DueñoDAOHibernateJPA;


@RestController
@RequestMapping(value= "/duenio", produces = MediaType.APPLICATION_JSON_VALUE)
public class DueñoRestController {
	@Autowired
	private DueñoDAO dueño;
	
	@GetMapping("/{id}")
	public ResponseEntity<Dueño> getDueño(@PathVariable("id") int id) {
          Dueño d = dueño.buscar(id);
	      if (d == null) {
		       return new ResponseEntity<Dueño>(HttpStatus.NO_CONTENT);
	       }
	       return new ResponseEntity<Dueño>(d, HttpStatus.OK);
	}
	
	
	@GetMapping
	public ResponseEntity <List<Dueño>> listAllDueños() {	
	  List<Dueño> list= dueño.listAllDueños();
	  if(list.isEmpty()){
	    return new ResponseEntity <List<Dueño>> (HttpStatus.NO_CONTENT);
	   }
	  return new ResponseEntity <List<Dueño>> (list, HttpStatus.OK);
	}
	
	



	
	


}
