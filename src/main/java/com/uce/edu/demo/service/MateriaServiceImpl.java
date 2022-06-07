package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.repository.IMateriaRepository;
@Service
public class MateriaServiceImpl implements IMateriaService {
	
@Autowired
	private IMateriaRepository materiaRepository;

	@Override
	public void crearMateria(Materia m) {
		// TODO Auto-generated method stub
		this.materiaRepository.crear(m);
	}

	@Override
	public void buscarMateria(Materia m) {
		// TODO Auto-generated method stub
		this.materiaRepository.buscar(m);	
	}
	@Override
	public void actualizarMateria(Materia m) {
		// TODO Auto-generated method stub
		this.materiaRepository.actualizar(m);
	}

	@Override
	public void eliminarMateria(Materia m) {
		// TODO Auto-generated method stub
		this.materiaRepository.eliminar(m);
	}

}
