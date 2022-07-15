package ex05;

public class Profesor extends Persona{
	
	private Materia materia;
	
	public Profesor() {
		super();
		this.materia=""; //al ser enum, ver que se tendria que poner
	}
	
	public Profesor(String nombre,int edad,String genero,Materia materia) {
		super(nombre,edad,genero);
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
