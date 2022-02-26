package com.gatitos;

public class PruebaGato {
	public static void main(String[] args) {
		Gato g = new Gato();
//		g.nombre = "Taco";
//		g.patas = 3;
		
		g.setNombre("Taco");
		g.setPatas(6);
		g.setAdoptado(false);
		
		System.out.println(g);
	}
}
