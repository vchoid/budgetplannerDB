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
			
			
// TODO ############################################### in  Klasse Buchung ##########################################################
			String sqlSelect = "select * from buchung";
			ResultSet res = db.createDerbyStatement().executeQuery(sqlSelect);

// ließt alles was in der Tablle Konto i n der Spalte Kontoid drin ist aus
			
				List<Buchung> buchungen = new ArrayList<>();
				while (res.next()) {
					buchungen.add(new Buchung(res.getInt(1), res.getInt(2), res.getString(3), res.getDouble(4), res.getDate(5),
							res.getDate(6), res.getDate(7), res.getInt(8), res.getInt(9), res.getInt(10), res.getInt(11)));
				}
//#################################################################################################################################				
				//TODO statisch --------------------
				Buchung a = buchungen.get(5);
				System.out.println("Die Buchung '" + a.getVerwendungszweck() + "'(ID: " + a.getBuchungsID()+ ")\nim Wert von " + a.getBetrag() + " Euro\nwurde am " + a.getErstellungsDatum() + " angelegt.");
				// --------------------------------
				
				db.createDerbyStatement().close();
		
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
