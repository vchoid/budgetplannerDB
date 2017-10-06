package db;

import java.util.Date;




public class Buchung {

	private int buchungsID;
	private Transferrichtung transferR = new Transferrichtung();
	private String verwendungszweck;
	private double betrag;
	private Date buchungsDatum = new Date();
	private Date erfassungsDatum = new Date();
	private Konto konto = new Konto();
	private Kategorie kategorie = new Kategorie();
	private Status status = new Status();
	private Turnus turnus = new Turnus();
	

	public Buchung(int buchungsID, int transferR, String verwendungszweck, double betrag, Date buchungsDatum,
			Date erfassungsDatum, int konto, int kategorie, int status, int turnus) {
		super();
		this.buchungsID = buchungsID;
		this.transferR.setTransID(transferR);
		this.verwendungszweck = verwendungszweck;
		this.betrag = betrag;
		this.buchungsDatum = buchungsDatum;
		this.erfassungsDatum = erfassungsDatum;
		this.konto.setKontoID(konto);
		this.kategorie.setKatID(kategorie);;
		this.status.setStatusID(status);
		this.turnus.setTurnusID(turnus);
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

	
	public Transferrichtung getTransferR() {
		return transferR;
	}

	public void setTransferR(Transferrichtung transferR) {
		this.transferR = transferR;
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

	public void setBuchungsID(int buchungsID) {
		this.buchungsID = buchungsID;
	}

	public void setErfassungsDatum(Date erfassungsDatum) {
		this.erfassungsDatum = erfassungsDatum;
	}

	public int getBuchungsID() {
		return buchungsID;
	}

	public Date getErfassungsDatum() {
		return erfassungsDatum;
	}

	public void changeBuchung() {
		// TODO eine Buchung ändern
	}

	public void deleteBuchung() {
		// TODO eine Buchung löschen
	}
}
