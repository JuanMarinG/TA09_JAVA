package ex03;
public class MainApp {

	public static void main(String[] args) {

		Libro libro1 = new Libro("45932852", "La marmota", "Leena Cooper", 386);
		Libro libro2 = new Libro("92749792", "El bicho", "Martin Spencer", 543);
		
		System.out.println(libro1.toString());
		System.out.println(libro2.toString());

		Libro.sumPag(libro1, libro2); //Llamamos a metodo sumaLibros dentro de la clase Libro para que nos muestre el total de paginas
		
	}
}
