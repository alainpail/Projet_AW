package main;

import ressources.Chemins;

public class Helicoptere extends Unite {
	public Helicoptere (String name, int prop) {
		super( name, 12000, 6, "Hélicoptere", Chemins.FICHIER_HELICOPTERE, prop,"aerien");
	}
}
