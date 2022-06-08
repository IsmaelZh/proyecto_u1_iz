package com.uce.edu.demo.banco.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transferencia {

	private String nuemroCuentaOrigen;
	private String numeroCuentaDestino;
	private BigDecimal montoTranSferir;
	private LocalDateTime fechaTransferecina;
	
	@Override
	public String toString() {
		return "Transferencia [nuemroCuentaOrigen=" + nuemroCuentaOrigen + ", numeroCuentaDestino="
				+ numeroCuentaDestino + ", montoTranSferir=" + montoTranSferir + ", fechaTransferecina="
				+ fechaTransferecina + "]";
	}
	
	//SET y GET 
	public String getNuemroCuentaOrigen() {
		return nuemroCuentaOrigen;
	}
	public void setNuemroCuentaOrigen(String nuemroCuentaOrigen) {
		this.nuemroCuentaOrigen = nuemroCuentaOrigen;
	}
	public String getNumeroCuentaDestino() {
		return numeroCuentaDestino;
	}
	public void setNumeroCuentaDestino(String numeroCuentaDestino) {
		this.numeroCuentaDestino = numeroCuentaDestino;
	}

	public BigDecimal getMontoTranSferir() {
		return montoTranSferir;
	}
	public void setMontoTranSferir(BigDecimal montoTranSferir) {
		this.montoTranSferir = montoTranSferir;
	}
	public LocalDateTime getFechaTransferecina() {
		return fechaTransferecina;
	}
	public void setFechaTransferecina(LocalDateTime fechaTransferecina) {
		this.fechaTransferecina = fechaTransferecina;
	}
	
	
	
	
}
