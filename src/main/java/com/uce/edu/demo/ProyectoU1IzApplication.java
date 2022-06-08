package com.uce.edu.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.banco.service.IDepositoService;
import com.uce.edu.demo.banco.service.ITranferenciaService;

@SpringBootApplication
public class ProyectoU1IzApplication implements CommandLineRunner{

	@Autowired
    private ITranferenciaService TransferenciaService;

    @Autowired
    private IDepositoService depositoService;

    public static void main(String[] args) {
        SpringApplication.run(ProyectoU1IzApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {


        this.TransferenciaService.realizarTransferencia("12", "13", new BigDecimal(20));

        this.depositoService.realizarDeposito("14", new BigDecimal(20));

    }


}
