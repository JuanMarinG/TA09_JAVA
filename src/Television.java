public class Television extends Electrodomestico {

	private double resolucion;
	private boolean sintonizador;
	
	private double RES_DEFECTO = 20.0;
	private boolean  SIN_DEFECTO = false;

	public Television() {
		defecto();
	}

	public Television(double precioBase, double peso) {
		super(precioBase, peso);
		defecto();
	}

	public Television(double precioBase, double peso, double resolucion, boolean sintonizador, Color color, Consumo consumo) {
		super(precioBase, color, consumo, peso);
		defecto();
	}
	
	private void defecto() {
		this.resolucion = RES_DEFECTO;
		this.sintonizador = SIN_DEFECTO;
	}

	public double getResolucion() {
		return resolucion;
	}

	public boolean isSintonizador() {
		return sintonizador;
	}

	public void setResolucion(double resolucion) {
		this.resolucion = resolucion;
	}

	public void setSintonizador(boolean sintonizador) {
		this.sintonizador = sintonizador;
	}

		
	public double precioFinal() {
		double plus=0;
		
		if (resolucion > 40) {
			plus += precioBase * 0.3;
		}
		if (sintonizador) {
			plus += 50;
		}
		
		return super.precioFinal() + plus;
	}	

}