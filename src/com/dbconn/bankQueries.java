package com.dbcomm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class bankQueries {
	
	public void updateCoffeeSales() throws SQLException {
		
		JdbcConnector jdbcConnector = new JdbcConnector();
		Connection conn = jdbcConnector.dbConn;
		
		String getPaymentQuery = "GET * FROM payments";
		
		try (PreparedStatement updateSales = conn.pre
	         PreparedStatement updateTotal = con.prepareStatement(updateStatement))
	    
	    {
	      con.setAutoCommit(false);
	      for (Map.Entry<String, Integer> e : salesForWeek.entrySet()) {
	        updateSales.setInt(1, e.getValue().intValue());
	        updateSales.setString(2, e.getKey());
	        updateSales.executeUpdate();

	        updateTotal.setInt(1, e.getValue().intValue());
	        updateTotal.setString(2, e.getKey());
	        updateTotal.executeUpdate();
	        con.commit();
	      }
	    } catch (SQLException e) {
	      JDBCTutorialUtilities.printSQLException(e);
	      if (con != null) {
	        try {
	          System.err.print("Transaction is being rolled back");
	          con.rollback();
	        } catch (SQLException excep) {
	          JDBCTutorialUtilities.printSQLException(excep);
	        }
	      }
	    }
		
		
//	    String updateString =
//	      "update COFFEES set SALES = ? where COF_NAME = ?";
//	    String updateStatement =
//	      "update COFFEES set TOTAL = TOTAL + ? where COF_NAME = ?";
//
//	    try (PreparedStatement updateSales = con.prepareStatement(updateString);
//	         PreparedStatement updateTotal = con.prepareStatement(updateStatement))
//	    
//	    {
//	      con.setAutoCommit(false);
//	      for (Map.Entry<String, Integer> e : salesForWeek.entrySet()) {
//	        updateSales.setInt(1, e.getValue().intValue());
//	        updateSales.setString(2, e.getKey());
//	        updateSales.executeUpdate();
//
//	        updateTotal.setInt(1, e.getValue().intValue());
//	        updateTotal.setString(2, e.getKey());
//	        updateTotal.executeUpdate();
//	        con.commit();
//	      }
//	    } catch (SQLException e) {
//	      JDBCTutorialUtilities.printSQLException(e);
//	      if (con != null) {
//	        try {
//	          System.err.print("Transaction is being rolled back");
//	          con.rollback();
//	        } catch (SQLException excep) {
//	          JDBCTutorialUtilities.printSQLException(excep);
//	        }
//	      }
//	    }
//	  }
	
	 

}
