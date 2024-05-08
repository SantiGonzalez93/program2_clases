package imb.gc.program2.clases.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import imb.gc.program2.clases.entity.Mascota;

@RestController
public class MascotaController {

	@GetMapping ("/mascota")
	public Mascota infoDeMiMascota (){
		Mascota mascota = new Mascota();
		mascota.setNombre("Berto");
		mascota.setEdad(10);
		mascota.setRaza("caniche");
		mascota.setPeludo(true);
		return mascota;
	}
}
