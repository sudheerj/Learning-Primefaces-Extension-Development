package com.packt.pfextensions.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.packt.pfextensions.model.EmployerUpdates;
import com.packt.pfextensions.model.JobSeekerUpdates;

@ManagedBean
@ViewScoped
public class EmployerUpdatesController {
	private static final long serialVersionUID = 1L;

	private List<EmployerUpdates> recentupdates;
	String months[] = {"January", "February", "March", "April",
            "May", "June", "July", "August", "September",
            "October", "November", "December"};
	
	@PostConstruct
	public void init() {
		recentupdates = new ArrayList<EmployerUpdates>();
		for (int i = 3; i >0; i--) {
			recentupdates.add(new EmployerUpdates(getPosts(),
					getAppliedPosts(), getSelected(),
					months[i]));
		}

	}

	public String getPosts() {
		return (int) ((Math.random() * 50) +50 )+"";
	}

	public String getAppliedPosts() {
		return (int) ((Math.random() * 1000) +1000)+ "";
	}

	public String getSelected() {
		return (int) ((Math.random() * 10) +10)+ "";
	}

	public List<EmployerUpdates> getRecentupdates() {
		return recentupdates;
	}

	public void setRecentupdates(List<EmployerUpdates> recentupdates) {
		this.recentupdates = recentupdates;
	}

	
	
	
}
