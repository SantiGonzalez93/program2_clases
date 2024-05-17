package imb.gc.program2.clases.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import imb.gc.program2.clases.entity.Mascota;
import imb.gc.program2.clases.service.IMascotaService;
import imb.gc.program2.clases.service.MascotaService;

@RestController
public class MascotaController {
	
	
	//inyeccion de dependencia
	@Autowired
	private IMascotaService service;
	
	@GetMapping ("/mascota")
	public Mascota infoDeMiMascota (){
		Mascota mascota = new Mascota();
		mascota.setNombre("Berto");
		mascota.setEdad(10);
		mascota.setRaza("caniche");
		mascota.setPeludo(true);
		return mascota;
	}
		
	@GetMapping ("/mascotas")
	public List<Mascota> infoDeTresMascotas() {
		return service.buscarTodos();
	}
	
	
	
}
