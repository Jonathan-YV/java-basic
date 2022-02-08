package ciclos;

import java.util.Scanner;

public class DeletrearNombre {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = sc.nextLine();
        sc.close();
        
        System.out.println("Tu nombre tiene " + nombre.length() + " letras");
        System.out.println("-------------------------------------------");
        
        for(int i = 0; i<nombre.length(); i++) {
        	System.out.println(nombre.charAt(i));
        }
        
        
//        String letra[] = nombre.split("");
//        System.out.println("Tu nombre tiene " + letra.length + " letras");
//        System.out.println("-------------------------------------------");
        
//        for(int i = 0; i<letra.length; i++) {
//        	System.out.println(letra[i]);
//        }
        
	}
}
