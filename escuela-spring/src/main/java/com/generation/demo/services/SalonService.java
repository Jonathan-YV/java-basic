package com.generation.demo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.demo.models.SalonModel;
import com.generation.demo.repositories.SalonRepository;

@Service
public class SalonService {
	
	private final SalonRepository salonRepository;
	
	public SalonService (@Autowired SalonRepository salonRepository) {
		this.salonRepository = salonRepository;
	}
	
	public ArrayList<SalonModel> obtenerDatos(){
		return (ArrayList<SalonModel>) salonRepository.findAll();
	}
	
	public SalonModel guardarDatos(SalonModel salonEntrada) {
		return salonRepository.save(salonEntrada);
	}
	
	public boolean eliminarDato(Integer id) {
		try {
			salonRepository.deleteById(id);
			return true;
		}catch(Exception error){
			return false;
		}
	}

}
