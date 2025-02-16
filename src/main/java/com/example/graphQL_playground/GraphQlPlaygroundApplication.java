package com.example.graphQL_playground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.graphQL_playground.controller.lec03")
public class GraphQlPlaygroundApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphQlPlaygroundApplication.class, args);
	}

}
