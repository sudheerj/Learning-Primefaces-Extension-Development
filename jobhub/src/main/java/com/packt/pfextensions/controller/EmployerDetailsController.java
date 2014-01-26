package com.packt.pfextensions.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.component.datatable.DataTable;
import org.primefaces.event.data.FilterEvent;

import com.packt.pfextensions.dataModel.EmployerDataModel;
import com.packt.pfextensions.model.Employer;
import com.packt.pfextensions.model.EmployerDetails;
import com.packt.pfextensions.model.OrgStandards;

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
	private List<Employer> filteredemployers;
	public List<EmployerDetails> employerDetails;
	private Employer enrolledEmployer = new Employer();
	private Employer selectedEmployer;
	private String randomKey;
	private EmployerDataModel employersModel;
	private boolean editable;
	private int employeetotal;
	private String focus;
	private String result;
	private OrgStandards standards;
	private String state;

	@PostConstruct
	public void init() {
		employers = new ArrayList<Employer>();
		selectedEmployer = new Employer();
	//	filteredemployers = new ArrayList<Employer>();
		employers=populateEmployers(employers, 50);
		employersModel = new EmployerDataModel(employers);
		employeetotal=0;
		for (Employer employer : employers) {
			employeetotal += new Integer(employer.getNoofemployees());
		}

	}

	private List<Employer> populateEmployers(List<Employer> list, int size) {
		for (int i = 0; i < size; i++) {
			employerDetails = new ArrayList<EmployerDetails>();

			if (i % 2 == 0) {
				employerDetails.add(new EmployerDetails("Birmingham",
						getRandomVacancies(), getEmployeeCount(),
						getClientsCount()));
				employerDetails.add(new EmployerDetails("London",
						getRandomVacancies(), getEmployeeCount(),
						getClientsCount()));
				employerDetails.add(new EmployerDetails("Chester",
						getRandomVacancies(), getEmployeeCount(),
						getClientsCount()));
				employerDetails.add(new EmployerDetails("Derby",
						getRandomVacancies(), getEmployeeCount(),
						getClientsCount()));
				employerDetails.add(new EmployerDetails("Coventry",
						getRandomVacancies(), getEmployeeCount(),
						getClientsCount()));

			} else {
				employerDetails.add(new EmployerDetails("Newyork",
						getRandomVacancies(), getEmployeeCount(),
						getClientsCount()));
				employerDetails.add(new EmployerDetails("Newjersy",
						getRandomVacancies(), getEmployeeCount(),
						getClientsCount()));
				employerDetails.add(new EmployerDetails("Dollas",
						getRandomVacancies(), getEmployeeCount(),
						getClientsCount()));
				employerDetails.add(new EmployerDetails("California",
						getRandomVacancies(), getEmployeeCount(),
						getClientsCount()));
				employerDetails.add(new EmployerDetails("WD",
						getRandomVacancies(), getEmployeeCount(),
						getClientsCount()));
				employerDetails.add(new EmployerDetails("Chicago",
						getRandomVacancies(), getEmployeeCount(),
						getClientsCount()));
			}

			list.add(new Employer(getOrgname(i), getRandomBranch(i),
					getRandomYear(), getRandomNoofemployees(), employerDetails));
		}
		return list;
	}

	public void registerEmployer() {
		employers.add(0, enrolledEmployer);

		FacesMessage msg = new FacesMessage("Successful", "Welcome :"
				+ enrolledEmployer.getOrgname());
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public int getEmployeeTotal() {
		/* employeetotal = 0;

		for (Employer employer : employers) {
			employeetotal += new Integer(employer.getNoofemployees());
		}*/

		return employeetotal;
	}
	
	public Map<String,String> onFilter(FilterEvent filterEvent) {
		System.out.println("onfilter start");
		DataTable table=(DataTable) filterEvent.getSource();
		System.out.println("table");
		List<Employer> filteredemployerslist=table.getFilteredValue();
		System.out.println("fitler"+filteredemployerslist);
	/*	System.out.println("size=="+filteredemployerslist.size());
		for(Employer employer : filteredemployerslist){
			employeetotal=employeetotal+new Integer(employer.getNoofemployees());
			System.out.println("loop");
		}*/
		//Collections.copy(employers, filteredemployers); 
		//getEmployeeTotal();
	//return table.getFilters();
		employeetotal=0;
		if(filteredemployerslist!=null)
		for(Employer employer : filteredemployerslist){
			employeetotal=employeetotal+new Integer(employer.getNoofemployees());
			System.out.println("loop");
		}
		
		return table.getFilters();
	
	}

	public List<Employer> getEmployers() {
		return employers;
	}

	public void setEmployers(List<Employer> employers) {
		this.employers = employers;
	}

	private String getRandomYear() {
		return (int) (Math.random() * 50 + 1960) + "";
	}

	private String getRandomBranch(int i) {
		if (i % 2 == 0)
			return "UK" + (int) (Math.random() * 50);
		else
			return "US" + (int) (Math.random() * 50);
	}

	private String getOrgname(int i) {
		return "Company" + i;
	}

	private String getRandomNoofemployees() {
		return (int) (Math.random() * 50 * 4 + 10000) + "";

	}

	private String getRandomVacancies() {
		return (int) (Math.random() * 50 + 10) + "";

	}

	private String getEmployeeCount() {
		return (int) (Math.random() * 200 + 1000) + "";

	}

	private String getClientsCount() {
		return (int) (Math.random() * 10 + 10) + "";
	}

	public Employer getEnrolledEmployer() {
		return enrolledEmployer;
	}

	public void setEnrolledEmployer(Employer enrolledEmployer) {
		this.enrolledEmployer = enrolledEmployer;
	}

	public Employer getSelectedEmployer() {
		return selectedEmployer;
	}

	public void setSelectedEmployer(Employer selectedEmployer) {
		this.selectedEmployer = selectedEmployer;
	}

	public String getRandomKey() {
		randomKey = UUID.randomUUID().toString().substring(0, 8);
		return randomKey;
	}

	public void setRandomKey(String randomKey) {
		this.randomKey = randomKey;
	}

	public EmployerDataModel getEmployersModel() {
		return employersModel;
	}

	public void setEmployersModel(EmployerDataModel employersModel) {
		this.employersModel = employersModel;
	}

	public boolean isEditable() {
		return editable;
	}

	public void setEditable(boolean editable) {
		this.editable = editable;
	}

	public List<Employer> getFilteredemployers() {
		return filteredemployers;
	}

	public void setFilteredemployers(List<Employer> filteredemployers) {
		System.out.println("setter=="+filteredemployers);
		this.filteredemployers = filteredemployers;
	}

	public int getEmployeetotal() {
		return employeetotal;
	}

	public void setEmployeetotal(int employeetotal) {
		this.employeetotal = employeetotal;
	}

	public OrgStandards getStandards() {
		return standards;
	}

	public void setStandards(OrgStandards standards) {
		this.standards = standards;
	}

	public String getFocus() {
		return focus;
	}

	public void setFocus(String focus) {
		this.focus = focus;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
}
