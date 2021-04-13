package com.dao;

import java.util.ArrayList;

import com.dto.VilleFrance;

public interface VilleDao {

	ArrayList<VilleFrance> listeVilles();
	
	ArrayList<VilleFrance> getVilleNom(String nom);

	ArrayList<VilleFrance> getVilleCodePostal(String codePostal);
}
