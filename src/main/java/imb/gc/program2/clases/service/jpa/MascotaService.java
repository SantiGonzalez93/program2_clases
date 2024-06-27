package imb.gc.program2.clases.service.jpa;

import java.util.ArrayList;
import java.util.List;

import imb.gc.program2.clases.entity.Mascota;

public class MascotaService {
	
	public List<Mascota> getTresMascotas () {
		
		List<Mascota> lsMascota = new ArrayList<Mascota>();
		
		Mascota mascota1 = new Mascota();
		mascota1.setNombre("Fido");
		mascota1.setRaza("Perro");
		mascota1.setEdad(4);
		mascota1.setPeludo(true);
					
		Mascota mascota2 = new Mascota();
		mascota2.setNombre("Wolf");
		mascota2.setRaza("Obejero");
		mascota2.setEdad(3);
		mascota2.setPeludo(true);
		
		Mascota mascota3 = new Mascota();
		mascota3.setNombre("Firulais");
		mascota3.setRaza("Perro");
		mascota3.setEdad(5);
		mascota3.setPeludo(true);
		
		lsMascota.add(mascota1);
		lsMascota.add(mascota2);
		lsMascota.add(mascota3);
		
		return lsMascota;
	}

}
