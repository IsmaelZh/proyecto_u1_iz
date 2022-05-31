package com.uce.edu.demo.parqueadero;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Ticket3 {

	private LocalDateTime fechaIngreso;

	// 3) DI por metodos set
	private Cliente cliente;         // Se agrega a su metodo set con @Autowired
	private Parqueadero parqueadero; // Se agrega a su metodo set con @Autowired

	public String registrar(LocalDateTime fechaIngreso, String nombre, String apellido, int cedula, String vehiculo,
			String nombreP, String direccionP) {

		this.fechaIngreso = fechaIngreso;

		this.cliente.setNombre(nombre);
		this.cliente.setApellido(apellido);
		this.cliente.setCedula(cedula);
		this.cliente.setVehiculo(vehiculo);

		this.parqueadero.setNombre(nombreP);
		this.parqueadero.setDireccion(direccionP);

		return "Ingreso registrado (DI por metodos set )";

	}

	//Metodos Set y Get 
	public Cliente getCliente() {
		return cliente;
	}

	@Autowired
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Parqueadero getParqueadero() {
		return parqueadero;
	}

	@Autowired
	public void setParqueadero(Parqueadero parqueadero) {
		this.parqueadero = parqueadero;
	}

}
