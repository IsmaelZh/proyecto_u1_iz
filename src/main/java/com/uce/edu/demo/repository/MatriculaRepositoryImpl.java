package com.uce.edu.demo.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Matricula;

@Repository
public class MatriculaRepositoryImpl implements IMatriculaRepository {

	@Override
	public void crear(Matricula m) {
		// TODO Auto-generated method stub
		System.out.println("Se a insertado en la base la matricula: " + m);
	}

	@Override
	public void buscar(Matricula m) {
		// TODO Auto-generated method stub
		System.out.println("Se a encontrado en la base la matricula: " + m);
	}

	@Override
	public void actualizar(Matricula m) {
		// TODO Auto-generated method stub
		System.out.println("Se a actualizado en la base la matricula: " + m);
		
	}

	@Override
	public void eliminar(Matricula m) {
		// TODO Auto-generated method stub
		System.out.println("Se a borrado en la base la matricula: " + m);
	}

}
