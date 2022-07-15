package ex05;

public class Profesor extends Persona{
	
	private Materia materia;
	
	public Profesor() {
		super();
		this.materia=null;
		asistencia();
	}
	
	public Profesor(String nombre,int edad,Sexo sexo,Materia materia) {
		super(nombre,edad,sexo);
		this.materia = materia;
		asistencia();
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}
	
	@Override
	public void asistencia() {
		// random num 0 a 10
		int n = new java.util.Random().nextInt(10);
		// si es menor que 8 (80%), va a asistir, si no, entendemos que el 20% de veces que no asistirá
		if (n<8) presente = true;
	}

	@Override
	public String toString() {
		return "Profesor [materia=" + materia + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo
				+ ", presente=" + presente + "]";
	}
	
	
}
