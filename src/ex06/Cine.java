package ex06;

public class Cine {

	private Pelicula pelicula;
	private double precio;
	
	
	//?????? hay otra estructura mas idonea?
	private int asientos[][] = new int [8][8];
	
	public Cine() {
		this(null,0);
	}
	
	public Cine(Pelicula peli,double precio) {
		this.pelicula = peli;
		this.precio = precio;
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

	
	//????? array bidi ?
	public int[][] getAsientos() {
		return asientos;
	}

	public void setAsientos(int[][] asientos) {
		this.asientos = asientos;
	}

}
