package ex05;

public class Estudiante extends Persona{
	
	private int nota;
	
	public Estudiante() {
		super();
		this.nota=0;
	}
	
	public Estudiante(String nombre,int edad,Sexo sexo,int nota) {
		super(nombre,edad,sexo);
		this.nota = nota;
	}
		

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public boolean asistencia() {
		//estudiante puede hacer un 50% de novillos, 
		//hara falta saber cuantas clases en total va a haber
		//ha de quedar registrado en el aula
		
		return false;		
	}

}
