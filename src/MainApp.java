
public class MainApp {

	public static void main(String[] args) {
		
		Electrodomestico electroU9 = new Electrodomestico();

		Electrodomestico electroU9_2 = new Electrodomestico(80,12);
		
		Electrodomestico electroU9_3 = new Electrodomestico(30,Color.AZUL,Consumo.F,55);
		
		System.out.println(electroU9_3.toString());
		
		double precioFinal = electroU9_3.precioFinal();
		
		System.out.println("electro3 precio final "+precioFinal);
		
		Lavadora lava1 = new Lavadora();
		Lavadora lava2 = new Lavadora(560,120);
		
		Lavadora lava3 = new Lavadora(430,Color.GRIS,Consumo.D,135,50);
		
		System.out.println(lava2.getColor());
		System.out.println(lava2.getConsumoEnergetico());
		System.out.println(lava2.getCarga());
		
		System.out.println("precio final lava3 "+lava3.precioFinal());
	}

}
