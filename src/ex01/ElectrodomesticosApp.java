package ex01;
public class ElectrodomesticosApp {

	public static void main(String[] args) {
		   

        double totalElectrodomesticos=0;
        double totalTelevisiones=0;
        double totalLavadoras=0;
		
      
        Electrodomestico listado[]=new Electrodomestico[10];
        listado[0]=new Television(130, 12, 30, false, Color.NEGRO, Consumo.A);
        listado[1]=new Television(190, 15, 40, true, Color.NEGRO, Consumo.A);
        listado[2]=new Television(130, 18, 60, false, Color.GRIS, Consumo.B);
        listado[3]=new Electrodomestico(400, Color.BLANCO, Consumo.F, 80);
        listado[4]=new Lavadora(250, Color.AZUL, Consumo.C, 90, 20);
        listado[5]=new Lavadora(239, Color.ROJO, Consumo.E, 89, 40);
        listado[6]=new Television(120, 20, 77, true, Color.BLANCO, Consumo.A);
        listado[7]=new Lavadora(200, Color.NEGRO, Consumo.F, 20, 50);
        listado[8]=new Television(99, 20, 20, false, Color.GRIS, Consumo.B);
        listado[9]=new Electrodomestico(300, Color.NEGRO, Consumo.F, 90);
   
        for(int i=0;i<listado.length;i++){
   
            if(listado[i] instanceof Electrodomestico){
                totalElectrodomesticos+=listado[i].precioFinal();
            }
            if(listado[i] instanceof Lavadora){
                totalLavadoras+=listado[i].precioFinal();
            }
            if(listado[i] instanceof Television){
                totalTelevisiones+=listado[i].precioFinal(); 
            }  
        }
        System.out.println("Total del precio de los electrodomesticos: "+totalElectrodomesticos);
        System.out.println("Total del precio de las lavadoras: "+totalLavadoras);
        System.out.println("Total del precio de las televisiones: "+totalTelevisiones);
    }
}
