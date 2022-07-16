package ex05;

public class Ex5App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		//CREAMOS PROFESOR
		Profesor profesor = new Profesor("Jose",40, Sexo.HOMBRE, Materia.MATEMATICAS);
		
		//CREAMOS ESTUDIANTES
		Estudiante listado []= new Estudiante [7];
		listado [0]= new Estudiante ("Carlos", 17, Sexo.HOMBRE, 7);
		listado [1]= new Estudiante ("Carla", 16, Sexo.MUJER, 5);
		listado [2]= new Estudiante ("Maria", 17, Sexo.MUJER, 3);
		listado [3]= new Estudiante ("Sofia", 17, Sexo.MUJER, 9);
		listado [4]= new Estudiante ("Arnau", 18, Sexo.HOMBRE, 2);
		listado [5]= new Estudiante ("Josep", 17, Sexo.HOMBRE, 6);
		listado [6]= new Estudiante ("Joana", 18, Sexo.MUJER, 8);
		
		//CREAMOS EL AULA Y MOSTRAR RESULTADOS
        Aula aula1 = new Aula(001, 9, Materia.MATEMATICAS, profesor, listado);
        
        if(aula1.puedeDarseClase()){
        	aula1.mostrarAprobados();        
        }
        
    }
     
}