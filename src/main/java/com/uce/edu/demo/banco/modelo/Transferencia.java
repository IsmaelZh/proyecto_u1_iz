package com.uce.edu.demo.banco.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transferencia {

	private String numeroCuentaOrigen;
	private String numeroCuentaDestino;
	private BigDecimal montoTransferir;
	private LocalDateTime fechaTransferecina;
	
	@Override
	public String toString() {
		return "Transferencia [nuemroCuentaOrigen=" + numeroCuentaOrigen + ", numeroCuentaDestino="
				+ numeroCuentaDestino + ", montoTranSferir=" + montoTransferir + ", fechaTransferecina="
				+ fechaTransferecina + "]";
	}
	
	//SET y GET 
	public String getNumeroCuentaOrigen() {
		return numeroCuentaOrigen;
	}
	public void setNumeroCuentaOrigen(String nuemroCuentaOrigen) {
		this.numeroCuentaOrigen = nuemroCuentaOrigen;
	}
	public String getNumeroCuentaDestino() {
		return numeroCuentaDestino;
	}
	public void setNumeroCuentaDestino(String numeroCuentaDestino) {
		this.numeroCuentaDestino = numeroCuentaDestino;
	}

	public BigDecimal getMontoTransferir() {
		return montoTransferir;
	}
	public void setMontoTransferir(BigDecimal montoTranSferir) {
		this.montoTransferir = montoTranSferir;
	}
	public LocalDateTime getFechaTransferecina() {
		return fechaTransferecina;
	}
	public void setFechaTransferecina(LocalDateTime fechaTransferecina) {
		this.fechaTransferecina = fechaTransferecina;
	}
	
	
	
	
}
