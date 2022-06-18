package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.modelo.ProfesorGeneral;
import com.uce.edu.demo.modelo.ProfesorMateria;
import com.uce.edu.demo.repository.IMatriculaRepository;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

	@Autowired
	private IMatriculaRepository matriculaRepository;

	@Autowired
	private ProfesorGeneral profesorGenearl;
	@Autowired
	private ProfesorMateria profesorMateria;
	
	@Lookup
	public ProfesorGeneral obtenerProfesorG() {
		return null;
	}
	
	@Lookup
	public ProfesorMateria obtenerProfesorM() {
		
		ProfesorMateria profesorM = new ProfesorMateria();
		profesorM.setApellido("Tapia");
		profesorM.setNombre("Fito");
		return profesorM;
	}

	@Override
	public void crearMatricula(Matricula m) {
		
//		ProfesorMateria profe = new ProfesorMateria();
//		ProfesorMateria profe = this.obtenerProfesorM();

	    System.out.println("DI desde Service SINGLETON\n" + this.profesorGenearl);
		System.out.println("DI desde Service PROTOTYPE\n" + this.profesorMateria);
		
		System.out.println("DI un metodo Genaral: " + this.obtenerProfesorG());
		System.out.println("DI un metodo Materia: " + this.obtenerProfesorM());
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
