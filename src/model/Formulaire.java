package model;

public abstract class Formulaire {
	private int jour;
	private int mois;
	private int numEntite;
	
	public Formulaire(int jour, int mois) {
		this.jour = jour;
		this.mois = mois;
		this.numEntite = 0;
	}
	
	public void setIdentificationEntite(int numEntite) {
		this.numEntite = numEntite;
	}
	
	public int getJour() {
		return this.jour;
	}
	
	public int getMois() {
		return this.mois;
	}
	
	public int getIdentificationEntite() {
		return this.numEntite;
	}
}
