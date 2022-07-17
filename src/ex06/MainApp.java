package ex06;

import java.util.ArrayList;

public class MainApp {

	static ArrayList<Espectador> espectadores = new ArrayList<Espectador>();

	public static void main(String[] args) {
		Pelicula pelicula = new Pelicula("Currito de la Cruz", 132, 3, "Rafael Gil");
		Cine cine = new Cine(pelicula, 8.50);
		
		generarEspectadores();
		System.out.println(espectadores.toString());
		
		cine.sentarEspectadores(espectadores);
		cine.imprimirAsientosOcupados();
	}
	
	// JUAN
	// Este metodo ha de crear espectadores y anadirlos a la lista espectadores
	
	
	
	public static void generarEspectadores(){
		// crear variable int y generar un aleatorio
		// meter todo este c�digo en un bucle, y recorrer tantas veces como diga el aleatorio
		for (int n = 20; n < 50; n++) {
			Espectador espectador = new Espectador(
					Espectador.generarNombreAleatorio(Espectador.generarNumeroAleatorio(1, 36)),
					Espectador.generarNumeroAleatorio(15, 60), // rango de edad
					Espectador.generarNumeroAleatorio(20, 50));// rango de dinero
			
			espectadores.add(espectador);
		}
	}
}

