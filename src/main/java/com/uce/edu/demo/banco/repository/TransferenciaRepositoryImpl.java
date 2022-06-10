package com.uce.edu.demo.banco.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Deposito;
import com.uce.edu.demo.banco.modelo.Transferencia;

@Repository
public class TransferenciaRepositoryImpl implements ITransferenciaRepository {

	@Override
	public void insertar(Transferencia t) {
		// TODO Auto-generated method stub
		System.out.println("Aqui se inserta la transferencia en la base de datos: " + t);
	}

	@Override
	public Transferencia buscar(String numeroCuentaOrigen) {
		// TODO Auto-generated method stub
		System.out.println("Se busca la tranferencia de la cuenta: " + numeroCuentaOrigen);
		Transferencia t = new Transferencia();
		t.setNuemroCuentaOrigen(numeroCuentaOrigen);
		return t;
	}

	@Override
	public void actualizar(Transferencia t) {
		// TODO Auto-generated method stub
		System.out.println("Se actualiza la transferencia: " + t);
	}

	@Override
	public void eliminar(String numeroCuentaOrigen) {
		// TODO Auto-generated method stub
		System.out.println("Se elimino la transferencia de la cuenta" + numeroCuentaOrigen);
	}

}
