package com.packt.pfextensions.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Employer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String orgname;
	private String branch;
	private String establishedyear;
	private String noofemployees;
	private boolean editable;
	public List<EmployerDetails> employerDetails = new ArrayList<EmployerDetails>();

	
	public Employer() {
		super();
	}
	public Employer(String orgname, String branch, String establishedyear,
			String noofemployees,List<EmployerDetails> employerDetails) {
		super();
		this.orgname = orgname;
		this.branch = branch;
		this.establishedyear = establishedyear;
		this.noofemployees = noofemployees;
		this.employerDetails=employerDetails;
	}
	public String getOrgname() {
		return orgname;
	}
	public void setOrgname(String orgname) {
		this.orgname = orgname;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getEstablishedyear() {
		return establishedyear;
	}
	public void setEstablishedyear(String establishedyear) {
		this.establishedyear = establishedyear;
	}
	public String getNoofemployees() {
		return noofemployees;
	}
	public void setNoofemployees(String noofemployees) {
		this.noofemployees = noofemployees;
	}
	public List<EmployerDetails> getEmployerDetails() {
		return employerDetails;
	}
	public void setEmployerDetails(List<EmployerDetails> employerDetails) {
		this.employerDetails = employerDetails;
	}
	public boolean getEditable() {
		return editable;
	}
	public void setEditable(boolean editable) {
		this.editable = editable;
	}
	
	

}
