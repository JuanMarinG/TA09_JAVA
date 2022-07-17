package ex06;

import java.util.ArrayList;

public class MainApp {

	static ArrayList<Espectador> espectadores = new ArrayList<Espectador>();

	public static void main(String[] args) {
		Pelicula pelicula = new Pelicula("Currito de la Cruz", 132, 18, "Rafael Gil");
		Cine cine = new Cine(pelicula, 8.50);
		
		generarEspectadores();
		System.out.println(espectadores.toString());
		
		cine.sentarEspectadores(espectadores);
		cine.imprimirAsientosOcupados();
	}
	
	public static void generarEspectadores(){
		
		int cantidadEspectadores = Espectador.generarNumeroAleatorio(1,50); //generamos una cantidad aleatoria de espectadores
		
		for (int n = 0; n < cantidadEspectadores; n++) {  //recorremos array num aleatorio de veces
			Espectador espectador = new Espectador(
					Espectador.generarNombreAleatorio(),
					Espectador.generarNumeroAleatorio(15, 60), // rango de edad
					Espectador.generarNumeroAleatorio(20, 50));// rango de dinero
			
			espectadores.add(espectador);
		}
	}
}

