package ex06;

import java.util.ArrayList;

public class MainApp {
	
	ArrayList<Espectador> espectadores = new ArrayList<Espectador>();

	public static void main(String[] args) {
		Pelicula pelicula = new Pelicula("Currito de la Cruz", 132, 3, "Rafael Gil");
		Cine cine = new Cine(pelicula, 8.50);
		
		generarEspectadores();
		sentarEspectadores(cine);
	}

	// ARNAU
	private static void sentarEspectadores(Cine cine) {
		// Este metodo va a sentar a los espectadores en un sitio
	}

	// JUAN
	private static void generarEspectadores() {
		// Este metodo ha de crear espectadores y añadirlos a la lista espectadores
		// Crear bucle (aleatorio entre 20 y 50, por ejemplo)
		// En cada iteracion va a crear objecto Espectador y lo va a añadir a la lista
	}

}
