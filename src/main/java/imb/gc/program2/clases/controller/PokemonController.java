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
		List<Pokemon> pokemones = service.getAll();
		return pokemones;	
	}
	
	@GetMapping("/pokemon/{id}")
	public Pokemon obtenerPokemonPorId (@PathVariable("id")long id) {
		Pokemon pokemon = service.getById(id);
		return pokemon;
	}
	
	@PostMapping("/pokemon")
	public Pokemon crearPokemon(@RequestBody Pokemon pokemon){
		return service.save(pokemon);
	}
	
	@PutMapping("/actualizarPokemon/{id}")
	public Pokemon actualizarPokemon (@PathVariable long id,  @RequestBody Pokemon pokemon) {
		
		Pokemon pokemonViejo = service.getById(id);
		
		if (pokemonViejo != null) {
			pokemonViejo.setAtaque(pokemon.getAtaque());
			pokemonViejo.setColor(pokemon.getColor());
			pokemonViejo.setGeneracion(pokemon.getGeneracion());
			pokemonViejo.setNombre(pokemon.getNombre());
			pokemonViejo.setTerritorio(pokemon.getTerritorio());
			pokemonViejo.setPrevia(pokemon.getPrevia());
			pokemonViejo.setProxima(pokemon.getProxima());
			pokemonViejo.setTipo(pokemon.getTipo());
			return service.save(pokemonViejo);
			
		}else {
			return null;
		}
	
	}

	
}
