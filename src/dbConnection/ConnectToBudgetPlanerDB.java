package dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectToBudgetPlanerDB{
	
	
	
	public ConnectToBudgetPlanerDB(){
		try {
			createDerbyStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private Connection setupDerbyDBConnenction() throws SQLException{
		return DriverManager.getConnection("jdbc:derby://localhost:1527/budgetplanner", "budget", "budget");
	}
	
	public Statement createDerbyStatement() throws SQLException{
		return setupDerbyDBConnenction().createStatement();
	}
//	
//	public void closeConnection() throws SQLException{
//		shutdownDerbyDB();
//		connect.close();
//	}
	
	
	 
	 
	 
}
