package controladoresApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import InterfazDAO.MascotaDAO;
import dominioAplicacion.Dueño;
import dominioAplicacion.Mascota;

@RestController
@RequestMapping(value= "/mascotas", produces = MediaType.APPLICATION_JSON_VALUE)
public class MascotaRestController {
	
	@Autowired
	private MascotaDAO mascota;
	
	@GetMapping("/duenio/{id}")
	public ResponseEntity<List<Mascota>> getMascotasDueño(@PathVariable("id") int id) {
         List <Mascota> list = mascota.listAllMascotaDeDueño(id);
         
	      if (list.isEmpty()) {
		       return new ResponseEntity<List<Mascota>>(HttpStatus.NO_CONTENT);
	       }
	       return new ResponseEntity<List<Mascota>>(list, HttpStatus.OK);
	}
	
	
	@PostMapping
	public ResponseEntity<Mascota> altaMascota(@RequestBody Mascota mascotaAux) {
	      mascota.alta(mascotaAux);
	      return new ResponseEntity<Mascota>(mascotaAux, HttpStatus.CREATED);
	}

}
