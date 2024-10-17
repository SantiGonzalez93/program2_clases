package imb.gc.program2.clases.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import imb.gc.program2.clases.dto.ResponseDTO;
import imb.gc.program2.clases.entity.Club;
import imb.gc.program2.clases.service.IClubService;

@RestController
@RequestMapping("/club")
public class ClubController {
	
	@Autowired
	private IClubService service;
	
	
	
	@GetMapping()
	public ResponseDTO<List<Club>> getAll(){
		
		
		List<Club> list = new ArrayList<>();
		
		list = service.getAll();
		
		ResponseDTO<List<Club>> dto;
		
		dto = new ResponseDTO<>();
		
		if(list.isEmpty()) {
			dto.setEstado(false);
			dto.setMensaje("No se encontraron Clubes");
		}else {
			dto.setEstado(true);
			dto.setMensaje("Se encontraron los siguientes Clubes: ");
			dto.setDato(list);
		}
		return dto;
	}
	
	public Club getById(){
		
		
		
		return null;
	}
	
	public void save(){
		
	}
	
	
	public void update(){}
	
	
	public void delete(){
		
	}
	
	
}
