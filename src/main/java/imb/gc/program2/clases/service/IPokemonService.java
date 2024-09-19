package imb.gc.program2.clases.service;

import java.util.List;

import org.springframework.stereotype.Service;

import imb.gc.program2.clases.entity.Pokemon;

@Service
public interface IPokemonService {
	
	public abstract List <Pokemon> getAll();
	public abstract  Pokemon getById(Long id);
	public abstract Pokemon save(Pokemon pokemon);
	public abstract void delete(Long id);
	public boolean existe(Long id);
}
