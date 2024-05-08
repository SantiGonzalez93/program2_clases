package imb.gc.program2.clases.controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

// esto es una anotacion, afecta al bloque de codigo que sigue, actualmente estamos poniendo esto como controlador
@RestController

public class SaludoController {
	
	@GetMapping ("/hola")
	public String holaComoAndas (){
		
		return "Hola Como Andas";
		
	}

	
	
}