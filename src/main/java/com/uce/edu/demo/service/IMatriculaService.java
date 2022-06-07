package com.uce.edu.demo.service;

import com.uce.edu.demo.modelo.Matricula;

public interface IMatriculaService {

	
		public void ingresarMatricula(Matricula m);
		

		public void buscarMatricula (Matricula m);
		
	 
		public void actualizarMatricula (Matricula m);
		
	
		public void eliminarMatricula(Matricula m);
	
}
