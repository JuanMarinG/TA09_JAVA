package ex05;


public class Profesor extends Persona{
	
	private Materia materia;
	
	public Profesor() {
		super();
		this.materia=null;
	}
	
	public Profesor(String nombre,int edad,Sexo sexo,Materia materia) {
		super(nombre,edad,sexo);
		this.materia = materia;
	}

	@Override
	public void faltaAssistencia() {
		// TODO Auto-generated method stub
		
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}
	
}
