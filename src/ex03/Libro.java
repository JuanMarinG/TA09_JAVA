package ex03;

public class Libro {
	
	private String ISBN;
	private String title;
	private String author;
	private int numPags;
	
	public Libro() {
		this("","","",0);
	}
	
	public Libro(String ISBN,String title,String author,int pags) {
		this.ISBN = ISBN;
		this.title = title;
		this.author = author;
		this.numPags = pags;
	}
	
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getNumPags() {
		return numPags;
	}
	public void setNumPags(int numPags) {
		this.numPags = numPags;
	}
	
	@Override
	public String toString() {
		return "El libro "+title+" con ISBN "+ISBN+" creado por "+author+" tiene "+ numPags + " paginas";
	}
	
	public static void sumPag(Libro libro1, Libro libro2) {
		
		int numPagLibro1 = libro1.getNumPags();
		int numPagLibro2 = libro2.getNumPags();
		
		if(numPagLibro1<numPagLibro2) {
			System.out.println("El libro "+libro2.getTitle()+" tiene mas paginas");	
		}else if(numPagLibro1>numPagLibro2){
			System.out.println("El libro "+libro1.getTitle()+" tiene mas paginas");
		} else {
			System.out.println("Ambos libros tiene las mismas paginas");
		}
		
	}
	
}


		
	
	
	


