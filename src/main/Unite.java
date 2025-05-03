package main;
import ressources.Chemins;

public abstract class Unite {
	private double pointDeVie;
	private String nom;
	private int prix;
	private int pointDeMouvement;
	private String typeunite;
	private String chemin;
	private int proprio;
	private Deplacement typeDeDeplacement;
	
	public Unite(String name,int p,int pm,String typ,String chem,int prop,String deplacement) {
		pointDeVie=10;
		nom=name;
		prix=p;
		pointDeMouvement=pm;
		typeunite=typ;
		chemin=chem;
		proprio=prop;
		if(deplacement.equals("pied")) {
			typeDeDeplacement=new Pied();
		}else if(deplacement.equals("chenille")) {
			typeDeDeplacement=new Chenille();
		}else if(deplacement.equals("aerien")) {
			typeDeDeplacement=new Aerien();
		}
		
	}

}
