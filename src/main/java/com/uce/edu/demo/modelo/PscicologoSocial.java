package com.uce.edu.demo.modelo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PscicologoSocial {
	
	private String nombre;
	private String apellido;
	private String cedula;
	private String edad;
	
	@Override
	public String toString() {
		return "PscicologoSocial [nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", edad=" + edad
				+ "]";
	}
	
	//Set y Get 
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
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	
	

}
