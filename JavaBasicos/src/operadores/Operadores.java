package operadores;

public class Operadores {
	
public static void main(String[] args) {
	//Operadores Aritméticos
	//+, -, /, *, %
	
	int a = 10;
	int b = 20;
	double c = 10.5;
	
	int suma = a + b;
	System.out.println(c);	
	
	String str1 = "El resultado de la suma es: "; //concatenar
	System.out.println(str1 + suma);
	
	// resta
	System.out.println("El resultado de la resta: " + (a - b));
	
	// division
	int division = a / b;
	System.out.println("El resultado de la division: " + division);
	
	double division2 = c / b;
	//double division2 = (double) a / b; //casteo
	// Por lo menos uno de los datos debe ser de tipo double
	//10.0 / 20= 0-5
	System.out.println("El resultado de la division: " + division2);
	
	//multiplicacion
	double multiplicacion = c * a;
	System.out.println("El resultado de la multiplicacion: " + multiplicacion);

	//modulo
	int modulo = a % b;
	System.out.println("El modulo de la operacion es : " + modulo);

	/* Operador de asignación
	 * =
	 * 
	 */
	
	int d =5, e; //inicializar las variables vacias
	e = 6;
	System.out.println(d +" - "+ e);

	//Operadores de declaración compuesta 
	//+=, -=, *=, %=
	//Una operacion simplificada
	
	int f = 0, g =5 ;
	
	f+=5;
	//f = f + 5
	System.out.println(f);
	
	//Operaciones relacionales
	/*
	 * <, >, <=, >=
	 * == igualdad
	 * != diferencia
	 * Resultado un valor de tipo boolean/booleano (true or false)
	 */
	
	int h = 15, i= 25;
	String j= "Hola";
	System.out.println(h>i); //false
	System.out.println(i != h);//true
	// System.out.println(h != j); //Son valores distintos y no se pueden comparar

	//Operador unario
	/* ++, --
	 * Preasignacion  --> Se le asigna un valor antes de usarse
	 * Postasignacion --> Primero lee el valor y despues le suma 1
	 */
	
	int k = 0, l =0;
	k++;
	System.out.println(++k); //
	System.out.println(k++); //
	
	//Precedencia de operadores * / % + -
	int operacion =  4 + 5 * 6 / 3;
	System.out.println(operacion); 
	
	int x = 0, y =0;
	int operacion2 = ++x + y--;
	System.out.println(operacion2); //1

	//Operador ternario sustituir al IF
	//es un if, else abreviado
	//solo nos permite tomar una decision
	int edad = 18,  valor1 = 0, valor2 = 1;
	
	int valor = (edad<=18) ? 2:1;
	int resultado = (edad <=18) ? (valor1 = 2) : (valor1 = 3);
	
	// String resultado = (edad <= 18) ? "uno" : "dos" ;
	//Paréntesis son opcionales
	System.out.println(resultado); 

	
	}

}