package imb.gc.program2.clases.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import imb.gc.program2.clases.entity.Pokemon;
import imb.gc.program2.clases.repository.PokemonRepository;
import imb.gc.program2.clases.service.IPokemonService;

@Service
public class PokemonServiceImpl implements IPokemonService {
	
	@Autowired
	private PokemonRepository repo;
	
	@Override
	public List<Pokemon> getAll() {
		return repo.findAll();
	}

	@Override
	public Pokemon getById(Long id) {
		Optional<Pokemon> optional;
		optional = repo.findById(id);
		if (optional.isPresent()) {
			return optional.get();
		}else {
			return null;
		}
		
	}

	@Override
	public Pokemon save(Pokemon pokemon){
		 return repo.save(pokemon);
		 
	}
	
	

}
