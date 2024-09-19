package imb.gc.program2.clases.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import imb.gc.program2.clases.entity.Pokemon;
import imb.gc.program2.clases.service.IPokemonService;


@RestController
public class PokemonController {

	@Autowired
	private IPokemonService service;

	@GetMapping("/pokemon")
	public ResponseEntity<Pokemon> obtenerTodosLosPokemones() {

		List<Pokemon> lista = service.getAll();

		if (lista.isEmpty()) {
			return  new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
		} else {
		    return new ResponseEntity(lista, HttpStatus.OK);
		}
	}

	
	@GetMapping("/pokemon/{id}")
	public ResponseEntity<Pokemon> obtenerPokemonPorId(@PathVariable("id") long id) {

		if (service.existe(id)) {
			return  new ResponseEntity<Pokemon>(service.getById(id), HttpStatus.OK);
			
		} else {
			 return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
		}
	}
	
	@PostMapping("/pokemon")
	public ResponseEntity<Pokemon> crearPokemon(@RequestBody Pokemon pokemon) {

		if (service.existe(pokemon.getId())) {
			return new ResponseEntity("El elemento que ya existe enviar por PUT", HttpStatus.BAD_REQUEST);
			
		} else {
			return new ResponseEntity<Pokemon>(service.save(pokemon), HttpStatus.CREATED);
		}

	}

	@PutMapping("/pokemon")
	public ResponseEntity<Pokemon> actualizarPokemon(@RequestBody Pokemon pokemon) {

		if (service.existe(pokemon.getId())) {
			return new ResponseEntity<Pokemon>(service.save(pokemon), HttpStatus.OK);
			
		} else {
			return new ResponseEntity("Es un nuevo elemento, enviar por POST",HttpStatus.BAD_REQUEST);
		
		}
	}
	
	@DeleteMapping("/pokemon/{id}")
	public ResponseEntity<Pokemon> borrarPokemon(@PathVariable("id") Long id) {
		if(service.existe(id)) {
			service.delete(id);
			return new ResponseEntity("Registro eliminado", HttpStatus.OK);
		}else {
			return new ResponseEntity("El elemento no existe", HttpStatus.BAD_REQUEST);
		}
	}

}
