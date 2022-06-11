package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Retiro;
import com.uce.edu.demo.banco.modelo.Transferencia;

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

	@Override
	public List<Retiro> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaRetiro) {
		List<Retiro> listaConsultada = new ArrayList<>();
        Retiro ret1 = new Retiro();
        ret1.setFechaRetiro(LocalDateTime.now());
        ret1.setMonto(new BigDecimal(100));
        ret1.setNumeroCuentaOrigen("1652");

        listaConsultada.add(ret1);
        return listaConsultada;
	}

	

}
