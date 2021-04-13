package com.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCconfig {

	private Connection connexion;

	public JDBCconfig() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			this.connexion = DriverManager.getConnection("jdbc:mysql://localhost/maven", "root", "");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Connection getConnexion() {
		return connexion;
	}

	public void setConnexion(Connection connexion) {
		this.connexion = connexion;
	}
	

}
