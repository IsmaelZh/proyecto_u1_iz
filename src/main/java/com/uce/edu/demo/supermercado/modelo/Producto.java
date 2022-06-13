package com.uce.edu.demo.supermercado.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Producto {

	private String nombre;
	private String codigo;
	private String cantidad;
	private String marca;
	private BigDecimal PC;
	private BigDecimal PV;
	private LocalDateTime fechaIngresoBodega;

	@Override
	public String toString() {
		return "Nombre: " + nombre + " - cantidad: " + cantidad + " - PV: " + PV + " - Fecha ingreso Bodega:" + fechaIngresoBodega + "\n";
	}

	// Set y Get
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public BigDecimal getPC() {
		return PC;
	}

	public void setPC(BigDecimal PC) {
		this.PC = PC;
	}

	public BigDecimal getPV() {
		return PV;
	}

	public void setPV(BigDecimal PV) {
		this.PV = PV;
	}

	public LocalDateTime getFechaIngresoBodega() {
		return fechaIngresoBodega;
	}

	public void setFechaIngresoBodega(LocalDateTime fechaIngresoBodega) {
		this.fechaIngresoBodega = fechaIngresoBodega;
	}

}
