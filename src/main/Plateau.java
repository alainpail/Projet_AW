package main;

import librairies.StdDraw;
import ressources.Affichage;

public class Plateau {
	private Case [][] plateau;
	
	public Plateau(String [][] tab) {
		for(int i=0;i<tab.length;i++) {
			for(int j=0;j<tab[i].length;j++) {
				plateau[i][j]=new Case(tab[i][j]);
			}
		}
	}
	public void affichePlateau() {
		for(int i=0;i<plateau.length;i++) {
			for(int j=0;j<plateau[i].length;j++) {
				Affichage.dessineImageDansCase(i, i, plateau[i][j].type.getChemin());
			}
		}
	}
	
}
