package com.sparklead.evocharge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class EvochargeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EvochargeApplication.class, args);
		System.out.println("Hii");
	}

}
