package com.generation;

/**
 * @author jonat
 *
 */
public class Tacos {
	private String tipoDeTortilla;
	private String tipoDeGuisado;
	private int numeroDeTortilla;
	private String tamanioDeTortilla;
	private float precio;
	
//	public Tacos(String tipoDeTortilla,String tipoDeGuisado,int numeroDeTortilla,String tamanioDeTortilla,float precio) {
//		this.tipoDeTortilla = tipoDeTortilla;
//		this.tipoDeGuisado = tipoDeGuisado;
//		this.numeroDeTortilla = numeroDeTortilla;
//		this.tamanioDeTortilla = tamanioDeTortilla;
//		this.precio = precio;
//	}
	
	void preparar() {
		System.out.println("Preparando tu taco");
	}
	
	void verder() {
		System.out.println("Taco vendido");
	}
	
	void ponerSalsa() {
		System.out.println("Agregando salsa");
	}

	@Override
	public String toString() {
		return "Tacos [tipoDeTortilla=" + tipoDeTortilla + ", tipoDeGuisado=" + tipoDeGuisado + ", numeroDeTortilla="
				+ numeroDeTortilla + ", tamanioDeTortilla=" + tamanioDeTortilla + ", precio=" + precio + "]";
	}
	
	void subirPrecio(float aumento) {
		precio = precio + aumento;
	}

	
	
	
	public String getTipoDeTortilla() {
		return tipoDeTortilla;
	}

	public void setTipoDeTortilla(String tipoDeTortilla) {
		this.tipoDeTortilla = tipoDeTortilla;
	}

	public String getTipoDeGuisado() {
		return tipoDeGuisado;
	}

	public void setTipoDeGuisado(String tipoDeGuisado) {
		this.tipoDeGuisado = tipoDeGuisado;
	}

	public int getNumeroDeTortilla() {
		return numeroDeTortilla;
	}

	public void setNumeroDeTortilla(int numeroDeTortilla) {
		if (numeroDeTortilla > 0) {
			this.numeroDeTortilla = numeroDeTortilla;
		}
		else {
			throw new IllegalArgumentException("No puedes tener un taco sin tortilla");
		}
		
	}

	public String getTamanioDeTortilla() {
		return tamanioDeTortilla;
	}

	public void setTamanioDeTortilla(String tamanioDeTortilla) {
		this.tamanioDeTortilla = tamanioDeTortilla;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
	
	
	
	
}
