package model;

public abstract class EntiteReservable <F extends Formulaire> {
	private CalendrierAnnuel calendrier;
	private int id;
	
	public EntiteReservable( ) {
		this.calendrier = new CalendrierAnnuel();
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
	
	public boolean estLibre(F formulaire) {
		return calendrier.estLibre(formulaire.getJour(),formulaire.getMois());
	}
	
	public abstract boolean compatible(F formulaire);
	
	public abstract Reservation reserver(F formulaire);
	 
}
