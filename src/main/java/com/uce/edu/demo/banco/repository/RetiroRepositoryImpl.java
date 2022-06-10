package com.uce.edu.demo.banco.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Retiro;

@Repository
public class RetiroRepositoryImpl implements IRetiroRepository {

	@Override
	public void insertar(Retiro r) {
		// TODO Auto-generated method stub
		System.out.println("Se creo el retiro: " + r);
	}

	@Override
	public Retiro buscar(String numeroCuentaOrigen) {
		// TODO Auto-generated method stub
		System.out.println("Se busca el reiro de la cuenta: " + numeroCuentaOrigen);
		Retiro r = new Retiro();
		r.setNumeroCuentaOrigen(numeroCuentaOrigen);
		return r;
	}

	@Override
	public void actualizar(Retiro r) {
		// TODO Auto-generated method stub
		System.out.println("Se actualizo el retiro: " + r);
	}

	@Override
	public void eliminar(String numeroCuentaOrigen) {
		// TODO Auto-generated method stub
		System.out.println("Se elimino el retiro de la cuenta: " + numeroCuentaOrigen);
	}

	

}
