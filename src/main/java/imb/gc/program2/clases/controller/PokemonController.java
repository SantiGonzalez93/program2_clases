package imb.gc.program2.clases.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import imb.gc.program2.clases.entity.Pokemon;
import imb.gc.program2.clases.entity.TipoPokemon;
import imb.gc.program2.clases.service.IPokemonService;
import jakarta.persistence.ManyToOne;


@RestController
public class PokemonController {
	
	@Autowired
	private IPokemonService service;
	
	@GetMapping("/pokemon")
	public List<Pokemon> obtenerTodosLosPokemones(){
		return service.getAll();
			
	}
	
	@GetMapping("/pokemon/{id}")
	public Pokemon obtenerPokemonPorId (@PathVariable("id")long id) {
		return  service.getById(id);
		
	}
	
	@PostMapping("/pokemon")
	public Pokemon crearPokemon(@RequestBody Pokemon pokemon){
		return service.save(pokemon);
	}
	
	@PutMapping("/actualizarPokemon")
	public Pokemon actualizarPokemon (@RequestBody Pokemon pokemon) {
	
			return service.save(pokemon);
				
	}

	
}
