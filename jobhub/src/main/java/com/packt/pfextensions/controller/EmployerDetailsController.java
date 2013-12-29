package com.packt.pfextensions.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.packt.pfextensions.model.Employer;

@ManagedBean
@ViewScoped
public class EmployerDetailsController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */

	private List<Employer> employers;

	@PostConstruct
	public void init() {
		employers = new ArrayList<Employer>();
		populateEmployers(employers, 50);
	}

	private void populateEmployers(List<Employer> list, int size) {
		for (int i = 0; i < size; i++)
			list.add(new Employer(getOrgname(i), getRandomBranch(i),
					getRandomYear(), getRandomNoofemployees()));
	}

	public List<Employer> getEmployers() {
		return employers;
	}

	public void setEmployers(List<Employer> employers) {
		this.employers = employers;
	}

	private String getRandomYear() {
		return (Math.random() * 50 + 1960) + "";
	}

	private String getRandomBranch(int i) {
		if (i % 2 == 0)
			return "UK" + (Math.random() * 50);
		else
			return "US" + (Math.random() * 50);
	}

	private String getOrgname(int i) {
		return "Company" + i;
	}

	private String getRandomNoofemployees() {
		return (Math.random() * 50 + 10000) + "";

	}


}
