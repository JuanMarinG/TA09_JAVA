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
		// joana
	}
	
	public boolean tieneRaices() {
		return getDiscriminante()>0;
	}
	
	public boolean tieneRaiz() {
		return getDiscriminante()==0;
	}

	public void calcular() {
		// joana
	}
	
	public void obtenerRaices() {
		double d = getDiscriminate();
		System.out.println((double)(-b + Math.sqrt(d)) / (2 * a) + "\n"+ (double)(-b - Math.sqrt(d)) / (2 * a)); 
	}
	
	public void obtenerRaiz() {
		System.out.println(-(double)b / (2 * a));
	}

}
