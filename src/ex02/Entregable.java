package ex02;

public interface Entregable {
	
	public void entregar(); // public void entregar() {	this.delivered = true;}
	
	public void devolver(); // public void devolver() {	this.delivered = false;}
	
	public boolean isEntregado(); //public boolean isEntregado(){	return delivered;}
	
	public int compareTo(Object a); 
	/**
	 *  compara las horas estimadas en los videojuegos
	 *  compara el num de temporadas. 
	 *  
	 *  //implementacion metodo class serie
	 *  public int compareTo(Object s) {  
			Serie serie = (Serie)s;
			int masTemporadas;
	
			if (this.numSeasons > serie.getNumSeasons()) {
				masTemporadas = -1;
			}else if (this.numSeasons < serie.getNumSeasons()) {
				masTemporadas = 1;
			}else {
				masTemporadas = 0;
			}
	
			return masTemporadas;
	}
		
		
		implementacion metodo class videojuego
		public int compareTo(Object v) {
			Videojuego game = (Videojuego)s;
			int masHoras;
	
			if (this.horasEstimadas > game.getHorasEstimadas()) {
				masHoras = -1;
			}else if (this.horasEstimadas < game.getHorasEstimadas()) {
				masHoras = 1;
			}else {
				masHoras = 0;
			}
	
			return masHoras;
		}
	 *  
	 *  
	 *  
	 */
	
	
	
	
	
}
