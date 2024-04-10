package model;

public class ReservationRestaurant extends Reservation{
	private int service;
	private int table;
	
	public ReservationRestaurant(int jour, int mois, int numService, int numTable) {
		super(jour,mois);
		service = numService;
		table = numTable;
	}
	
	public String toString() {
		String serv;
		if(service == 1)serv = "premier";
		else serv = "deuxième";
		return super.toString()+"Table "+table+" pour le "+serv+" service.";
	}
}
