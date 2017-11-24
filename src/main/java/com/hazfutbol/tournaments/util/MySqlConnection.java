package com.hazfutbol.tournaments.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySqlConnection {
	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//h4z2016 hazfutbol_production
			connection = DriverManager.getConnection("jdbc:mysql://localhost/hazfutbol_local", "root",
					"");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
}
