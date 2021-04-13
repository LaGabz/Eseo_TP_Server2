package com.blo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.VilleDao;
import com.dto.VilleFrance;

@Service
public class VilleBloImpl implements VilleBlo {

	@Autowired
	private VilleDao villeDAO;

	public ArrayList<VilleFrance> getInfoVille(String monParam) {
		ArrayList<VilleFrance> listeVille = null;

		if (monParam == null) {
			listeVille = villeDAO.findAllVilles();
		} else {
			listeVille = villeDAO.getVilleByCodePostal(monParam);
		}
		return listeVille;
	}

}
