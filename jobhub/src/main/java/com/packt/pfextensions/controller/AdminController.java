package com.packt.pfextensions.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

@ManagedBean
@ApplicationScoped
public class AdminController implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String aboutus;
	private String communication;
	private String privacy;
	private String disclaimer;
	private String help;
	private String color="1234FF";
	private String language;

	private Boolean aboutusFlag;
	private Boolean communicationFlag;
	private Boolean privacyFlag;
	private Boolean disclaimerFlag;
	private Boolean helpFlag;
	private List<String> images;
	
	@PostConstruct
	public void init() {
		images = new ArrayList<String>();

		for (int i = 1; i <= 6; i++) {
			images.add("galleria" + i + ".jpg");
		}
		aboutus = "The jobhub application is aimed to provide employement for most of the people around the globe.This is mainly categoriezed for jobseekers and employeers.Administrator can have access rights to change the rules and acts.";
				/*+ "The jobhub application is aimed to provide employement for most of the people around the globe.This is mainly categoriezed for jobseekers and employeers.Administrator can have access rights to change the rules and acts."
				+ "The jobhub application is aimed to provide employement for most of the people around the globe.This is mainly categoriezed for jobseekers and employeers.Administrator can have access rights to change the rules and acts.";*/
		communication = "The jobhub application is aimed to provide employement for most of the people around the globe.This is mainly categoriezed for jobseekers and employeers.Administrator can have access rights to change the rules and acts.";
		privacy = "The jobhub application is aimed to provide employement for most of the people around the globe.This is mainly categoriezed for jobseekers and employeers.Administrator can have access rights to change the rules and acts.";
		disclaimer = "The jobhub application is aimed to provide employement for most of the people around the globe.This is mainly categoriezed for jobseekers and employeers.Administrator can have access rights to change the rules and acts.";
		help = "The jobhub application is aimed to provide employement for most of the people around the globe.This is mainly categoriezed for jobseekers and employeers.Administrator can have access rights to change the rules and acts.";

	}

	
	public void aboutusEdit() {
		aboutusFlag = true;
	}

	public void aboutusSave() {
		aboutus = aboutus.replaceAll("\\<.*?>","");
		aboutusFlag = false;
	}

	public void communicationEdit() {
		communicationFlag = true;
	}

	public void communicationSave() {
		communication = communication.replaceAll("\\<.*?>","");
		communicationFlag = false;
	}

	public void privacyEdit() {
		privacyFlag = true;
	}

	public void privacySave() {
		privacy = privacy.replaceAll("\\<.*?>","");
		privacyFlag = false;
	}

	public void disclaimerEdit() {
		disclaimerFlag = true;
	}

	public void disclaimerSave() {
		disclaimer = disclaimer.replaceAll("\\<.*?>","");
		disclaimerFlag = false;
	}

	public void helpEdit() {
		helpFlag = true;
	}

	public void helpSave() {
		help = help.replaceAll("\\<.*?>","");
		helpFlag = false;
	}

	public String getCommunication() {
		return communication;
	}

	public void setCommunication(String communication) {
		this.communication = communication;
	}

	public String getPrivacy() {
		return privacy;
	}

	public void setPrivacy(String privacy) {
		this.privacy = privacy;
	}

	public String getDisclaimer() {
		return disclaimer;
	}

	public void setDisclaimer(String disclaimer) {
		this.disclaimer = disclaimer;
	}

	public String getHelp() {
		return help;
	}

	public void setHelp(String help) {
		this.help = help;
	}

	public String getAboutus() {
		return aboutus;
	}

	public void setAboutus(String aboutus) {
		this.aboutus = aboutus;
	}

	public Boolean getAboutusFlag() {
		return aboutusFlag;
	}

	public void setAboutusFlag(Boolean aboutusFlag) {
		this.aboutusFlag = aboutusFlag;
	}

	public Boolean getCommunicationFlag() {
		return communicationFlag;
	}

	public void setCommunicationFlag(Boolean communicationFlag) {
		this.communicationFlag = communicationFlag;
	}

	public Boolean getPrivacyFlag() {
		return privacyFlag;
	}

	public void setPrivacyFlag(Boolean privacyFlag) {
		this.privacyFlag = privacyFlag;
	}

	public Boolean getDisclaimerFlag() {
		return disclaimerFlag;
	}

	public void setDisclaimerFlag(Boolean disclaimerFlag) {
		this.disclaimerFlag = disclaimerFlag;
	}

	public Boolean getHelpFlag() {
		return helpFlag;
	}

	public void setHelpFlag(Boolean helpFlag) {
		this.helpFlag = helpFlag;
	}

	public List<String> getImages() {
		return images;
	}

	public void setImages(List<String> images) {
		this.images = images;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
