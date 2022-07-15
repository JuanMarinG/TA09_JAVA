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

	@Override
	public void faltaAssistencia() {
		// TODO Auto-generated method stub
		
	}

}
