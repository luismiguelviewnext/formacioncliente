package com.curso.formacioncliente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Clase principal de la aplicación Formacioncliente.
 * Esta clase es responsable de iniciar la aplicación Spring Boot y de definir algunos beans para el contexto de la aplicación.
 */
@EntityScan(basePackages = "com.curso.model")
@SpringBootApplication(scanBasePackages = { "com.curso.controller", "com.curso.service" })
public class FormacionclienteApplication {

    /**
     * Método principal que inicia la aplicación Spring Boot.
     * 
     * @param args argumentos pasados a la aplicación.
     */
	public static void main(String[] args) {
		SpringApplication.run(FormacionclienteApplication.class, args);
	}

    /**
     * Define y proporciona un bean de {@link RestTemplate} para ser utilizado en toda la aplicación.
     *
     * @return una nueva instancia de {@link RestTemplate}.
     */
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
