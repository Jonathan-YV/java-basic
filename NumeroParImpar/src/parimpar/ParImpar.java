package parimpar;

import java.util.Scanner;

public class ParImpar {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Escribe el n�mero a evaluar: ");
		int numeroEvaludado = input.nextInt();
		input.close();
		
		String resultado = (numeroEvaludado % 2 == 0) ? ("Es n�mero " + numeroEvaludado + " es par") : ("Es n�mero " + numeroEvaludado + " es impar") ;
		System.out.println(resultado);
		
	}
}