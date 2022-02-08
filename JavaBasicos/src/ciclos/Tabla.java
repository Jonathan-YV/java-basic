package ciclos;

import java.util.Scanner;

public class Tabla{
    public static void main(String[] args){
    	
        Scanner console = new Scanner(System.in);
        System.out.print("Ingresa cualquier número positivo: ");
        int num = console.nextInt();
        System.out.print("Hasta que número se implime la tabla: ");
        int fin = console.nextInt();
        console.close();   
        
        System.out.println("Tabla de multiplicar del número " + num);
        System.out.println("---------------------------------------");
        
        int con = 1;
        while(con <= fin) {
        	System.out.println(num + "x" + con + " = " + (con * num));
        	con++;
        }
        System.out.println("---------------------------------------");
        
    }
}	
