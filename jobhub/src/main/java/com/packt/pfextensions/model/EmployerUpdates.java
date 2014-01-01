package com.packt.pfextensions.model;

public class EmployerUpdates {
	
private String noofposts;
private String applications;
private String noofselected;
private String monthname;
public EmployerUpdates(String noofposts, String applications,
		String noofselected,String monthname) {
	super();
	this.noofposts = noofposts;
	this.applications = applications;
	this.noofselected = noofselected;
	this.monthname=monthname;
}
public String getNoofposts() {
	return noofposts;
}
public void setNoofposts(String noofposts) {
	this.noofposts = noofposts;
}
public String getApplications() {
	return applications;
}
public void setApplications(String applications) {
	this.applications = applications;
}
public String getNoofselected() {
	return noofselected;
}
public void setNoofselected(String noofselected) {
	this.noofselected = noofselected;
}
public String getMonthname() {
	return monthname;
}
public void setMonthname(String monthname) {
	this.monthname = monthname;
}



}
