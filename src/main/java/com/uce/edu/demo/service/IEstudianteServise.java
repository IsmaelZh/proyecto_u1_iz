package com.uce.edu.demo.service;

import com.uce.edu.demo.modelo.Estudiante;

public interface IEstudianteServise {

	
		public void ingresarEstudiante(Estudiante e);
		

		public Estudiante buscarPorCedula (String cedula);
		
	 
		public void actualizarEstudiante (Estudiante e);
		
	
		public void eliminarEstudiante(Estudiante e);
	
}
