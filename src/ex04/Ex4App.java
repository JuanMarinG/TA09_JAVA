package ex04;

public class Ex4App {

	public static void main(String[] args) {
		
		//Creacion de tres objetos tipo Raices
		
		Raices r = new Raices(1,-2,1);
		System.out.println("Disc: "+r.getDiscriminate());
		r.calcular();
		
		System.out.println("\n-------------");
		r = new Raices(2,8,3);
		System.out.println("Disc: "+r.getDiscriminate());
		r.calcular();
		
		System.out.println("\n-------------");
		r = new Raices(-1,-1,-1);
		System.out.println("Disc: "+r.getDiscriminate());
		r.calcular();
	}

}
