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

		
		
		// Verbindung zur DB
		Statement stmt = null;
		ResultSet res = null;
	
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
			
			String sqlSelect = "select * from buchung";
			res = db.createDerbyStatement().executeQuery(sqlSelect);

			// ließt alles was in der Tablle Konto in der Spalte Kontoid drin ist aus
			
				List<Buchung> buchungen = new ArrayList<>();
				
				while (res.next()) {
					buchungen.add(new Buchung(res.getInt(1), res.getInt(2), res.getString(3), res.getDouble(4), res.getDate(5),
							res.getDate(6), res.getInt(7), res.getInt(8), res.getInt(9), res.getInt(10)));
				}
				//TODO löschen --------------------
				Buchung a = buchungen.get(5);
				System.out.println(a.getVerwendungszweck());
				
				// --------------------------------
				db.createDerbyStatement().close();
		
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
