package com.pankaj.metilica.metallicatradeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class MetallicaTradeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MetallicaTradeServiceApplication.class, args);
	}

}
