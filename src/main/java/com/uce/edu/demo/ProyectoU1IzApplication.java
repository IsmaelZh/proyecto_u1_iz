package com.uce.edu.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.service.IEstudianteService;
import com.uce.edu.demo.service.IMateriaService;
import com.uce.edu.demo.service.IMatriculaService;

@SpringBootApplication
public class ProyectoU1IzApplication implements CommandLineRunner{

	@Autowired
    private IEstudianteService estudianteService;
	@Autowired
	private IMateriaService materiateService;
	@Autowired
	private IMatriculaService matriculaService;
	
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
    	
       //--------------------------------------- Metodos CRUD Materia ----------------------------------------
    	
       Materia materia = new Materia();
       materia.setNombre("Estructura de datos");
       materia.setSemestre("Tercero");
             
       //Create 
       this.materiateService.crearMateria(materia);
       //Read
       this.materiateService.buscarMateria(materia);
       //Update
       materia.setNombre("Analisis III");
       this.materiateService.actualizarMateria(materia);
       //Delete
       this.materiateService.eliminarMateria(materia);
       
       //-------------------------------------- Metodos CRUD Matricula --------------------------------------
       
       List <Materia> listaMateria = new ArrayList<Materia>();
       listaMateria.add(materia);
       
       Matricula matricula = new Matricula();
       matricula.setEstudiante(e);
       matricula.setMateria(listaMateria);
       matricula.setNumero("90");
       
       //Create 
       this.matriculaService.crearMatricula(matricula);
       //Read
       this.matriculaService.buscarMatricula(matricula);
       //Update
       matricula.setNumero("102");
       this.matriculaService.actualizarMatricula(matricula);
       //Delete
       this.matriculaService.eliminarMatricula(matricula);
    }

}
