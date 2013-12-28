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
	
	private String experience;
	
	private String currentPack;
	
	private String expectedPack;
	
	private Date interviewTime;
	
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

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getCurrentPack() {
		return currentPack;
	}

	public void setCurrentPack(String currentPack) {
		this.currentPack = currentPack;
	}

	public String getExpectedPack() {
		return expectedPack;
	}

	public void setExpectedPack(String expectedPack) {
		this.expectedPack = expectedPack;
	}

	public Date getInterviewTime() {
		return interviewTime;
	}

	public void setInterviewTime(Date interviewTime) {
		this.interviewTime = interviewTime;
	}
	
}
