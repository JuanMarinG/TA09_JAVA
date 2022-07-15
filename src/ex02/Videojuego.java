package ex02;

public class Videojuego {

	// Generamos atributos
	private String titulo;
	private int horas;
	private boolean entregado;
	private String genero;
	private String compañia;

	// Constantes

	private final int HORAS = 10;

	// Constructores

	public Videojuego() {
		this.titulo = "";
		this.horas = HORAS;
		this.entregado = false;
		this.genero = "";
		this.compañia = "";
	}

	public Videojuego(String titulo, int horas) {
		this.titulo = titulo;
		this.horas = HORAS;
	}

	public Videojuego(String titulo, int horas, String genero, String compañia) {
		super();
		this.titulo = titulo;
		this.horas = horas;
		this.genero = genero;
		this.compañia = compañia;
	}

	// Metodos

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}

	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", horas=" + horas + ", entregado=" + entregado + ", genero=" + genero
				+ ", compañia=" + compañia + "]";
	}

	public void entregar() {
		this.entregado = true;
	}

	public void devolver() {
		this.entregado = false;
	}

	public boolean isEntregado() {
		return entregado;
	}

	public int compareTo(Object v) {
		Videojuego game = (Videojuego) v;
		int masHoras;

		if (this.horas > game.getHoras()) {
			masHoras = -1;
		} else if (this.horas < game.getHoras()) {
			masHoras = 1;
		} else {
			masHoras = 0;
		}
		return masHoras;

	}

}
