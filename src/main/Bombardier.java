package main;


import ressources.Chemins;

public class Bombardier extends Unite {
	public Bombardier (String name, int prop) {
		super( name, 20000, 6, "Bombardier", Chemins.FICHIER_BOMBARDIER, prop,"aerien");
	}

}
