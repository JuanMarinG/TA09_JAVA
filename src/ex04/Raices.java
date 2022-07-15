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
		return ((double)(b*b)-4*a*c);
	}
	
	public boolean tieneRaices() {
		return getDiscriminate()>0;
	}
	
	public boolean tieneRaiz() {
		return getDiscriminate()==0;
	}

	public void calcular() {
		if(tieneRaices()) {
			obtenerRaices();
		}else if(tieneRaiz()) {
			obtenerRaiz();
		}else {
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
