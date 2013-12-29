package com.packt.pfextensions.model;

import java.io.Serializable;

public class Jobhub implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String noofposts;
	private String noofemployers;
	private String noofappliedposts;
	public Jobhub(String noofposts, String noofemployers, String noofappliedposts) {
		super();
		this.noofposts = noofposts;
		this.noofemployers = noofemployers;
		this.noofappliedposts = noofappliedposts;
	}
	
	
	public Jobhub() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getNoofposts() {
		return noofposts;
	}
	public void setNoofposts(String noofposts) {
		this.noofposts = noofposts;
	}
	public String getnoofemployers() {
		return noofemployers;
	}
	public void setnoofemployers(String noofemployers) {
		this.noofemployers = noofemployers;
	}
	public String getNoofappliedposts() {
		return noofappliedposts;
	}
	public void setNoofappliedposts(String noofappliedposts) {
		this.noofappliedposts = noofappliedposts;
	}
	
	

}
