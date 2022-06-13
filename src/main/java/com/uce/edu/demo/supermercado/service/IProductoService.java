package com.uce.edu.demo.supermercado.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.uce.edu.demo.supermercado.modelo.Producto;

public interface IProductoService {

	// C: crear/insertar
	public void insertarProducto(String nombre, String codigo, String cantidad, String marca, BigDecimal PC, LocalDateTime fechaIngresoBodega );

	// R: leer/buscar
	public Producto buscar(String codigo);

	// U: actualizar
	public void actualizar(Producto p);

	// D: eliminar
	public void eliminar(String codigo);
	
	public void ingresarLista (String id);

	public void consultarFecha (LocalDateTime fecha);
	
}
