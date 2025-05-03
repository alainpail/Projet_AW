package main;

import ressources.Chemins;

public class Convoi extends Unite {
	public Convoi (String name, int prop) {
		super( name, 5000, 6, "Convoi", Chemins.FICHIER_GENIE, prop,"chenille");
	}
}
