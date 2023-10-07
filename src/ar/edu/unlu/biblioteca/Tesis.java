package ar.edu.unlu.biblioteca;

public class Tesis extends Publicacion {
	private String autor;
	private int mesPublicacion;
	private int yearPublicacion;

	public Tesis(String nombre, String editor, String telefonoProveedor, String autor, int mesPublicacion,
			int yearPublicacion) {
		super(nombre, editor, telefonoProveedor);
		this.autor = autor;
		this.mesPublicacion = mesPublicacion;
		this.yearPublicacion = yearPublicacion;
	}
}
