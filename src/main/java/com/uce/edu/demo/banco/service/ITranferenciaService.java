package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import com.uce.edu.demo.banco.modelo.Transferencia;

public interface ITranferenciaService {

	//C: crear/insertar
	public void realizarTransferencia(String ctaOrigen, String ctaDestino, BigDecimal monto);
	//R: leer/buscar
	public Transferencia buscar(String numeroCuentaOrigen);
	//U: actualizar
	public void actualizar(Transferencia t);
	//D: eliminar
	public void eliminar(String numeroCuentaOrigen);

}
