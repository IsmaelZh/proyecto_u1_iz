package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import com.uce.edu.demo.banco.modelo.Deposito;

public interface IDepositoService {

	//C: crear/insertar 
	public void realizarDeposito(String numeroCtaDestino, BigDecimal monto);
	//R: leer/buscar
	public Deposito buscar(String numeroCuentaDestino);
	//U: actualizar
	public void actualizar(Deposito d);
	//D: eliminar
	public void eliminar(String numeroCuentaDestino);
}
