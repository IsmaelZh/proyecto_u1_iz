package com.uce.edu.demo.supermercado.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.supermercado.modelo.Producto;
import com.uce.edu.demo.supermercado.repository.IProductoRepository;

@Service
public class ProductoServiceImpl implements IProductoService {

	@Autowired
	private IProductoRepository iProductoRepository;
	@Autowired
	private IInventarioService iInventarioService;
	@Autowired 
	private GestorInventario gestorInventario;

	private List<Producto> listaP = new ArrayList<Producto>();
	private List<Producto> listaConsulta = new ArrayList<Producto>();
	

	@Override
	public void insertarProducto(String nombre, String codigo, String cantidad, String marca, BigDecimal PC, LocalDateTime fechaIngresoBodega) {
		// TODO Auto-generated method stub
		
		Producto producto = new Producto();
        producto.setNombre(nombre);
        producto.setCodigo(codigo);
        producto.setCantidad(cantidad);
        producto.setMarca(marca);
        producto.setPC(PC);
        producto.setPV(gestorInventario.calculoPV(PC));
		producto.setFechaIngresoBodega(fechaIngresoBodega);
		
        this.listaP.add(producto);
	}

	@Override
	public Producto buscar(String codigo) {
		// TODO Auto-generated method stub
		return this.iProductoRepository.buscar(codigo);
	}

	@Override
	public void actualizar(Producto p) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(String codigo) {
		// TODO Auto-generated method stub
		this.iProductoRepository.eliminar(codigo);
	}

	@Override
	public void ingresarLista(String id) {
		// TODO Auto-generated method stub
		this.iInventarioService.insertarInventario(listaP, id);
		
	}

	@Override
	public void consultarFecha(LocalDateTime fecha) {
	
		for (Producto producto : this.listaP) {
			if(producto.getFechaIngresoBodega().isAfter(fecha)) {
				this.listaConsulta.add(producto);
			}
		}
		
		this.iInventarioService.insertarInventario(listaConsulta, null);
	}
	
	
}
