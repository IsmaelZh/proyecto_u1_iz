package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Deposito;
import com.uce.edu.demo.banco.modelo.Transferencia;

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

	@Override
	public List<Deposito> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaRetiro) {
		List<Deposito> listaConsultada = new ArrayList<>();
        Deposito dep1 = new Deposito();
        dep1.setFecha(LocalDateTime.now());
        dep1.setMonto(new BigDecimal(100));
        dep1.setNumeroCuentaDestino("1234");
        
        listaConsultada.add(dep1);
        return listaConsultada;
	}

}
