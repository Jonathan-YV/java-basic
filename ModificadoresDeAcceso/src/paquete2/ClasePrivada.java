package paquete2;

public class ClasePrivada {
	// atributos
	private String nombre;
	private int edad;
	
	// m�todos
	public void setSaludar(String nombre) {
		this.nombre = nombre;
		//System.out.println("Hola mundo");
	}
	
	public String getSaludar() {
		return this.nombre;
	}
}
