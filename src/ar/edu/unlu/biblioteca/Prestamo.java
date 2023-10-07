package ar.edu.unlu.biblioteca;

import java.time.LocalDate;

public class Prestamo {
private Socio socio;
private Ejemplar ejemplar;
private int numPrestamo;
private LocalDate fechaPrestamo;
private LocalDate fechaDevolucion;
private LocalDate fechaQueDevolvio;
private String estadoLibro;

public Prestamo(Socio socio, Ejemplar ejemplar, int numPrestamo, LocalDate fechaPrestamo, LocalDate fechaDevolucion) {
	super();
	this.socio = socio;
	this.ejemplar = ejemplar;
	this.numPrestamo = numPrestamo;
	this.fechaPrestamo = fechaPrestamo;
	this.fechaDevolucion = fechaDevolucion;
}


}
