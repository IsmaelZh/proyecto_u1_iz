package com.uce.edu.demo.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Estudiante;

@Repository
public class EstudianteRepositoryImpl implements IEstudianteRepository {

	@Override
	public void insertar(Estudiante e) {
		// TODO Auto-generated method stub
		// Aqui se realiza la insecion en la base
		System.out.println("Se a insertado en la base el estudiante: " + e);
	}

	@Override
	public Estudiante buscar(String cedula) {
		// TODO Auto-generated method stub
		System.out.println("Se a encontrado en la base el estudiante: " + cedula);
		return null;
	}

	@Override
	public void actualizar(Estudiante e) {
		// TODO Auto-generated method stub
		System.out.println("Se a actualizado en la base el estudiante: " + e);
		
		
	}

	@Override
	public void eliminar(Estudiante e) {
		// TODO Auto-generated method stub
		System.out.println("Se a borrado en la base el estudiante: " + e);
		
	}

}
