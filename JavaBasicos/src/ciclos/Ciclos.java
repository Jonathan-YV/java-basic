package ciclos;

public class Ciclos {
	public static void main(String[] args) {
		int control = 0;
		
		while(control < 10) {
			System.out.println("Control = " + control);
			control++;
		}
		
		control = 0;
		do {
			System.out.println("Control = " + control);
			control++;
		}while(control < 3);
		
		for(int i=0; i<3; i++) {
			if(i%2 == 0) {
				continue;
			}
			System.out.println("Control = " + i);
		}
	}
}
