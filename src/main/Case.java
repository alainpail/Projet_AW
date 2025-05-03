package main;

public class Case {
	public Terrain type;
	public Unite Unite;
	public Case(String tab) {
		String[]terrainUnit=tab.split(";");
		String [] terrain=terrainUnit[0].split(":");
		if(terrain[0].equals("Foret")) {
			type=new Foret();
		}else if(terrain[0].equals("Plaine")) {
			type=new Plaine();
		}else if(terrain[0].equals("Montagne")) {
			
		}else if(terrain[0].equals("Eau")) {
			type=new Eau();
		}else if(terrain[0].equals("Usine")) {
			type=new Usine(Integer.parseInt(terrain[1]));
		}else if(terrain[0].equals("QG")) {
			type=new QG(Integer.parseInt(terrain[1]));
		}else if(terrain[0].equals("Ville")) {
			type=new Ville(Integer.parseInt(terrain[1]));
		}
		String[]unite=terrainUnit[1].split(":");
		if(unite[0].equals("Infanterie")) {
			
		}else if(unite[0].equals("Tank")) {

		}else if(unite[0].equals("DCA")) {
			
		}else if(unite[0].equals("Convoi")) {

		}else if(unite[0].equals("Bazooka")) {
			Unite=new Bombardier("",Integer.parseInt(unite[1]));
		}else if(unite[0].equals("Bombardier")) {
			Unite=new Bombardier("Bombard",Integer.parseInt(unite[1]));
		}else if(unite[0].equals("Helico")) {
			Unite=new Helicoptere("Helico",Integer.parseInt(unite[1]));
		}
	}
}
