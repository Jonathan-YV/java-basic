package operadores;

import java.util.Scanner;

public class Triangulo {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa el primer angulo");
		int angulo1 = sc.nextInt();
		System.out.println("Ingresa el segundo angulo");
		int angulo2 = sc.nextInt();
		System.out.println("Ingresa el tercer angulo");
		int angulo3 = sc.nextInt();
		int suma = angulo1+angulo2+angulo3;
		if (suma==180) {
			System.out.println("Si es un triangulo");
		}
		else {
			System.out.println("No es un triangulo");
		}
	}
}
