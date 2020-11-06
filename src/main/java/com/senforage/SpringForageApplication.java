package com.senforage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.senforage.entities.Client;


@SpringBootApplication
public class SpringForageApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringForageApplication.class, args);
		
		
		/*
		 * Client client = new Client();
		 * 
		 * client.setNomFamille("sow"); client.setAdresse("SL");
		 * client.setTelephone("5255552");
		 */
	}
}
