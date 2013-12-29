package com.packt.pfextensions.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
//import org.primefaces.context.RequestContext;
import javax.faces.bean.ManagedBean;


@ManagedBean
@ViewScoped
public class LoginBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String username;
	
	private String password;
	
	private String userrole;
	private String loginmessage;
	
	@PostConstruct  
	public void init() { 
		loginmessage="Login"; 
	}
	
	public String validateUser() {
		FacesMessage msg = null;
		
		if(userrole.equalsIgnoreCase("2") && username != null && username.equals("admin") && password != null && password.equals("admin")) {
			return "/views/admin?faces-redirect=true";
		} else if(userrole.equalsIgnoreCase("1") && username != null && username.equals("employer") && password != null && password.equals("employer")) {
			return "/views/employerslist?faces-redirect=true";
		}
		else if(userrole.equalsIgnoreCase("0") && username != null && username.equals("jobseeker") && password != null && password.equals("jobseeker")){
			 return "/views/jobsList?faces-redirect=true";
		}
		else {
			msg = new FacesMessage(FacesMessage.SEVERITY_WARN, "Login Error", "Invalid credentials");
			FacesContext.getCurrentInstance().addMessage(null, msg);
			 return null;
		}
		
	}
	
	public void changeUserRole(){
		
		if(userrole.equalsIgnoreCase("1")){
			loginmessage="Employer's Login";
		}
		else if(userrole.equalsIgnoreCase("2")){
			loginmessage="Admin's Login";
		}
		else {
			loginmessage="JobSeeker's Login";
		}
		
	}
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

	public String getUserrole() {
		return userrole;
	}

	public void setUserrole(String userrole) {
		this.userrole = userrole;
	}
	
	

	public String getLoginmessage() {
		return loginmessage;
	}

	public void setLoginmessage(String loginmessage) {
		this.loginmessage = loginmessage;
	}

	
}