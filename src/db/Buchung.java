package db;

import java.util.Date;




public class Buchung {

	private int buchungsID;
	private Transferrichtung transferR = new Transferrichtung();
	private String verwendungszweck;
	private double betrag;
	private Date buchungsDatum = new Date();
	private Date erstellungsDatum = new Date();
	private Date aenderungsDatum = new Date();
	private Konto konto = new Konto();
	private Kategorie kategorie = new Kategorie();
	private Status status = new Status();
	private Turnus turnus = new Turnus();
	
	public Buchung(double betrag){
		super();
		this.betrag = betrag;
	}
	public Buchung(int buchungsID, int transferR, String verwendungszweck, double betrag, Date buchungsDatum,
			Date erstellungsDatum, Date aenderungsDatum, int konto, int kategorie, int status, int turnus) {
		super();
		this.buchungsID = buchungsID;
		this.transferR.setTransID(transferR);
		this.verwendungszweck = verwendungszweck;
		this.betrag = betrag;
		this.buchungsDatum = buchungsDatum;
		this.erstellungsDatum = erstellungsDatum;
		this.aenderungsDatum = erstellungsDatum;
		this.konto.setKontoID(konto);
		this.kategorie.setKatID(kategorie);;
		this.status.setStatusID(status);
		this.turnus.setTurnusID(turnus);
	}

	public int getBuchungsID() {
		return buchungsID;
	}

	public void setBuchungsID(int buchungsID) {
		this.buchungsID = buchungsID;
	}

	public Transferrichtung getTransferR() {
		return transferR;
	}

	public void setTransferR(Transferrichtung transferR) {
		this.transferR = transferR;
	}

	public String getVerwendungszweck() {
		return verwendungszweck;
	}

	public void setVerwendungszweck(String verwendungszweck) {
		this.verwendungszweck = verwendungszweck;
	}

	public double getBetrag() {
		return betrag;
	}

	public void setBetrag(double betrag) {
		this.betrag = betrag;
	}

	public Date getBuchungsDatum() {
		return buchungsDatum;
	}

	public void setBuchungsDatum(Date buchungsDatum) {
		this.buchungsDatum = buchungsDatum;
	}

	public Date getErstellungsDatum() {
		return erstellungsDatum;
	}

	public void setErstellungsDatum(Date erstellungsDatum) {
		this.erstellungsDatum = erstellungsDatum;
	}

	public Date getAenderungsDatum() {
		return aenderungsDatum;
	}

	public void setAenderungsDatum(Date aenderungsDatum) {
		this.aenderungsDatum = aenderungsDatum;
	}

	public Konto getKonto() {
		return konto;
	}

	public void setKonto(Konto konto) {
		this.konto = konto;
	}

	public Kategorie getKategorie() {
		return kategorie;
	}

	public void setKategorie(Kategorie kategorie) {
		this.kategorie = kategorie;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Turnus getTurnus() {
		return turnus;
	}

	public void setTurnus(Turnus turnus) {
		this.turnus = turnus;
	}

	public void changeBuchung() {
		// TODO eine Buchung ändern
	}

	public void deleteBuchung() {
		// TODO eine Buchung löschen
	}
}
