package com.everis.factura.facturaSer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableEurekaClient
@EnableScheduling
@EnableCircuitBreaker
@EnableHystrix
@SpringBootApplication
public class FacturaSerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FacturaSerApplication.class, args);
	}

}
