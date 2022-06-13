package com.uce.edu.demo.supermercado.service;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.supermercado.modelo.Inventario;
import com.uce.edu.demo.supermercado.modelo.Producto;

public interface IInventarioService {

	// C: crear/insertar
	public void insertarInventario(List<Producto> productoLista, String id);

	// R: leer/buscar
	public void buscar(String id);

	// U: actualizar
	public void actualizar(Inventario i);

	// D: eliminar
	public void eliminar(String id);
	
	public void verReporte();

	
}
