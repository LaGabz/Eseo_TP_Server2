package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.config.JDBCconfig;
import com.dto.VilleFrance;

@Service
public class VilleDaoImpl implements VilleDao {
	
	public ArrayList<VilleFrance> listeVilles() {
		ArrayList<VilleFrance> villes = new ArrayList<VilleFrance>();
		Connection connexion = new JDBCconfig().getConnexion();

		try {
			Statement statement = connexion.createStatement();
			ResultSet resultat = statement.executeQuery("SELECT * FROM ville_france;");

			while (resultat.next()) {
				VilleFrance ville = new VilleFrance();
				ville.setNom(resultat.getString("Nom_commune"));
				ville.setInsee(resultat.getString("Code_commune_INSEE"));
				ville.setCode_p(resultat.getString("Code_Postal"));
				ville.setLatitude(resultat.getString("Latitude"));
				ville.setLongitude(resultat.getString("Longitude"));

				villes.add(ville);
			}
			return villes;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connexion.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	public ArrayList<VilleFrance> getVilleNom(String nom) {
		ArrayList<VilleFrance> villes = new ArrayList<VilleFrance>();
		Connection connexion = null;
		Statement statement = null;
		ResultSet resultat = null;

		try {
			connexion = new JDBCconfig().getConnexion();
			statement = connexion.createStatement();
			resultat = statement.executeQuery("SELECT * FROM ville_france WHERE Nom_commune LIKE '%" + nom + "%';");

			while (resultat.next()) {
				VilleFrance ville = new VilleFrance();
				ville.setNom(resultat.getString("Nom_commune"));
				ville.setInsee(resultat.getString("Code_commune_INSEE"));
				ville.setCode_p(resultat.getString("Code_Postal"));
				ville.setLatitude(resultat.getString("Latitude"));
				ville.setLongitude(resultat.getString("Longitude"));

				villes.add(ville);
			}
			return villes;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connexion.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	public ArrayList<VilleFrance> getVilleCodePostal(String codePostal) {
		ArrayList<VilleFrance> villes = new ArrayList<VilleFrance>();
		Connection connexion = null;
		Statement statement = null;
		ResultSet resultat = null;

		try {
			connexion = new JDBCconfig().getConnexion();
			statement = connexion.createStatement();
			resultat = statement.executeQuery("SELECT * FROM ville_france WHERE Code_postal = " + codePostal + ";");

			while (resultat.next()) {
				VilleFrance ville = new VilleFrance();
				ville.setNom(resultat.getString("Nom_commune"));
				ville.setInsee(resultat.getString("Code_commune_INSEE"));
				ville.setCode_p(resultat.getString("Code_Postal"));
				ville.setLatitude(resultat.getString("Latitude"));
				ville.setLongitude(resultat.getString("Longitude"));

				villes.add(ville);
			}
			return villes;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connexion.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

}
