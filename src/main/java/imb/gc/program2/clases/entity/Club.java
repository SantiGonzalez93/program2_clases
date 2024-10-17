package imb.gc.program2.clases.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Club {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long id;
	private String nombre;
	private String ciudad;
	private String categoria;
	private Integer socios;
	
	//esto es un ejemplo de encapsulamiento
	private boolean juegaCopa;
	
	
	public Club() {
		
	}
	
	
	


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCiudad() {
		return ciudad;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public Integer getSocios() {
		return socios;
	}


	public void setSocios(Integer socios) {
		this.socios = socios;
	}

	//Es un getter
	public boolean isJuegaCopa() {
		return juegaCopa;
	}

	//esto es un setter
	public void setJuegaCopa(boolean juegaCopa) {
		this.juegaCopa = juegaCopa;
	}
	
	
	public Long getId() {
		return this.id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	
}