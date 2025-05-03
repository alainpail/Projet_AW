package main;
import ressources.Chemins;

public abstract class Terrain {
	private String type;
	private String chemin;
	
	public String getChemin() {
		return chemin;
	}

	public Terrain(String typeTerrain,String nomFichier) {
		type=typeTerrain;
		chemin=Chemins.getCheminTerrain(nomFichier);
	}
}
