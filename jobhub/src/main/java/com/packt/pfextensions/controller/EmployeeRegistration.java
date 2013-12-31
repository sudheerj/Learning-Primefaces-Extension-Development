package com.packt.pfextensions.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.FlowEvent;
import org.primefaces.extensions.model.dynaform.DynaFormControl;
import org.primefaces.extensions.model.dynaform.DynaFormLabel;
import org.primefaces.extensions.model.dynaform.DynaFormModel;
import org.primefaces.extensions.model.dynaform.DynaFormRow;

import com.packt.pfextensions.model.AddressProperty;
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

	private DynaFormModel model;
	
	private static List<SelectItem> countries = new ArrayList<SelectItem>();
	private static List<SelectItem> cities = new ArrayList<SelectItem>();

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

		model = new DynaFormModel();

		// add rows, labels and editable controls
		// set relationship between label and editable controls to support
		// outputLabel with "for" attribute

		// 1. regular row
		DynaFormRow row = model.createRegularRow();

		DynaFormLabel label11 = row.addLabel("Address", 1, 1);
		DynaFormControl control12 = row.addControl(new AddressProperty(
				"Address", false), "input", 2, 1);
		label11.setForControl(control12);

		DynaFormControl control13 = row.addControl(new AddressProperty(
				"Address", false), "input", 1, 1);

		// 2. regular row
		row = model.createRegularRow();

		DynaFormLabel label21 = row.addLabel("Country", 1, 1);
		DynaFormControl control22 = row.addControl(new AddressProperty(
				"Country", true), "select1", 1, 1);
		label21.setForControl(control22);

		DynaFormLabel label23 = row.addLabel("City", 1, 1);
		DynaFormControl control24 = row.addControl(new AddressProperty("City",
				"Select", true), "select2", 1, 1);
		label23.setForControl(control24);

		// 3. regular row
		row = model.createRegularRow();

		DynaFormLabel label31 = row.addLabel(
				"Email (this field requires any not empty input)", 3, 1);
		DynaFormControl control32 = row.addControl(new AddressProperty("Email",
				true), "input", 1, 1);
		label31.setForControl(control32);

		// 4. regular row
		row = model.createRegularRow();
		DynaFormLabel label41 = row.addLabel("Phone", 1, 1);
		DynaFormControl control42 = row.addControl(new AddressProperty(
				"Extension", true), "input", 1, 1);
		label41.setForControl(control42);

		DynaFormControl control43 = row.addControl(new AddressProperty("Phone",
				true), "input", 2, 1);
		// 5. regular row
		row = model.createRegularRow();
		DynaFormLabel label51 = row.addLabel("Mobile", 1, 1);
		DynaFormControl control52 = row.addControl(new AddressProperty(
				"Mobile", true), "input", 1, 1);
		label51.setForControl(control52);

		DynaFormLabel label53 = row.addLabel("Description", 1, 2);
		DynaFormControl control54 = row.addControl(new AddressProperty(
				"Moreinfo", false), "desc", 1, 1);
		label53.setForControl(control54);

		// 6. regular row
		row = model.createRegularRow();
		DynaFormLabel label61 = row.addLabel("Zip code", 1, 1);
		DynaFormControl control62 = row.addControl(new AddressProperty("Zip",
				true), "input", 1, 1);
		label61.setForControl(control62);

		// 1. extended row

		row = model.createExtendedRow();

		row.addControl("Address", 1, 1);
		row.addControl(new AddressProperty("Address", false), "input", 2, 1);

		row.addControl(new AddressProperty("Address", false), "input", 1, 1);

		// 2. extended row
		row = model.createExtendedRow();

		row.addControl("Country", 1, 1);
		row.addControl(new AddressProperty("Country", false), "select1", 1, 1);

		row.addControl("City", 1, 1);
		row.addControl(new AddressProperty("City", false), "select2", 1, 1);

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
	 public List<SelectItem> getCountries() {  
	        if (countries.isEmpty()) {  
	            countries.add(new SelectItem("India", "India"));  
	            countries.add(new SelectItem("German", "German"));  
	            countries.add(new SelectItem("Turkey", "Turkey"));  
	            countries.add(new SelectItem("Russia", "Russia"));  
	        }  
	  
	        return countries;  
	    }  
	 public List<SelectItem> getCities() {  
	        if (cities.isEmpty()) {  
	        	cities.add(new SelectItem("city1", "city"));  
	        	cities.add(new SelectItem("city1", "city"));  
	        	cities.add(new SelectItem("city1", "city1"));  
	        	cities.add(new SelectItem("city1", "city1"));  
	        }  
	  
	        return cities;  
	    }  
	public DynaFormModel getModel() {
		return model;
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