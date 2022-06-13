package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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

	@Override
	public List<Deposito> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaRetiro) {
		List<Deposito> listaDepositos = new ArrayList<>();
        Deposito dep1 = new Deposito();
        dep1.setFecha(LocalDateTime.of(2021, 2, 10, 8, 50, 2));
        dep1.setMonto(new BigDecimal(20));
        dep1.setNumeroCuentaDestino("2345");
        
        listaDepositos.add(dep1);
        
        Deposito dep2 = new Deposito();
        dep2.setFecha(LocalDateTime.of(2021, 3, 15, 9, 53, 2));
        dep2.setMonto(new BigDecimal(50));
        dep2.setNumeroCuentaDestino("1234");
        
        listaDepositos.add(dep2);
        
        return listaDepositos;
	}

}
