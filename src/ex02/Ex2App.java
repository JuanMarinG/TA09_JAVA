package ex02;

public class Ex2App {

	public static void main(String[] args) {

		Serie series[] = { 
				new Serie("Plats Bruts", 2, "Comedia", "Oriol"), 
				new Serie("Curro Jiménez", 3, "Aventuras", "Juan"),
				new Serie("Bob el manetes", 4, "Infantil", "Arnau"),
				new Serie("Winx Club", 4, "Ficción", "Ionela"),
				new Serie("Sissi Emperatriz", 2, "Cine histórico", "Joana")
			};

		Videojuego[] videojuegos = { 
				new Videojuego("Smite", 1000),
				new Videojuego("PayDay 2", 300),
				new Videojuego("Krunker", 450), 
				new Videojuego("Minecraft", 1500, "Sandbox", "Mojang"), 
				new Videojuego("Counter-Strike: Global Offensive", 789, "FPS", "Valve") 
			};

		series[0].entregar();
		series[1].entregar();
		videojuegos[0].entregar();
		videojuegos[1].entregar();

		int jocsEntr = 0;
		int seriesEntr = 0;
				
		Videojuego maxHoras = null;
		Serie maxTemp = null;
		
		for (Videojuego v : videojuegos) {
			if(v.isEntregado()) jocsEntr++;
			
			if(maxHoras == null) maxHoras = v;
			
			if(v.getHoras() > maxHores.getHoras()) maxHores = v;
		}
				
		for (Serie s : series) {
			if(s.isEntregado()) seriesEntr++;
			
			if(maxTemp == null) maxTemp = s;
			
			if(s.getTemporadas() > maxTemp.getTemporadas()) maxTemp = s;
		}
		
		System.out.println("Videojuego con más horas jugadas:\n"+maxHoras.toString());		
		System.out.println("Serie con más temporadas:\n"+maxTemp.toString());
	}

}
