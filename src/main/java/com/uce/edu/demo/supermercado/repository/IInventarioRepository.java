package com.uce.edu.demo.supermercado.repository;

import java.time.LocalDateTime;

import com.uce.edu.demo.supermercado.modelo.Inventario;

public interface IInventarioRepository {

	// C: crear/insertar
	public void insertarInventario(Inventario i);

	// R: leer/buscar
	public Inventario buscar(String id);

	// U: actualizar
	public void actualizar(Inventario i);

	// D: eliminar
	public void eliminar(String id);

}
