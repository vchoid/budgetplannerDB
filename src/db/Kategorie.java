package db;

public class Kategorie {

	private int katID;
	private String katBez;
	
	public Kategorie(){
		
	}

	public void setKatID(int katID) {
		this.katID = katID;
	}

	public void setKatBez(String katBez) {
		this.katBez = katBez;
	}

	public void deleteKategorie(){
		//TODO soll eine Kategorie aus der DB löschen
	}
	
	public void setNewKategorie(){
		//TODO legt eine neue Kategorie an
	}
	
	public int getKatID() {
		return katID;
	}

	public String getKatBez() {
		return katBez;
	}

	
	
	
}
