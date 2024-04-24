package model;

public class FormulaireRestaurant extends Formulaire{
	private int nbPersonne;
	private int numService;
	
	public FormulaireRestaurant(int jour, int mois, int nbPersonne, int numService) {
		super(jour,mois);
		this.nbPersonne = nbPersonne;
		this.numService = numService;
	}
	
	
	
	public int getNombrePersonnes(){
		return this.nbPersonne;
	}
	
	public int getNumService() {
		return this.numService;
	}
}
