package paquete2;

import paquete1.ClaseProtected;

public class Main extends ClaseProtected{
	
	public static void main(String[] args) {
//		ClaseDefault prueba = new ClaseDefault(); // Da error D:
//		
//		//prueba.mostrar();
//		
//		ClasePrivada privada = new ClasePrivada();
//		
//		privada.setSaludar("Juan");
//		
//		System.out.println(privada.getSaludar());
//		
//		// Ibjeto de la clase protected
		
		Main protegido = new Main(); // objeto creado
		
		protegido.setEdad(23);
		
		System.out.println(protegido.getEdad());
	}

}
