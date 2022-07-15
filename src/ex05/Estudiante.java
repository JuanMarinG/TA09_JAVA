package ex05;

public class Estudiante extends Persona{
	
	private int nota;
	
	public Estudiante() {
		super();
		this.nota=0;
		asistencia();
	}
	
	public Estudiante(String nombre,int edad,Sexo sexo,int nota) {
		super(nombre,edad,sexo);
		this.nota = nota;
		asistencia();
	}
		
	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public void asistencia() {
		// random num 0 a 10
		int n = new java.util.Random().nextInt(10);
		// 50% 50%, lo simulamos con pares e impares hasta 10
		if (n%2==0) presente = true;	
	}

	@Override
	public String toString() {
		return "Estudiante [nota=" + nota + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", presente="
				+ presente + "]";
	}
	
	

}
