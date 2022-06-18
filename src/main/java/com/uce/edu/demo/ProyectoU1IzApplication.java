package com.uce.edu.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.modelo.ProfesorGeneral;
import com.uce.edu.demo.modelo.ProfesorMateria;
import com.uce.edu.demo.service.IMatriculaService;

@SpringBootApplication
public class ProyectoU1IzApplication implements CommandLineRunner {


//	@Autowired
//	private IFachadaCuentaBncaria bancaria;
	@Autowired
	private ProfesorGeneral genaral;
	@Autowired
	private ProfesorGeneral genaral1;
	
	@Autowired
	private ProfesorMateria materia;
	@Autowired
	private ProfesorMateria materia1;
	
	@Autowired IMatriculaService iMatriculaService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1IzApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		BigDecimal interes = this.bancaria.calcularInteres("1234");
//      System.out.println(interes);
        
//		System.out.println("EJEMPLO SINGLETON");
//        this.genaral.setNombre("Ismael");
//        this.genaral.setApellido("Zhindon");
//        System.out.println(this.genaral);
//        
//		System.out.println("-----");
//		System.out.println(this.genaral1);
//		
//		this.genaral1.setNombre("Carlitos");
//		
//		System.out.println("-----");
//		System.out.println(this.genaral);
//
//		System.out.println("-----");
//		System.out.println(this.genaral1);
//		
//		System.out.println("EJEMPLO PROTOTYPE");
//		this.materia.setNombre("Mario");
//		this.materia.setApellido("Velez");
//		System.out.println(this.materia);
//		
//		System.out.println("-----");
//		System.out.println(this.materia1);
		
		Matricula matricula1 = new Matricula();
		matricula1.setEstudiante(new Estudiante());
		matricula1.setMateria(new ArrayList<Materia>());
		matricula1.setNumero("1234");
		
		this.iMatriculaService.crearMatricula(matricula1);
	
	}

}