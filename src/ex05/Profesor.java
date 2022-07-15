package ex05;

<<<<<<< HEAD
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
	
	
=======
public class Profesor {
>>>>>>> 5e2e89e3de8a8ab85a6f4ddb53a42dc8e7d4daa8

}
