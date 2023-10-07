package ar.edu.unlu.biblioteca;

import java.util.ArrayList;

public class Biblioteca {
private ArrayList<Publicacion> misPublicaciones = new ArrayList<Publicacion>();

public void agregarPublicacion(Publicacion publicacion) {
	misPublicaciones.add(publicacion);
}
public Libro buscarLibro(String titulo) {
	
	return; // debe devolver Publicacion
}

}
