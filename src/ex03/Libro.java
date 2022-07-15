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
	
	
	
	

}
