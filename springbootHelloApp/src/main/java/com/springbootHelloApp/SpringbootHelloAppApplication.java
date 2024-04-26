package com.springbootHelloApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootHelloAppApplication {

	public static void main(String[] args) 
	{
		System.out.println("spring boot application start");
		SpringApplication.run(SpringbootHelloAppApplication.class, args);
	}

}
