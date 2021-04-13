package com.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.blo.VilleBlo;
import com.dto.VilleFrance;

@RestController
public class VilleController {

	@Autowired
	VilleBlo villeBlo;

	// Méthode GET
	@RequestMapping(value = "/ville", method = RequestMethod.GET)
	@ResponseBody
	public ArrayList<VilleFrance> appelGet(@RequestParam(required = false, value = "codePostal") String codePostal,
			@RequestParam(required = false, value = "nom") String nom) {
		System.out.println("Appel GET");
		System.out.println("Code postal : " + codePostal);
		System.out.println("Nom : " + nom);

		return villeBlo.getInfoVille(codePostal, nom);
	}
}
