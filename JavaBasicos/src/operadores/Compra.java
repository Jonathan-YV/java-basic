package operadores;

import java.util.Scanner;


public class Compra {
	public static void main(String[] args) {
		System.out.println("Ingresa el monto de la compra");
		Scanner sc = new Scanner(System.in);
		float monto = sc.nextFloat();
		if((monto>=1)&&(monto<=999)) {
			System.out.println("El monto original es = " + monto);
		}
		else if((monto>=1000)&&(monto<=4999)) {
			System.out.println("El monto original es "+ monto + " con 10% de descuento es ="+ (0.9*monto));
		}
		else if((monto>=5000)&&(monto<=9999)) {
			System.out.println("El monto original es "+ monto + " con 20% de descuento es ="+ (0.8*monto));
		}
		else if((monto>=10000)) {
			System.out.println("El monto original es "+ monto + " con 30% de descuento es ="+ (0.7*monto));
		}
		else {
			System.out.println("Ingresaste monto no valido");
		}
	}

}
