package com.datorium.Datorium.API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@CrossOrigin
public class DatoriumApiApplication {

	public static void main(String[] args) {
		System.out.println("asd");
		SpringApplication.run(DatoriumApiApplication.class, args);
	}


	@GetMapping("/ping")
	public String ping() {
		return "bong";
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);// "Hello " + name;
	}

	@GetMapping("/sum")
	public int sum(@RequestParam(value = "number1") int number1, @RequestParam(value = "number2") int number2){
		return number1 + number2;
	}

	@GetMapping("/multiply")
	public int multiply(@RequestParam(value = "number1") int number1, @RequestParam(value = "number2") int number2){
		return number1 * number2;
	}

	@GetMapping("/data")
	public String[] getData() {
		String[] dataArray = {"Inna", "Aleksandra", "Ieva", "Agneta"};
		return dataArray;
	}

	@GetMapping("/cheese")
	public Cheese getCheese(@RequestParam(value = "name", defaultValue = "Cheddar") String name,
							@RequestParam(value = "type", defaultValue = "Soft") String type) {
		Cheese cheese = new Cheese();
		cheese.setName(name);
		cheese.setType(type);
		return cheese;
	}
}
