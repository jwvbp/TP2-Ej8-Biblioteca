package ar.edu.unlu.biblioteca;

public class Main {

	public static void main(String[] args) {

		Institucion miInstitucion = new Institucion();
		// param Libro(String nombre, String editor, String telefonoProveedor, String
		// ISBN, int yearPublicacion, String autor)
		Libro libro1 = new Libro("Las penas", "Alfaguara", "3437789", "3874-455566666-9", 1998, "Juan Garcia");
		Ejemplar ejemplar1 = new Ejemplar(1, "buen estado");
		Ejemplar ejemplar2 = new Ejemplar(2, "buen estado");
		Ejemplar ejemplar3 = new Ejemplar(3, "buen estado");
		libro1.agregarEjemplar(ejemplar1);
		libro1.agregarEjemplar(ejemplar2);
		libro1.agregarEjemplar(ejemplar3);
		miInstitucion.agregarPublicacion(libro1);

		Libro libro2 = new Libro("Los malos", "Salvat", "3677789", "3856-4587454-8", 1999, "Jose Torres");
		Ejemplar ejemplar4 = new Ejemplar(1, "buen estado");
		Ejemplar ejemplar5 = new Ejemplar(2, "buen estado");
		miInstitucion.agregarPublicacion(libro2);

		// param Tesis(String nombre, String editor, String telefonoProveedor, String
		// autor, int mesPublicacion, int yearPublicacion)
		Tesis tesis1 = new Tesis("Estudio del agua", "UTN", "4764749747", "Marcelito", 05, 2021);
		miInstitucion.agregarPublicacion(tesis1);
		Tesis tesis2 = new Tesis("Muchas sumas", "UTN", "4764749747", "Andrea Casas", 07, 2020);
		miInstitucion.agregarPublicacion(tesis2);

		// param Socio(int numSocio, String nombre, String DNI)
		Socio socio1 = new Socio(1, "Felipe Cuentas", "24345678");
		miInstitucion.agregarSocio(socio1);
		Socio socio2 = new Socio(2, "Ana Morales", "45624348");
		miInstitucion.agregarSocio(socio2);
		Socio socio3 = new Socio(3, "Daniel Santos", "345678999");
		miInstitucion.agregarSocio(socio3);
		
		miInstitucion.prestar("Las penas","1"); //titulo de publicacion y numero de socio

	}

}
