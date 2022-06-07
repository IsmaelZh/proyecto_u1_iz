package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Materia;

public interface IMateriaRepository {

//CRUD
	//C: crear/insertar 
	public void crear(Materia m);
	
	//R: leer/buscar
	public void buscar (Materia m);
	
	//U: actualizar 
	public void actualizar(Materia m);
	
	//D: eliminar
	public void eliminar(Materia m);
}
