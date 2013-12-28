package com.packt.pfextensions.model;

import java.io.Serializable;
import java.util.Date;

public class JobSeeker implements Serializable {

	private String firstname;
	
	private String lastname;
	
	private Integer age;
	
	private String sex;
	
	private String maritalStatus;
	
	private String street;
	
	private String city;
	
	private String profession;
	
	private Double experience=new Double(0);
	
	private Double currentPack = new Double(0); 
	private Double expectedPack = new Double(0); 
	
	private Date interviewFromTime;
	private Date interviewToTime;
	
	
	private String postalCode;
	
	private String info;
	
	private String email;
	
	private String phone;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	
	public Double getExperience() {
		return experience;
	}

	public void setExperience(Double experience) {
		this.experience = experience;
	}

	public Double getCurrentPack() {
		return currentPack;
	}

	public void setCurrentPack(Double currentPack) {
		this.currentPack = currentPack;
	}

	public Double getExpectedPack() {
		return expectedPack;
	}

	public void setExpectedPack(Double expectedPack) {
		this.expectedPack = expectedPack;
	}

	public Date getInterviewFromTime() {
		return interviewFromTime;
	}

	public void setInterviewFromTime(Date interviewFromTime) {
		this.interviewFromTime = interviewFromTime;
	}

	public Date getInterviewToTime() {
		return interviewToTime;
	}

	public void setInterviewToTime(Date interviewToTime) {
		this.interviewToTime = interviewToTime;
	}

	
	
}
