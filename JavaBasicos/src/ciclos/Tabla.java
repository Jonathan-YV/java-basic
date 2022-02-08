package ciclos;

import java.util.Scanner;

public class Tabla{
    public static void main(String[] args){
    	
        Scanner console = new Scanner(System.in);
        System.out.print("Ingresa cualquier n�mero positivo: ");
        int num = console.nextInt();
        System.out.print("Hasta que n�mero se implime la tabla: ");
        int fin = console.nextInt();
        console.close();   
        
        System.out.println("Tabla de multiplicar del n�mero " + num);
        System.out.println("---------------------------------------");
        
        int con = 1;
        while(con <= fin) {
        	System.out.println(num + "x" + con + " = " + (con * num));
        	con++;
        }
        System.out.println("---------------------------------------");
        
    }
}	
