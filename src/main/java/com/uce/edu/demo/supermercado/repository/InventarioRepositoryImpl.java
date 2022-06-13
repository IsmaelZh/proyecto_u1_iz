package com.uce.edu.demo.supermercado.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.supermercado.modelo.Inventario;

@Repository
public class InventarioRepositoryImpl implements IInventarioRepository{

	@Override
	public void insertarInventario(Inventario i) {
		// TODO Auto-generated method stub
		System.out.println("Se inserto el inventario a la base de datos: " + i);
	}

	@Override
	public Inventario buscar(String id) {
		
		Inventario inventario = new Inventario();
        inventario.setId(id);
        inventario.setInventario(null);
        
        return inventario;
	}

	@Override
	public void actualizar(Inventario i) {
		System.out.println("Se actualizo el inventario: " + i);
		
	}

	@Override
	public void eliminar(String id) {
		// TODO Auto-generated method stub
		System.out.println("Se elimino el inventario: " + id);
		
	}

	   
	
}
