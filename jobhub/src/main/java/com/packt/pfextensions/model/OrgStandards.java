package com.packt.pfextensions.model;

import java.io.Serializable;

public class OrgStandards implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int years;
	private String employees;
	private String revenue;
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years = years;
	}
	public String getEmployees() {
		return employees;
	}
	public void setEmployees(String employees) {
		this.employees = employees;
	}
	public String getRevenue() {
		return revenue;
	}
	public void setRevenue(String revenue) {
		this.revenue = revenue;
	}
	
	

}
