package ex04;

public class Raices {
	private double a,b,c;

	public Raices(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double getDiscriminate() {
		return (double)(b*b-4*a*c);
	}
	
	public boolean tieneRaices() {
		if(getDiscriminate() > 0)
			return true;
		else
			return false;
	}
	
	public boolean tieneRaiz() {
		if(getDiscriminate() == 0)
			return true;
		else
			return false;
	}
	
	public void calcular() {
		if(tieneRaices()) {
			System.out.println("Tiene dos soluciones:");
			obtenerRaices();
		} else if(tieneRaiz()) {
			System.out.println("Tiene una solución:");
			obtenerRaiz();
		} else {
			System.out.println("No tiene solución real");
		}
	}
	
	public void obtenerRaices() {
		double d = getDiscriminate();
		System.out.println((double)(-b + Math.sqrt(d)) / (2 * a) + "\n"+ (double)(-b - Math.sqrt(d)) / (2 * a)); 
	}
	
	public void obtenerRaiz() {
		System.out.println(-(double)b / (2 * a));  
	}

}
