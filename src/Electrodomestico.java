public class Electrodomestico {

	
	protected double precioBase;
	protected Color color;
	protected Consumo consumoEnergetico;
	protected double peso;
	
	private final Color COLOR_DEFECTO = Color.BLANCO;
	private final double PRECIO_BASE_DEFECTO = 100;
	private final Consumo CONSUMO_DEFECTO = Consumo.F;
	private final double PESO_DEFECTO = 5;
	
	public Electrodomestico() {
		this.precioBase = PRECIO_BASE_DEFECTO;
		this.color = COLOR_DEFECTO;
		this.consumoEnergetico = CONSUMO_DEFECTO;
		this.peso = PESO_DEFECTO;
	}
	
	public Electrodomestico(double precio,double peso) { 
		this.precioBase = precio;
		this.color = COLOR_DEFECTO;
		this.consumoEnergetico = CONSUMO_DEFECTO;
		this.peso = peso;
	}
	
	public Electrodomestico(double precioBase, Color color, Consumo consumoEnergetico, double peso) {		
		this.precioBase = precioBase;
		comprobarColor(color);
		comprobarConsumoEnergetico(consumoEnergetico);
		this.peso = peso;
	}
	
	public double getPrecioBase() {
		return precioBase;
	}	
	public Color getColor() {
		return color;
	}	
	public Consumo getConsumoEnergetico() {
		return consumoEnergetico;
	}	
	public double getPeso() {
		return peso;
	}	
	
	private void comprobarConsumoEnergetico(Consumo letra) {
		boolean correct = false;
		for(Consumo con : Consumo.values()) {
            if(con == letra) {
            	this.consumoEnergetico = con;
            	correct = true;
            }
        }		
		if(!correct) {			
        	this.consumoEnergetico = CONSUMO_DEFECTO;
        }
	}
	
	private void comprobarColor(Color color) {
		boolean correct = false;
		for(Color c: Color.values()) {
			if(c == color){
				this.color = c;
				correct = true;
			}
		}
		if(!correct) {
			this.color = COLOR_DEFECTO;
		}		
	}
	
	@Override
	public String toString() {	
		return "\nDatos del electrodomestico\n "
				+"\n Precio "+this.precioBase
				+"\n Color: "+this.color
				+"\n Consumo energetico: "+this.consumoEnergetico
				+"\n Peso: "+this.peso
				+"\n";		
	}	
	
	
}
