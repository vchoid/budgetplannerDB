package testMain;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.Buchung;
import dbConnection.ConnectToBudgetPlanerDB;

public class TestMain{

	public static void main(String[] args) {
		try {
			
			ConnectToBudgetPlanerDB db = new ConnectToBudgetPlanerDB();
						
			// Statement
//			stmt = connect.createStatement();
			// Statement ausführen
			
//			String sqlInsertInto = "INSERT INTO "
//					+ "buchung("
//					+ "transferID,verwendungszweck,betrag,buchungsdatum,kontoID,kategorieID,statusID,turnusID)"
//					+ " VALUES ("
//					+ "1,'Party für morgen',10,'2017-10-05',1001,14,0,0)";
//			stmt.executeUpdate(sqlInsertInto);
			
			
// ließt alles was in der Tablle Konto in der Spalte Kontoid drin ist aus
// TODO ############################################### in  Klasse Buchung ##########################################################
			List<Buchung> buchungen = retrieveAllBuchungen(db);
//#################################################################################################################################				
				//TODO statisch --------------------
				Buchung urlaub = buchungen.get(5);
				System.out.println("Die Buchung '" + urlaub.getVerwendungszweck() + "'(ID: " + urlaub.getBuchungsID()+ ")\nim Wert von " + urlaub.getBetrag() + " Euro\nwurde am " + urlaub.getErstellungsDatum() + " angelegt.");
				// --------------------------------
				List<Buchung> ausgaben = sumAll(db);
				Buchung ausgabe = ausgaben.get(0);
				System.out.println("Summe aller Ausgaben: " + ausgabe.getBetrag() + " EURO");
								
				db.createDerbyStatement().close();
		
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	private static List<Buchung> sumAll(ConnectToBudgetPlanerDB db) throws SQLException{
	String sqlSUM = "SELECT SUM(b.BETRAG) FROM BUCHUNG b JOIN TRANSFERRICHTUNG tr on tr.TRANSFERID=b.TRANSFERID WHERE tr.BEZEICHNUNG='Ausgabe'";	
		ResultSet res = db.createDerbyStatement().executeQuery(sqlSUM);
		
		List<Buchung> buchungen = new ArrayList<>();
		while (res.next()) {
			buchungen.add(new Buchung(res.getInt(1)));
		}
		
		 return buchungen;
	}
	
	
	private static List<Buchung> retrieveAllBuchungen(ConnectToBudgetPlanerDB db) throws SQLException {
		String sqlSelect = "select * from buchung";
		ResultSet res = db.createDerbyStatement().executeQuery(sqlSelect);

		
			List<Buchung> buchungen = new ArrayList<>();
			while (res.next()) {
				buchungen.add(new Buchung(res.getInt(1), res.getInt(2), res.getString(3), res.getDouble(4), res.getDate(5),
						res.getDate(6), res.getDate(7), res.getInt(8), res.getInt(9), res.getInt(10), res.getInt(11)));
			}
		return buchungen;
	}

}
