package com.packt.pfextensions.model;

import java.io.Serializable;

public class Employer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String orgname;
	private String branch;
	private String establishedyear;
	private String noofemployees;
	public Employer(String orgname, String branch, String establishedyear,
			String noofemployees) {
		super();
		this.orgname = orgname;
		this.branch = branch;
		this.establishedyear = establishedyear;
		this.noofemployees = noofemployees;
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
	
	

}
