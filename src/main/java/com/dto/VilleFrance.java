package com.dto;

public class VilleFrance {
	private String insee;
	private String nom;
	private String code_p;
	private String latitude;
	private String longitude;
	
	
	public VilleFrance(String insee, String nom, String code_p, String latitude,
			String longitude) {
		this.insee = insee;
		this.nom = nom;
		this.code_p = code_p;
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public VilleFrance() {
	}

	public String getInsee() {
		return insee;
	}
	public void setInsee(String insee) {
		this.insee = insee;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCode_p() {
		return code_p;
	}
	public void setCode_p(String code_p) {
		this.code_p = code_p;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	
	public String toString() {
		return "Ville de "+ this.getNom() + ", Code INSEE : " + this.getInsee() 
		+ ", Code Postal : " + this.getCode_p() + ", Latitude : " +this.getLatitude() 
		+ ", Longitude : " + this.getLongitude() + ".";
	}

}
