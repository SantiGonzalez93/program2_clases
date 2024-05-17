package imb.gc.program2.clases.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import imb.gc.program2.clases.entity.Mascota;
import imb.gc.program2.clases.repository.MascotaRepository;

@Service
public class MascotaServiceImpl implements IMascotaService {

	@Autowired
	private MascotaRepository repo;
	
	
	@Override
	public List<Mascota> buscarTodos() {
				
		return this.repo.findAll(); 
	}

	
	

}
