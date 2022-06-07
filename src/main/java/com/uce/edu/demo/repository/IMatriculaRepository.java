package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Matricula;

public interface IMatriculaRepository {

//CRUD
	//C: crear/insertar 
	public void crear(Matricula m);
	
	//R: leer/buscar
	public void buscar (Matricula m);
	
	//U: actualizar 
	public void actualizar(Matricula m);
	
	//D: eliminar
	public void eliminar(Matricula m);
}
