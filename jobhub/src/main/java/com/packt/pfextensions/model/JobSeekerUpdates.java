package com.packt.pfextensions.model;

public class JobSeekerUpdates {
	
	private String noofposts;
	private String noofpostsapplied;
	private String noofviews;
	private String noofdownloads;
	private String monthname;
	public JobSeekerUpdates(String noofposts, String noofpostsapplied,
			String noofviews, String noofdownloads, String monthname) {
		super();
		this.noofposts = noofposts;
		this.noofpostsapplied = noofpostsapplied;
		this.noofviews = noofviews;
		this.noofdownloads = noofdownloads;
		this.monthname = monthname;
	}
	public String getNoofposts() {
		return noofposts;
	}
	public void setNoofposts(String noofposts) {
		this.noofposts = noofposts;
	}
	public String getNoofpostsapplied() {
		return noofpostsapplied;
	}
	public void setNoofpostsapplied(String noofpostsapplied) {
		this.noofpostsapplied = noofpostsapplied;
	}
	public String getNoofviews() {
		return noofviews;
	}
	public void setNoofviews(String noofviews) {
		this.noofviews = noofviews;
	}
	public String getNoofdownloads() {
		return noofdownloads;
	}
	public void setNoofdownloads(String noofdownloads) {
		this.noofdownloads = noofdownloads;
	}
	public String getMonthname() {
		return monthname;
	}
	public void setMonthname(String monthname) {
		this.monthname = monthname;
	}
	
	
	

}
