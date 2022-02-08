package operadores;

import java.util.Scanner;

public class EstructuraDeControlSwitch {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un dia de la semana: ");
		String dia = sc.nextLine();
		sc.close();
		
		switch(dia.toLowerCase()) {
			case "lunes":
				System.out.println("Ya mero es viernes, toma un café");
				break;
			case "martes":
				System.out.println("Lunes chiquito");
				break;
			case "miercoles":
				System.out.println("Miércoles, pero a qué costo");
				break;
			case "jueves":
				System.out.println("Juebebes de sed");
				break;
			case "viernes":
				System.out.println("Viernes de fiesta");
				break;
			default:
				System.out.println("No es valido");
				break;
		}
			
	}
	
}


