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
	
	public Electrodomestico(double precioBase, Color color, Consumo consumoEnergetico, double peso) {
		super();
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}
	
	public double getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public Consumo getConsumoEnergetico() {
		return consumoEnergetico;
	}
	public void setConsumoEnergetico(Consumo consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}



	public double precioFinal(){
		double plus=0;
		switch(consumoEnergetico.toString()){
		case "A":
			plus+=100;
			break;
		case "B":
			plus+=80;
			break;
		case "C":
			plus+=60;
			break;
		case "D":
			plus+=40;
			break;
		case "E":
			plus+=20;
			break;
		case "F":
			plus+=10;
			break;
	}
		
	
		if(peso<=0 && peso<19) {
			plus+=10;}
		if(peso<=20 && peso<49) {
			plus+=50;}
		if(peso<=50 && peso<79) {
			plus+=80;}
		if( peso<80) {
			plus+=100;}
		
		return precioBase+plus;
	
	}
}



