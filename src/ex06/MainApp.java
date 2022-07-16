package ex06;

import java.util.ArrayList;

public class MainApp {
	
	static ArrayList<Espectador> espectadores = new ArrayList<Espectador>();

	public static void main(String[] args) {
		Pelicula pelicula = new Pelicula("Currito de la Cruz", 132, 3, "Rafael Gil");
		Cine cine = new Cine(pelicula, 8.50);
		
		generarEspectadores();
		
		cine.sentarEspectadores(espectadores);
		cine.imprimirAsientosOcupados();
	}

	// JUAN
	private static void generarEspectadores() {
		// Este metodo ha de crear espectadores y a�adirlos a la lista espectadores
		// Crear bucle (aleatorio entre 20 y 50, por ejemplo)
		// En cada iteracion va a crear objecto Espectador y lo va a a�adir a la lista
	}

}
