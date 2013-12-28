package com.packt.pfextensions.controller;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.FlowEvent;

import com.packt.pfextensions.model.JobSeeker;

@ManagedBean
@ViewScoped
public class EmployeeRegistration implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JobSeeker jobseeker = new JobSeeker();

	private boolean skip;

	private static Logger logger = Logger.getLogger(EmployeeRegistration.class
			.getName());

	private Map<String, String> selectedFrameworkOptions;
	private Map<String, String> selectedDBOptions;
	private Map<String, String> allFrameworkOptions;
	private String avgrating;
	private String infocheck;

	@PostConstruct
	public void init() {
		allFrameworkOptions = new HashMap<String, String>();
		allFrameworkOptions.put("Label for JSF", "JSF");
		allFrameworkOptions.put("Label for Spring", "Spring");
		allFrameworkOptions.put("Label for Struts", "Struts");

		// default will created with state=0
		selectedFrameworkOptions = new HashMap<String, String>();
		selectedFrameworkOptions.put("JSF", "1");

		selectedDBOptions = new HashMap<String, String>();
		selectedDBOptions.put("Oracle", "1");
		selectedDBOptions.put("MySQL", "1");
		selectedDBOptions.put("SQLServer", "2");

		avgrating = "1";
		infocheck = "2";

	}

	public void save(ActionEvent actionEvent) {
		// Persist user

		FacesMessage msg = new FacesMessage("Successful", "Welcome :"
				+ jobseeker.getFirstname());
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public String onFlowProcess(FlowEvent event) {
		logger.info("Current wizard step:" + event.getOldStep());
		logger.info("Next step:" + event.getNewStep());

		if (skip) {
			skip = false; // reset in case user goes back
			return "confirm";
		} else {
			return event.getNewStep();
		}
	}

	public JobSeeker getJobseeker() {
		return jobseeker;
	}

	public void setJobseeker(JobSeeker jobseeker) {
		this.jobseeker = jobseeker;
	}

	public boolean isSkip() {
		return skip;
	}

	public void setSkip(boolean skip) {
		this.skip = skip;
	}

	public Map<String, String> getSelectedFrameworkOptions() {
		return selectedFrameworkOptions;
	}

	public void setSelectedFrameworkOptions(
			Map<String, String> selectedFrameworkOptions) {
		this.selectedFrameworkOptions = selectedFrameworkOptions;
	}

	public Map<String, String> getSelectedDBOptions() {
		return selectedDBOptions;
	}

	public void setSelectedDBOptions(Map<String, String> selectedDBOptions) {
		this.selectedDBOptions = selectedDBOptions;
	}

	public Map<String, String> getAllFrameworkOptions() {
		return allFrameworkOptions;
	}

	public void setAllFrameworkOptions(Map<String, String> allFrameworkOptions) {
		this.allFrameworkOptions = allFrameworkOptions;
	}

	public String getAvgrating() {
		return avgrating;
	}

	public void setAvgrating(String avgrating) {
		this.avgrating = avgrating;
	}

	public String getInfocheck() {
		return infocheck;
	}

	public void setInfocheck(String infocheck) {
		this.infocheck = infocheck;
	}

}