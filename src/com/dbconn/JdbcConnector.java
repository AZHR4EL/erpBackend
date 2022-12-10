package com.dbcomm;
import java.sql.*;
import java.util.Properties;

public class JdbcConnector {
	
	String dbPass = "4LQP6&$668N64NPr";
	String dbUser = "erpAdmin";
	String dbHost = "jdbc:mysql://localhost/";
	Connection dbConn = null;
	
	public JdbcConnector() throws SQLException {
		Properties connectionProps = new Properties();
	    connectionProps.put("user", this.dbUser);
	    connectionProps.put("password", this.dbPass);
	    
	    dbConn = DriverManager.getConnection(dbHost, connectionProps);
	    
	    System.out.println("Connected to database");
	} 	
}
