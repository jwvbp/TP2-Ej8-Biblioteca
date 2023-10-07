package ar.edu.unlu.biblioteca;

public class Socio {
	private int numSocio;
	private String nombre;
	private String DNI;
	
	public Socio(int numSocio, String nombre, String DNI) {
		super();
		this.numSocio = numSocio;
		this.nombre = nombre;
		DNI = DNI;
	}
	
	public Socio buscarSocio(int codSocio) {
		return; // debe devolver Socio
	}
}
