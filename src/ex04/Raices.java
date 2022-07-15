package ex04;

public class Raices {
	private double a,b,c; //declaracion de los 3 coeficientes

	public Raices(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	//extraemos el valor del discriminante segun la formula 
	public double getDiscriminate() {
		return ((double)(b*b)-4*a*c);
	}
	
	//si el discriminante optenido es mayor que 0 implica que habra dos soluciones posibles
	public boolean tieneRaices() {
		return getDiscriminate()>0;
	}
	
	//si discriminante equivale a 0 implica que solo hay 1 solucion
	public boolean tieneRaiz() {
		return getDiscriminate()==0;
	}

	/**	muestra las soluciones a los calculos diferenciando si tiene 2, 1 o ninguna solucion. 
		Llamando en los 2 primeros casos a los metodos tieneRaices o tieneRaiz para saber que 
		metodo de calculo (obtenerXXX()) ha de llamar.
	**/
	public void calcular() {
		if(tieneRaices()) {
			obtenerRaices();
		}else if(tieneRaiz()) {
			obtenerRaiz();
		}else {
			System.out.println("No tiene soluci�n real");
		}
	}
	
	//obtiene las raices posibles aplicando la formula
	public void obtenerRaices() {
		double d = getDiscriminate();
		System.out.println((double)(-b + Math.sqrt(d)) / (2 * a) + "\n"+ (double)(-b - Math.sqrt(d)) / (2 * a)); 
	}
	
	//obtiene la raiz posible aplicando la formula
	public void obtenerRaiz() {
		System.out.println(-(double)b / (2 * a));
	}

}