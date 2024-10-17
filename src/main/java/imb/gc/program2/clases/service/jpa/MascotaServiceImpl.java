package imb.gc.program2.clases.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import imb.gc.program2.clases.entity.Club;
import imb.gc.program2.clases.repository.ClubRepository;
import imb.gc.program2.clases.service.IClubService;


@Service
public class MascotaServiceImpl implements IClubService {

	@Autowired
	private ClubRepository clubRepository;

	@Override
	public List<Club> getAll() {

		return clubRepository.findAll();
	}

	@Override
	public Club getById(Long id) {

		return clubRepository.findById(id).orElse(null);
	}

	@Override
	public Club save(Club club) {
		return clubRepository.save(club);

	}

	@Override
	public void delete(Long id) {
		clubRepository.deleteById(id);

	}

	@Override
	public boolean exists(Long id) {
		if (id != null) {
			return clubRepository.existsById(id);
		} else {
			return false;
		}

	}
}
