package com.blo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.VilleDao;
import com.dto.VilleFrance;

@Service
public class VilleBloImpl implements VilleBlo {

	@Autowired
	private VilleDao villeDao;

	@Override
	public ArrayList<VilleFrance> getInfoVille(String codePostal, String nom) {
		ArrayList<VilleFrance> listeVille = null;

		if (codePostal == null && nom == null) {
			listeVille = villeDao.listeVilles();
		}
		else if(nom != null) {
			listeVille = villeDao.getVilleNom(nom);
		}
		else {
			listeVille = villeDao.getVilleCodePostal(codePostal);
		}
		return listeVille;
	}

	@Override
	public String getVilles() {
		String chaine = "";
		for (VilleFrance ville : villeDao.listeVilles()) {
			chaine += "<p> " + ville.toString() + " </p>";
		}
		return chaine;
	}

}
