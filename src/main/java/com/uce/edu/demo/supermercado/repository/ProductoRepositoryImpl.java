package com.uce.edu.demo.supermercado.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.supermercado.modelo.Producto;

@Repository
public class ProductoRepositoryImpl implements IProductoRepository {

	@Override
	public void insertarProducto(Producto p) {
		// TODO Auto-generated method stub
		System.out.println("Se inserto el producto a la base de datos: " + p);
	}

	@Override
	public Producto buscar(String codigo) {
		
		Producto producto = new Producto();
        producto.setNombre("Leche");
        producto.setCodigo(codigo);
        producto.setCantidad("10");
        producto.setMarca("Vita");
        producto.setPC(new BigDecimal(0.90));
        
        return producto;
		
	}

	@Override
	public void actualizar(Producto p) {
		// TODO Auto-generated method stub
		System.out.println("Se actualizo el producto: " + p);
	}

	@Override
	public void eliminar(String codigo) {
		// TODO Auto-generated method stub
		System.out.println("Se elimino el producto: " + codigo);
	}

}
