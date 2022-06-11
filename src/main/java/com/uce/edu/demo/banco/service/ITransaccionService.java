package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface ITransaccionService {

	public void transferencia(String origen, String destino, BigDecimal monto);

	public void deposito(String destino, BigDecimal monto);

	public void retiro(String ctaRetiro, BigDecimal monto);

	public void consular(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin);

}
