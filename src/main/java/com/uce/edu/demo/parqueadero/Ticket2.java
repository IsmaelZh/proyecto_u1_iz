package com.uce.edu.demo.parqueadero;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class Ticket2 {

	private LocalDateTime fechaIngreso;

	private Cliente cliente;
	private Parqueadero parqueadero;

	// 2) DI por constructor
	public Ticket2(Cliente cliente, Parqueadero parqueadero) {
		this.cliente = cliente;
		this.parqueadero = parqueadero;
	}

	public String registrar(LocalDateTime fechaIngreso, String nombre, String apellido, int cedula, String vehiculo,
			String nombreP, String direccionP) {

		this.fechaIngreso = fechaIngreso;

		this.cliente.setNombre(nombre);
		this.cliente.setApellido(apellido);
		this.cliente.setCedula(cedula);
		this.cliente.setVehiculo(vehiculo);

		this.parqueadero.setNombre(nombreP);
		this.parqueadero.setDireccion(direccionP);

		return "Ingreso registrado (DI por costructor)";

	}

}
