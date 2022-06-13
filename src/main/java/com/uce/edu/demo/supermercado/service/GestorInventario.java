package com.uce.edu.demo.supermercado.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.springframework.stereotype.Service;

@Service
public class GestorInventario {

	private BigDecimal PV;
	
    public BigDecimal calculoPV (BigDecimal PC) {

    	PV =  PC.add(PC.multiply(new BigDecimal(0.1))).add(PC.multiply(new BigDecimal(0.12))).setScale(2, RoundingMode.UP); 
    	
    	return PV;
    }


}
