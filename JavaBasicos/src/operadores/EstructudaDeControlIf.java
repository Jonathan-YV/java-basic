package operadores;

import java.util.Scanner;

public class EstructudaDeControlIf {

	public static void main (String[] args) {
		
		System.out.println("Introduce tu edad");
		Scanner sc = new Scanner(System.in);
		int edad = sc.nextInt();
		if (edad>=18) {
			System.out.println("Eres mayor de edad");
		}
		else {
			System.out.println("Eres menor de edad");
		}
	}
}
