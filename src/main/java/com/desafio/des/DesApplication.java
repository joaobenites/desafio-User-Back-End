package com.desafio.des;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication
@EntityScan(basePackageClasses = { DesApplication.class })
public class DesApplication {

	public static void main(String[] args) {
		  SpringApplication.run(DesApplication.class, args);
	}
	
	
}