package com.blo;

import java.util.ArrayList;

import com.dto.VilleFrance;

public interface VilleBlo {

	ArrayList<VilleFrance> getInfoVille(String codePostal, String nom);

	String getVilles();
}
