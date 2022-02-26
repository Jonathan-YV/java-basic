package parimpar;

import java.util.Scanner;

public class ParImpar {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Escribe el número a evaluar: ");
		int numeroEvaludado = input.nextInt();
		input.close();
		
		String resultado = (numeroEvaludado % 2 == 0) ? ("Es número " + numeroEvaludado + " es par") : ("Es número " + numeroEvaludado + " es impar") ;
		System.out.println(resultado);
		
	}
}