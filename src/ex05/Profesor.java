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

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}
	
	public boolean asistencia() {
		// TODO profesor puede hacer un 20% de "novillos"
		//hara falta saber cuantas clases en total va a haber
		
		return false;
	}
	
}
