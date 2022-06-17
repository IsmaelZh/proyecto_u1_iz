package com.uce.edu.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.PscicologoEducativo;
import com.uce.edu.demo.modelo.PscicologoSocial;

@SpringBootApplication
public class ProyectoU1IzApplication implements CommandLineRunner {
	
	@Autowired 
	private PscicologoEducativo educativo;
	@Autowired 
	private PscicologoEducativo educativo2;
	
	@Autowired 
	private PscicologoSocial social;
	@Autowired 
	private PscicologoSocial social2;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1IzApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("EJEMPLO SINGLETON");
        this.educativo.setNombre("Marco");
        this.educativo.setApellido("Ramirez");
        this.educativo.setCedula("1796485231");
        this.educativo.setEdad("45");
        System.out.println(this.educativo);
      
		System.out.println("-----");
		System.out.println(this.educativo2);
		
		this.educativo2.setNombre("Pedro");
		this.educativo2.setEdad("30");
		
		System.out.println("-----");
		System.out.println(this.educativo);

		System.out.println("-----");
		System.out.println(this.educativo2 + "\n");
		
		System.out.println("EJEMPLO PROTOTYPE");
		this.social.setNombre("Matilda");
		this.social.setApellido("Juarez");
		this.social.setCedula("0309658741");
		this.social.setEdad("33");
		System.out.println(this.social);
		
		System.out.println("-----");
		System.out.println(this.social2);
	
	}

}
