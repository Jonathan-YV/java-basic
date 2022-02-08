package arreglos;

public class Arreglos {
	public static void main(String[] args) {
		int numeros[];
		numeros = new int[4];
		
		String[] nombres = new String[4];
		
		numeros[0] = 10;
		numeros[1] = 100;
		numeros[2] = 20;
		numeros[3] = 30;
		
		System.out.println(numeros[0]);
		System.out.println(numeros);
		
		for(int i=0; i<numeros.length; i++) {
			System.out.println(numeros[i]);
		}
	}
	
	
}
