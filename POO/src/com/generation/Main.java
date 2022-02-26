package com.generation;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tacos taco1 = new Tacos();
//		taco1.tipoDeTortilla = "Maiz";
//		taco1.tipoDeGuisado = "Suadero";
//		taco1.numeroDeTortilla = 2;
//		taco1.tamanioDeTortilla = "Mediana";
//		taco1.precio = 34.0f;
		taco1.setTipoDeTortilla("Maiz");
		taco1.setTipoDeGuisado("Suadero");
		taco1.setNumeroDeTortilla(2);
		taco1.setTamanioDeTortilla("Mediana");
		taco1.setPrecio(34.0f);
		
		taco1.subirPrecio(5.50f);
		
		Tacos taco2 = new Tacos();
//		taco2.tipoDeTortilla = "Harina";
//		taco2.tipoDeGuisado = "Bistec";
//		taco2.numeroDeTortilla = 2;
//		taco2.tamanioDeTortilla = "Grande";
//		taco2.precio = 50.5f;
		
		taco2.setTipoDeTortilla("Harina");
		taco2.setTipoDeGuisado("Bistec");
		taco2.setNumeroDeTortilla(0);
		taco2.setTamanioDeTortilla("Grande");
		taco2.setPrecio(50.5f);
		
		System.out.println(taco1);
		System.out.println(taco2);
		
	}

}
