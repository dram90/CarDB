package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CarApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(CarApplication.class, args);

		CarService carService=context.getBean(CarService.class);

		PersonService personaService =context.getBean(PersonService.class);

		personaService.testPeople();
		carService.testCars();


	}
}
