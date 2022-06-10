package com.uce.edu.demo.banco.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Retiro {

	private LocalDateTime fechaRetiro;
	private String numeroCuentaOrigen;
	private BigDecimal monto;
	
	@Override
	public String toString() {
		return "Retiro [fechaRetiro=" + fechaRetiro + ", numeroCuentaOrigeno=" + numeroCuentaOrigen + ", monto="
				+ monto + "]";
	}

	//Set y Get
	public LocalDateTime getFechaRetiro() {
		return fechaRetiro;
	}

	public void setFechaRetiro(LocalDateTime fechaRetiro) {
		this.fechaRetiro = fechaRetiro;
	}

	public String getNumeroCuentaOrigeno() {
		return numeroCuentaOrigen;
	}

	public void setNumeroCuentaOrigen(String numeroCuentaOrigen) {
		this.numeroCuentaOrigen = numeroCuentaOrigen;
	}

	public BigDecimal getMonto() {
		return monto;
	}

	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	
	
	
}

