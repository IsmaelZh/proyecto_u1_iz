package com.uce.edu.demo.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Materia;

@Repository
public class MateriaRepositoryImpl implements IMateriaRepository {

	@Override
	public void insertar(Materia m) {
		// TODO Auto-generated method stub
		System.out.println("Se a insertado en la base la materia: " + m);
	}

	@Override
	public void buscar(Materia m) {
		// TODO Auto-generated method stub
		System.out.println("Se a encontrado en la base la materia: " + m);
	}

	@Override
	public void actualizar(Materia m) {
		// TODO Auto-generated method stub
		System.out.println("Se a actualizado en la base la materia: " + m);
		
	}

	@Override
	public void eliminar(Materia m) {
		// TODO Auto-generated method stub
		System.out.println("Se a borrado en la base la materia: " + m);
	}

}
