public class Lavadora extends Electrodomestico{
	
	private final int CARGA_DEFECTO = 5;
	
	private int carga;
	
	public Lavadora() {
		super();
		this.carga = CARGA_DEFECTO;
	}
	
	public Lavadora(double precio,double peso){
		super(precio,peso);
		this.carga = CARGA_DEFECTO;
	}
	
	public Lavadora(double precio,Color color,Consumo consumo,double peso,int carga) {
		super(precio,color,consumo,peso);
		this.carga = carga;
	}

	public int getCarga() {
		return carga;
	}

	@Override
	public double precioFinal() {
		double plus = super.precioFinal();
		if(this.carga>30) {
			plus += 50;
		}
		
		return plus;
	}
	
	
	
}
