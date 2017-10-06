package db;

public class Turnus {

	private int turnusID;
	private String turnusBez;
	
	// Konstruktor
	public Turnus(){
		
	}
		
	public void setTurnusID(int turnusID) {
		this.turnusID = turnusID;
	}

	public void setTurnusBez(String turnusBez) {
		this.turnusBez = turnusBez;
	}

	public int getTurnusID() {
		return turnusID;
	}
	
	public String getTurnusBez() {
		return turnusBez;
	}
	
}
