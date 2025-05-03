package main;

public abstract class Propriete extends Terrain {
	protected int proprio;
	private int res;
	
	public Propriete(String typeterrain,String nomfichier) {
		super(typeterrain,nomfichier);
		res=20;
	}


	

}
