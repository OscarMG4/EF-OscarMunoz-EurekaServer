package com.idat.pe.ef.OscarMunoz.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EfOscarMunozEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfOscarMunozEurekaServerApplication.class, args);
	}

}
