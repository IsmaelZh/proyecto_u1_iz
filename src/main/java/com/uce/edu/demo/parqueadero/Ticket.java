package com.uce.edu.demo.parqueadero;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Ticket {

	private LocalDateTime fechaIngreso;

	// 1) DI por atributos
	@Autowired
	private Cliente cliente;
	@Autowired
	private Parqueadero parqueadero;

	public String registrar(LocalDateTime fechaIngreso, String nombre, String apellido, int cedula, String vehiculo,
			String nombreP, String direccionP) {

		this.fechaIngreso = fechaIngreso;

		this.cliente.setNombre(nombre);
		this.cliente.setApellido(apellido);
		this.cliente.setCedula(cedula);
		this.cliente.setVehiculo(vehiculo);

		this.parqueadero.setNombre(nombreP);
		this.parqueadero.setDireccion(direccionP);

		return "Ingreso registrado (DI por atributos)";

	}

}
