package imb.gc.program2.clases.service;

import java.util.List;

import org.springframework.stereotype.Service;

import imb.gc.program2.clases.entity.Pokemon;

@Service
public interface IPokemonService {
	
	public List <Pokemon> getAll();
	public Pokemon getById(Long id);
	public Pokemon save(Pokemon pokemon);
	//public delete();
}
