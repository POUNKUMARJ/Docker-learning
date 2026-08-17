package com.learning.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerApplication {

	public static void main(String[] args) {
		System.out.println("Printing added!!!!!!!");
		SpringApplication.run(DockerApplication.class, args);
	}

}
