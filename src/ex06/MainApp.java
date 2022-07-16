package ex06;
import java.util.ArrayList;

public class MainApp {
	
	static ArrayList<Espectador> espectadores = new ArrayList<Espectador>();

	public static void main(String[] args) {
		Pelicula pelicula = new Pelicula("Currito de la Cruz", 132, 3, "Rafael Gil");
		Cine cine = new Cine(pelicula, 8.50);
		
		
		
		cine.sentarEspectadores(espectadores);
		cine.imprimirAsientosOcupados();
	
	}
	// JUAN
	
	// Este metodo ha de crear espectadores y a�adirlos a la lista espectadores

	public static String generarEspectadores(String nombre,int edad,double dinero) {
	
		Espectador espectador = new Espectador(
		Espectador.generarNombreAleatorio(Espectador.generarNumeroAleatorio(1, 36)),
		// Crear bucle (aleatorio entre 20 y 50, por ejemplo) //-----se crean dos bucles, tanto para generar tanto edad como dinero
		Espectador.generarNumeroAleatorio(15, 60), //rango de edad
		Espectador.generarNumeroAleatorio(20, 50));//rango de dinero
	
		espectador.generarEspectadores(espectadores);
		// En cada iteracion va a crear objecto Espectador y lo va a sumar a la lista
	}
	

}


