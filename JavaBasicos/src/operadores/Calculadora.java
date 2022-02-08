package operadores;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el primer numero: ");
		float num1 = sc.nextFloat();
		
		System.out.print("Introduce el segundo numero: ");
		float num2 = sc.nextFloat();
		
		System.out.println("Introduce el n�mero de la operacion a realizar");
		System.out.println("1) Suma   2) Resta   3) Multiplicaci�n   4) Divisi�n");
		System.out.print(": ");
		int op = sc.nextInt();
		
		sc.close();
		
		switch(op) {
			case 1:
				System.out.println("El resultado de la suma es: " + (num1 + num2));
				break;
			case 2:
				System.out.println("El resultado de la resta es: " + (num1 - num2));
				break;
			case 3:
				System.out.println("El resultado de la multiplicaci�n es: " + (num1 * num2));
				break;
			case 4:
				if (num2 != 0) {
					System.out.println("El resultado de la divisi�n es: " + (num1 / num2));
				}
				else {
					System.out.println("No puedes dividir un n�mero entre cero");
				}
				break;
			default:
				System.out.println("Debes elegir una operaci�n valida");
		}
	}
}
