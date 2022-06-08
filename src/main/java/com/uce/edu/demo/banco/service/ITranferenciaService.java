package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

public interface ITranferenciaService {

	public void realizarTransferencia(String ctaOrigen, String ctaDestino, BigDecimal moto);
	
}
