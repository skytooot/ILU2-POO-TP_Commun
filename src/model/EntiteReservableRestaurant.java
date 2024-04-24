package model;

public class EntiteReservableRestaurant<F extends FormulaireRestaurant> extends EntiteReservable {
	private int nbChaises;
	
	
	public EntiteReservableRestaurant(int nbChaises) {
		this.nbChaises = nbChaises;
	}
	
	public boolean compatible(F formulaire) {
		return this.nbChaises >=formulaire.getNombrePersonnes();
	}
	
	public Reservation reserver(F formulaire) {
		ReservationRestaurant reservation = new ReservationRestaurant(formulaire.getJour(),
				formulaire.getMois(),formulaire.getNombrePersonnes(),formulaire.getNumService());
		this.nbChaises -= formulaire.getNombrePersonnes();
		return reservation;
	}
}
