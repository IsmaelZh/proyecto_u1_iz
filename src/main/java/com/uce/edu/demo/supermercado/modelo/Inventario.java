package com.uce.edu.demo.supermercado.modelo;

import java.util.List;

public class Inventario {

	private String id;
	private List<Producto> Inventario;

	@Override
	public String toString() {
		return Inventario + "";
	}
	
	//Set y Get 
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Producto> getInventario() {
		return Inventario;
	}

	public void setInventario(List<Producto> inventario) {
		Inventario = inventario;
	}

}
