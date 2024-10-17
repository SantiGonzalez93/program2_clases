package imb.gc.program2.clases.service;

import java.util.List;

import imb.gc.program2.clases.entity.Club;

public interface IClubService {

	public abstract List<Club> getAll();
	public abstract Club getById(Long id);
	public abstract Club save(Club club);
	public abstract void delete(Long id);
	public abstract boolean exists(Long id);
}
