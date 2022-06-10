package com.uce.edu.demo.banco.repository;

import com.uce.edu.demo.banco.modelo.Deposito;

public interface IDepositoRepository {

	//C: crear/insertar
	public void insertarDeposito(Deposito d);
	//R: leer/buscar
	public Deposito buscar(String numeroCuentaDestino);
	//U: actualizar
	public void actualizar(Deposito d);
	//D: eliminar
	public void eliminar(String numeroCuentaDestino);


}