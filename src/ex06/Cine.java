package ex06;

import java.util.Hashtable;

public class Cine {

	private Pelicula pelicula;
	private double precio;
	
	private static final int FILAS = 8;
	private static final int COLUMNAS = 9;
	private Hashtable<String,Boolean> asientos = new Hashtable<String,Boolean>();
	
	public Cine() {
		this(null,0);
	}
	
	public Cine(Pelicula peli,double precio) {
		this.pelicula = peli;
		this.precio = precio;
		generarAsientos();
	}
	
	
	private void generarAsientos() {
		// la key de cada registro del hashtable será la concatenación de fila y columna
		// el valor será true por defecto, para indicar que el sitio está disponible
		// accederemos a una posición así: cine.getAsientos().get("1A");
		for (int i=1;i<=FILAS;i++) {
			for (int j=0;j<COLUMNAS;j++) {
				asientos.put(""+i+(char)(65+j), true);
			}
		}
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Hashtable<String, Boolean> getAsientos() {
		return asientos;
	}

	public void setAsientos(Hashtable<String, Boolean> asientos) {
		this.asientos = asientos;
	}

	
}
