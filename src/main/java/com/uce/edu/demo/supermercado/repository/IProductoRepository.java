package com.uce.edu.demo.supermercado.repository;

import com.uce.edu.demo.supermercado.modelo.Producto;

public interface IProductoRepository {

	// C: crear/insertar
	public void insertarProducto(Producto p);

	// R: leer/buscar
	public Producto buscar(String codigo);

	// U: actualizar
	public void actualizar(Producto p);

	// D: eliminar
	public void eliminar(String codigo);

}
