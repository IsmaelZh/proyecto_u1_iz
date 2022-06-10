package com.uce.edu.demo.banco.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Deposito;

@Repository
public class DepositoRepositoryImpl implements IDepositoRepository {

	@Override
	public void insertarDeposito(Deposito d) {

		System.out.println("Se creo el deposito: " + d);

	}

	@Override
	public Deposito buscar(String numeroCuentaDestino) {

		System.out.println("Se busca el deposito a la cuenta: " + numeroCuentaDestino);
		Deposito d = new Deposito();
		d.setNumeroCuentaDestino(numeroCuentaDestino);
		return d;

	}

	@Override
	public void actualizar(Deposito d) {

		System.out.println("Se actualizo el deposito: " + d);
	}

	@Override
	public void eliminar(String numeroCuentaDestino) {

		System.out.println("Se elimino deposito a la cuenta: " + numeroCuentaDestino);

	}

}
