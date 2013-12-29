package com.packt.pfextensions.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.packt.pfextensions.model.Employer;
import com.packt.pfextensions.model.EmployerDetails;

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
	public List<EmployerDetails> employerDetails;


	@PostConstruct
	public void init() {
		employers = new ArrayList<Employer>();
		populateEmployers(employers, 50);
		   
	        
	        
	}

	private void populateEmployers(List<Employer> list, int size) {
		for (int i = 0; i < size; i++){
			employerDetails=new ArrayList<EmployerDetails>();
			
			 if(i%2==0){
				 employerDetails.add(new EmployerDetails("Birmingham", getRandomVacancies(), getEmployeeCount(),getClientsCount()));
			        employerDetails.add(new EmployerDetails("London", getRandomVacancies(), getEmployeeCount(),getClientsCount()));
			        employerDetails.add(new EmployerDetails("Chester", getRandomVacancies(), getEmployeeCount(),getClientsCount()));
			        employerDetails.add(new EmployerDetails("Derby", getRandomVacancies(), getEmployeeCount(),getClientsCount()));
			        employerDetails.add(new EmployerDetails("Coventry", getRandomVacancies(), getEmployeeCount(),getClientsCount()));
			        
			 }
			 else{
			    employerDetails.add(new EmployerDetails("Newyork", getRandomVacancies(), getEmployeeCount(),getClientsCount()));
		        employerDetails.add(new EmployerDetails("Newjersy", getRandomVacancies(), getEmployeeCount(),getClientsCount()));
		        employerDetails.add(new EmployerDetails("Dollas", getRandomVacancies(), getEmployeeCount(),getClientsCount()));
		        employerDetails.add(new EmployerDetails("California", getRandomVacancies(), getEmployeeCount(),getClientsCount()));
		        employerDetails.add(new EmployerDetails("WD", getRandomVacancies(), getEmployeeCount(),getClientsCount()));
		        employerDetails.add(new EmployerDetails("", getRandomVacancies(), getEmployeeCount(),getClientsCount()));
			 }
		        
		       
			list.add(new Employer(getOrgname(i), getRandomBranch(i),
					getRandomYear(), getRandomNoofemployees(),employerDetails));}
	}

	public List<Employer> getEmployers() {
		return employers;
	}

	public void setEmployers(List<Employer> employers) {
		this.employers = employers;
	}

	private String getRandomYear() {
		return (int)(Math.random() * 50 + 1960) + "";
	}

	private String getRandomBranch(int i) {
		if (i % 2 == 0)
			return "UK" +(int) (Math.random() * 50);
		else
			return "US" +(int) (Math.random() * 50);
	}

	private String getOrgname(int i) {
		return "Company" + i;
	}

	private String getRandomNoofemployees() {
		return (int)(Math.random() * 50 * 4 + 10000) + "";

	}
	private String getRandomVacancies() {
		return (int)(Math.random() * 50  + 10) + "";

	}
	private String getEmployeeCount() {
		return (int)(Math.random() * 200 + 1000) + "";

	}
	private String getClientsCount(){
		return (int)(Math.random() * 10  + 10) + "";
	}

    
}
