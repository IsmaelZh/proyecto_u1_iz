package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.supermercado.service.IInventarioService;
import com.uce.edu.demo.supermercado.service.IProductoService;

@SpringBootApplication
public class ProyectoU1IzApplication implements CommandLineRunner{
    
    @Autowired
    private IProductoService productoService;

    @Autowired
    private IInventarioService iInventarioService;
    
    public static void main(String[] args) {
        SpringApplication.run(ProyectoU1IzApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {


    	this.productoService.insertarProducto("Agua", "629", "5", "Dasani", new BigDecimal(0.50), LocalDateTime.of(2020, 10, 24, 5, 30, 5));
    	this.productoService.insertarProducto("Jamon", "522", "10", "Juris", new BigDecimal(1.20), LocalDateTime.of(2021, 11, 14, 11, 45, 2));
    	this.productoService.insertarProducto("Jabon", "968", "15", "Lux", new BigDecimal(0.80), LocalDateTime.of(2020, 10, 24, 9, 36, 23));
    	this.productoService.insertarProducto("Lava vajillas", "352", "23", "Lava",new BigDecimal(1.35), LocalDateTime.of(2022, 9, 1, 13, 23, 12));
    	this.productoService.insertarProducto("Cuaderno", "784", "12", "Estilo", new BigDecimal(0.90), LocalDateTime.of(2022, 2, 23, 17, 11, 6));
    	this.productoService.ingresarLista("25-e4");
        this.iInventarioService.verReporte();
    	//-------------------------------------------------------Filtro fechas------------------------------------------------
        System.out.println("Consulta con filtro de fecha");
        this.productoService.consultarFecha(LocalDateTime.of(2021, 12, 1, 0, 0, 0));
        this.iInventarioService.verReporte();
          
    }


}
