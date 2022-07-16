package ex06;

import java.util.ArrayList;
import java.util.Enumeration;
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
	
	public void sentarEspectadores(ArrayList<Espectador> espectadores) {
        for(Espectador e : espectadores){
            // Comprovar edad minima y dinero
            if(e.getEdad() >= pelicula.getEdadMin() && e.getDinero() >= precio) {
            	// Generar asiento aleatorio. Si esta ocupado, genera otro hasta que encuentre uno libre
	            String asiento;
	            do {
		            asiento = "" + (int) ((Math.random() * (8 - 1)) + 1) + (char)(65+((int) ((Math.random() * (9 - 1)) + 1)));
	            }while(!asientos.get(asiento));
	            
	            // Cambiar el estado del asiento a ocupado
	            asientos.put(asiento, false);
            }
        }
	}
	
	public void imprimirAsientosOcupados() {
		Enumeration<String> e = asientos.keys();
		 
        while (e.hasMoreElements()) {
            String key = e.nextElement();
            if(!asientos.get(key))
            	System.out.println(key);
        }
	}

	
}
