package com.uce.edu.demo.parqueadero;

import org.springframework.stereotype.Component;

@Component
public class Cliente {

	private String nombre;
	private String apellido;
	private int cedula;
	private String vehiculo;
	
	//Metodos Set y Get 
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getCedula() {
		return cedula;
	}
	public void setCedula(int cedula) {
		this.cedula = cedula;
	}
	public String getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(String vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	
}
