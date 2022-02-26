package com.generation.demo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.generation.demo.models.SalonModel;
import com.generation.demo.services.SalonService;

@RestController
public class EscuelaController {
	private final SalonService salonService;
	
	public EscuelaController(@Autowired SalonService salonService) {
		this.salonService = salonService;
	}
	
	//mostrar datos de salon
	@GetMapping("/salon")
	public ArrayList<SalonModel> obtenerDatos(){
		return salonService.obtenerDatos();
	}
	
	//guardar datos en la tabla salon
	@PostMapping("salon")
	public SalonModel guardarDatos(@RequestBody SalonModel salonEntrada) {
		return salonService.guardarDatos(salonEntrada);
	}
	
	//eliminar dato
	@DeleteMapping(path = "salon/{id}")
	public boolean eliminarDato(@PathVariable("id") Integer id) {
		return salonService.eliminarDato(id);
	}
}
