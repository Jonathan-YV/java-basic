package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Saludo {
	@GetMapping("/")
	public String saludo() {
		return "Hola a todos y todas";
	}

	@GetMapping("/saludo")
	public String saludar(@RequestParam(value = "nombre", defaultValue = "Java") String nombre,
							@RequestParam(value = "apellido", defaultValue = "Java2") String apellido) {
		return "Hola " + nombre + " " + apellido;
	}
	
	@PostMapping("/login")
	public String login(@RequestParam(value="correo") String correo, @RequestParam(value="password") String password) {
		return correo + " - " + password;
	}
	

}
