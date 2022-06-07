package com.uce.edu.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.service.IEstudianteService;

@SpringBootApplication
public class ProyectoU1IzApplication implements CommandLineRunner{

	@Autowired
    private IEstudianteService estudianteService;
	
    public static void main(String[] args) {
        SpringApplication.run(ProyectoU1IzApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    	
       Estudiante e = new Estudiante();
       e.setNombre("Ismael");
       e.setApellido("Zhindon");
       e.setCedula("0302565392");
       this.estudianteService.ingresarEstudiante(e);
       
       //Usar los 3 metodos restantes 
       e.setCedula("172562392");
       this.estudianteService.actualizarEstudiante(e);
       
       this.estudianteService.buscarPorApellido("Zhindon");
       
       this.estudianteService.eliminarEstudiante("0302562392");
    }

}
