package ar.edu.unlu.biblioteca;

import java.util.ArrayList;

public class Libro extends Publicacion{
private String ISBN;
private int yearPublicacion;
private String autor;
private ArrayList<Ejemplar> misEjemplares = new ArrayList<Ejemplar>();

public Libro(String nombre, String editor, String telefonoProveedor, String ISBN, int yearPublicacion, String autor) {
	super(nombre, editor, telefonoProveedor);
	this.ISBN = ISBN;
	this.yearPublicacion = yearPublicacion;
	this.autor = autor;
}

public void agregarEjemplar(Ejemplar ejemplar) {
	misEjemplares.add(ejemplar);
}
}
