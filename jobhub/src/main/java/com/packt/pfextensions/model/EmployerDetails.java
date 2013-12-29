package com.packt.pfextensions.model;

import java.io.Serializable;

public class EmployerDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String city;
	private String noofvacancies;
	private String noofemployees;
	private String noofclients;
	public EmployerDetails(String city, String noofvacancies,
			String noofemployees, String noofclients) {
		super();
		this.city = city;
		this.noofvacancies = noofvacancies;
		this.noofemployees = noofemployees;
		this.noofclients = noofclients;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getNoofvacancies() {
		return noofvacancies;
	}
	public void setNoofvacancies(String noofvacancies) {
		this.noofvacancies = noofvacancies;
	}
	public String getNoofemployees() {
		return noofemployees;
	}
	public void setNoofemployees(String noofemployees) {
		this.noofemployees = noofemployees;
	}
	public String getNoofclients() {
		return noofclients;
	}
	public void setNoofclients(String noofclients) {
		this.noofclients = noofclients;
	}
	
	

}
