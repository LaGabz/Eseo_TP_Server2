package com.dao;

import java.util.ArrayList;

import com.dto.VilleFrance;

public interface VilleDao {

	ArrayList<VilleFrance> findAllVilles();

	ArrayList<VilleFrance> getVilleByCodePostal(String code);
}
