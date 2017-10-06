package db;

public class Konto {

	private int kontoID;
	private double kontoStand;
	private double dispo;
	private String kontoName;
	
	
	public double getKontoStand() {
		return kontoStand;
	}
	public void setKontoStand(double kontoStand) {
		this.kontoStand = kontoStand;
	}
	public double getDispo() {
		return dispo;
	}
	public void setDispo(double dispo) {
		this.dispo = dispo;
	}
	public String getKontoName() {
		return kontoName;
	}
	public void setKontoID(int kontoID) {
		this.kontoID = kontoID;
	}
	public void setKontoName(String kontoName) {
		this.kontoName = kontoName;
	}
	public int getKontoID() {
		return kontoID;
	}
	
	public void deleteKonto(){
		//TODO ein Konto löschen
	}
	
	
}
