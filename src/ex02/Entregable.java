package ex02;

public interface Entregable {
	
	public void entregar(); // public void entregar() {	this.delivered = true;}
	
	public void devolver(); // public void devolver() {	this.delivered = false;}
	
	public boolean isEntregado(); //public boolean isEntregado(){	return delivered;}
	
	public int compareTo(Object a); 
	/**

		implementacion metodo class videojuego
		public int compareTo(Object v) {
			Videojuego game = (Videojuego)v;
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
