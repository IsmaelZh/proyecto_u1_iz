package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.repository.IMateriaRepository;
import com.uce.edu.demo.repository.IMatriculaRepository;
@Service
public class MatriculaServiceImpl implements IMatriculaService {
	
@Autowired
	private IMatriculaRepository matriculaRepository;

	@Override
	public void crearMatricula(Matricula m) {
		// TODO Auto-generated method stub
		this.matriculaRepository.crear(m);
		
	}

	@Override
	public void buscarMatricula(Matricula m) {
		// TODO Auto-generated method stub
		this.matriculaRepository.buscar(m);
	}

	@Override
	public void actualizarMatricula(Matricula m) {
		// TODO Auto-generated method stub
		this.matriculaRepository.actualizar(m);
	}

	@Override
	public void eliminarMatricula(Matricula m) {
		// TODO Auto-generated method stub
		this.matriculaRepository.eliminar(m);
	}

}
