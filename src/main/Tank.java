package main;

import ressources.Chemins;

public class Tank extends Unite {
	public Tank (String name, int prop) {
		super( name, 7000, 6, "tank", Chemins.FICHIER_TANK, prop,"chenille");
	}

}
