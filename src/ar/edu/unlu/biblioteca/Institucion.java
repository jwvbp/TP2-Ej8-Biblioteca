package ar.edu.unlu.biblioteca;

import java.util.ArrayList;

public class Institucion {
	private Biblioteca miBiblioteca = new Biblioteca();
	private ArrayList<Socio> miSocio = new ArrayList<Socio>();
	private ArrayList<Prestamo> miPrestamo = new ArrayList<Prestamo>();

	public void agregarSocio(Socio socio) {
		miSocio.add(socio);
	}

	public void agregarPrestamo(Prestamo prestamo) {
		miPrestamo.add(prestamo);
	}
	public void agregarPublicacion(Publicacion publicacion) {
		miBiblioteca.agregarPublicacion(publicacion);
	}
	
	public void prestar(String titulo, int codSocio) {
		miBiblioteca.buscarLibro(titulo);
		miSocio.buscarSocio(codSocio);
	}
}
