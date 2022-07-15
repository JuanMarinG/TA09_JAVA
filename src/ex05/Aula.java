package ex05;

public class Aula {
	int id;
	int nEstudiantes;
	Materia materia;
	Estudiante estudiantes[];
	Profesor profesor;
	
	public Aula(int id, int nEstudiantes, Materia materia, Profesor profesor, Estudiante estudiantes[]) {
		this.id = id;
		this.nEstudiantes = nEstudiantes;
		this.materia = materia;
		this.profesor = profesor;
		this.estudiantes = estudiantes;
	}
	
	public void puedeDarseClase() {
		if(profesor.isPresente() == false) {
			System.out.println("No se puede dar clase. El profesor no ha asistido.");
			return;
		}
		if(materia != profesor.getMateria()) { //si el profesor no esta (is Presente == false) entonces no hace falta mirar si da esa materia
			System.out.println("No se puede dar clase. El profesor no imparte esta materia.");
			return;
		}
		if(getNumEstudiantes() <= nEstudiantes/2) {
			System.out.println("No se puede dar clase. Se necesitan m�s de la mitad de alumnos.");
			return;
		}

		System.out.println("--- HOMBRES APROBADOS ---");
		for(Estudiante e : estudiantes) {
			if (e.getNota() >= 5 && e.getSexo() == Sexo.HOMBRE)
				System.out.println(e.toString());
		}
		
		System.out.println("--- MUJERES APROBADAS ---");
		for(Estudiante e : estudiantes) {
			if (e.getNota() >= 5 && e.getSexo() == Sexo.MUJER)
				System.out.println(e.toString());
		}
	}
	
	private int getNumEstudiantes() {
		int n = 0;

		for(Estudiante e : estudiantes) {
			if(e.isPresente())
				n++;
		}
		return n;
	}
	
	//donde se usaria el metodo asistencia que ha de calcular porcentaje de novilles de estudiante y profe?
	

}
