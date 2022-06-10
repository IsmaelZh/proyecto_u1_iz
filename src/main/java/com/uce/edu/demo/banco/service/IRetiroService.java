package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import com.uce.edu.demo.banco.modelo.Retiro;

public interface IRetiroService {

	//C: crear/insertar
	public void realizarRetiro(String numeroOrigen, BigDecimal monto);
	//R: leer/buscar
	public Retiro buscar(String numeroCuentaOrigen);
	//U: actualizar
	public void actualizar(Retiro r);
	//D: eliminar
	public void eliminar(String numeroCuentaOrigen);
}
