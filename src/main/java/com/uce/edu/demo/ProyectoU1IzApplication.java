package com.uce.edu.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.consultorio.CitaMedica;
import com.uce.edu.demo.consultorio.CitaMedica2;
import com.uce.edu.demo.parqueadero.Ticket;
import com.uce.edu.demo.parqueadero.Ticket2;
import com.uce.edu.demo.parqueadero.Ticket3;

@SpringBootApplication
public class ProyectoU1IzApplication implements CommandLineRunner{

	@Autowired
	private Ticket ticket;
	@Autowired
	private Ticket2 ticket2;
	@Autowired
	private Ticket3 ticket3;
	
	//private CitaMedica2 cita;
	
    public static void main(String[] args) {
        SpringApplication.run(ProyectoU1IzApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // TODO Auto-generated method stub

        System.out.println("Mi primer proyecto con Spring Framework");

        //String respuesta = cita.agendar(LocalDateTime.now(), "Ismael", "Zhindon", 22, "Quito", "Gustavo", 15);
        
        String respuesta = ticket.registrar(LocalDateTime.now(), "Ismael", "Zhindon", 1756289569, "Toyota", "Tozi", "Quitumbe");
        System.out.println(respuesta);
        
        String respuesta2 = ticket2.registrar(LocalDateTime.now(), "Ismael", "Zhindon", 1756289569, "Toyota", "Tozi", "Quitumbe");
        System.out.println(respuesta2);
        
        String respuesta3 = ticket3.registrar(LocalDateTime.now(), "Ismael", "Zhindon", 1756289569, "Toyota", "Tozi", "Quitumbe");
        System.out.println(respuesta3);

    }

}
