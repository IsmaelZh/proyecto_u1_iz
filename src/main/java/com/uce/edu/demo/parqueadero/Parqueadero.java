package com.uce.edu.demo.parqueadero;

import org.springframework.stereotype.Component;

@Component
public class Parqueadero {

	private String nombre;
	private String direccion;
	
	//Metodos Get y Set 
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	
}
