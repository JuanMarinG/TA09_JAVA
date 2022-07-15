package ex03;

public class MainApp {
	
	public static void main(String[] args) {
		
		Libro libro1 = new Libro("45932852","La marmota","Leena Cooper",386);
		Libro libro2 = new Libro("92749792","El bicho","Martin Spencer",543);
		
		System.out.println(libro1.toString());
		System.out.println(libro2.toString());
		
		int numPagLibro1 = libro1.getNumPags();
		int numPagLibro2 = libro2.getNumPags();
		
		if(numPagLibro1<numPagLibro2) {
			System.out.println("El libro "+libro2.getTitle()+" tiene mas paginas");
		}else if(numPagLibro1>numPagLibro2){
			System.out.println("El libro "+libro1.getTitle()+" tiene mas paginas");
		} else {
			System.out.println("Ambos libros tiene las mismas páginas");
		}
	}
}




