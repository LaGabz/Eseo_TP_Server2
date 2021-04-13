package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.config.JDBCConfig;
import com.dto.VilleFrance;

@Service
public class VilleDaoImpl implements VilleDao {

	public ArrayList<VilleFrance> findAllVilles() {
		ArrayList<VilleFrance> liste = new ArrayList<VilleFrance>();

		Connection con = new JDBCConfig().getCo();
		try {
			Statement st = con.createStatement();
			ResultSet resultat = st.executeQuery("SELECT * FROM ville_france;");
			while (resultat.next()) {
				VilleFrance ville = new VilleFrance(resultat.getString(1), resultat.getString(2), resultat.getString(3),
						resultat.getString(4), resultat.getString(6), resultat.getString(7));
				liste.add(ville);
			}
			return liste;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	public ArrayList<VilleFrance> getVilleByCodePostal(String code) {
		ArrayList<VilleFrance> liste = new ArrayList<VilleFrance>();
		Connection con = new JDBCConfig().getCo();

		try {
			Statement st = con.createStatement();
			ResultSet resultat = st.executeQuery("SELECT * FROM ville_france WHERE Code_postal='" + code + "';");
			while (resultat.next()) {
				VilleFrance ville = new VilleFrance(resultat.getString(1), resultat.getString(2), resultat.getString(3),
						resultat.getString(4), resultat.getString(6), resultat.getString(7));
				liste.add(ville);
			}
			return liste;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

}
