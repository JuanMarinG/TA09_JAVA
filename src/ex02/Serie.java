package ex02;
public class Serie implements Entregable{
	
	//Generamos atributos
	private String titulo;
	private int temporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
	//CONSTANTES
	
	private final int TEMP=3;
	
	
	//Metodos
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getTemporadas() {
		return temporadas;
	}
	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}
	public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
	
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", temporadas=" + temporadas + ", entregado=" + entregado + ", genero="
				+ genero + ", creador=" + creador + "]";

		
	//CONSTRUCTORES

	
	}
	public Serie() {
		this.titulo ="";
		this.temporadas =TEMP;
		this.entregado =false;
		this.genero="";
		this.creador ="";
	}
	
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.temporadas=TEMP;
		this.entregado=false;
		this.genero="";
		this.creador = creador;
	}
	
	public Serie(String titulo, int temporadas, String genero, String creador) {
		this.titulo = titulo;
		this.temporadas = temporadas;
		this.genero=genero;
		this.creador = creador;
	}
	@Override
	public void entregar() {
		this.entregado = true;
	
	}
	@Override
	public void devolver() {
		this.entregado = false;
		
	}
	@Override
	public boolean isEntregado() {
		return entregado;
		
	}
	@Override
	public int compareTo(Object a) {
		Serie serie = (Serie)a;
		int masTemporadas;

		if (this.temporadas > serie.getTemporadas()) {
			masTemporadas = -1;
		}else if (this.temporadas < serie.getTemporadas()) {
			masTemporadas = 1;
		}else {
			masTemporadas = 0;
		}

		return masTemporadas;
	}
	
	
}


	
	
	
	
	


