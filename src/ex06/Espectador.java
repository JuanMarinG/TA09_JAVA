package ex06;

import java.util.ArrayList;

public class Espectador {
	
	
	private String nombre;
	private int edad;
	private double dinero;
	
	public Espectador() {
		this("",0,0);
	}
	
	public Espectador(String nombre,int edad,double dinero) {
		this.nombre = nombre;
		this.edad = edad;
		this.dinero = dinero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getDinero() {
		return dinero;
	}

	public void setDinero(double dinero) {
		this.dinero = dinero;
	}

	@Override
	public String toString() {
		return "Espectador [nombre=" + nombre + ", edad=" + edad + ", dinero=" + dinero + "]";
	}

	public static int generarNumeroAleatorio(int minimo, int maximo) {
		
	        int num = (int)(Math.random()*(minimo-(maximo+1))+(maximo+1));
	        return num;
	}
	
	public static String nombres []={"Joana", "Arnau", "Joan", "Josep", "Sara"};

	

	public static String[] generarNombreAleatorio(int cantidad) {
		String[] nombresAleatorios = new String[cantidad];

		String[] nombres = { "Joana", "Arnau", "Juan", "Josep", "Adria", "Barbara", "Clara", "Dani",
				"David", "Ionela"};
		
		for (int i = 0; i < cantidad; i++) {
			nombresAleatorios[i] = nombres[(int) (Math.floor(Math.random()*((nombres.length-1)-0+1)+0))];
		}
		return nombresAleatorios;
	}
	
}
		
	
		
	

