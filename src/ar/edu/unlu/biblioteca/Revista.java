package ar.edu.unlu.biblioteca;

public class Revista extends Publicacion {
	private String ISSN;
	private int numero;
	private int yearPublicacion;

	public Revista(String nombre, String editor, String telefonoProveedor, String ISSN, int numero,
			int yearPublicacion) {
		super(nombre, editor, telefonoProveedor);
		this.ISSN = ISSN;
		this.numero = numero;
		this.yearPublicacion = yearPublicacion;
	}
}
