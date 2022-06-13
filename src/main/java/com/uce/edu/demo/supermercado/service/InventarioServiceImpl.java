package com.uce.edu.demo.supermercado.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.supermercado.modelo.Inventario;
import com.uce.edu.demo.supermercado.modelo.Producto;
import com.uce.edu.demo.supermercado.repository.IInventarioRepository;

@Service
public class InventarioServiceImpl implements IInventarioService {

	@Autowired
	private IInventarioRepository iInventarioRepository;

	private Inventario inventario = new Inventario();

	@Override
	public void insertarInventario(List<Producto> productoLista, String id) {
		// TODO Auto-generated method stub
		this.inventario.setId(id);
		this.inventario.setInventario(productoLista);

	}

	@Override
	public void buscar(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actualizar(Inventario i) {
		// TODO Auto-generated method stub
		this.iInventarioRepository.actualizar(i);

	}

	@Override
	public void eliminar(String id) {
		// TODO Auto-generated method stub
		this.iInventarioRepository.eliminar(id);
	}

	public void verReporte() {

		System.out.println(this.inventario.toString());
	}

}
