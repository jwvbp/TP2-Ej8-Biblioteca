package ar.edu.unlu.biblioteca;

public class Diario extends Publicacion{
private int diaPublicacion;
private int mesPublicacion;
private int yearPublicacion;

public Diario(String nombre, String editor, String telefonoProveedor, int diaPublicacion, int mesPublicacion, int yearPublicacion) {
	super(nombre, editor, telefonoProveedor);
	this.diaPublicacion = diaPublicacion;
	this.mesPublicacion = mesPublicacion;
	this.yearPublicacion = yearPublicacion;
	
}
}
