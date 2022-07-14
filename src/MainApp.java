
public class MainApp {

	public static void main(String[] args) {
		
		Electrodomestico electroU9 = new Electrodomestico();

		Electrodomestico electroU9_2 = new Electrodomestico(80,12);
		
		Electrodomestico electroU9_3 = new Electrodomestico(30,Color.AZUL,Consumo.F,55);
		
		System.out.println(electroU9_3.toString());
		
		double precioFinal = electroU9_3.precioFinal();
		
		System.out.println(precioFinal);
	}

}
