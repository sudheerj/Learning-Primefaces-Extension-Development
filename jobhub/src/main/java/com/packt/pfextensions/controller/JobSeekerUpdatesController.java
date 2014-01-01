package com.packt.pfextensions.controller;

import java.io.Serializable;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.packt.pfextensions.model.JobSeekerUpdates;

@ManagedBean
@ViewScoped
public class JobSeekerUpdatesController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<JobSeekerUpdates> recentupdates;
	String months[] = {"January", "February", "March", "April",
            "May", "June", "July", "August", "September",
            "October", "November", "December"};

	@PostConstruct
	public void init() {
		recentupdates = new ArrayList<JobSeekerUpdates>();
		for (int i = 3; i >0; i--) {
			recentupdates.add(new JobSeekerUpdates(getPosts(),
					getAppliedPosts(), getViews(), getDownloads(),
					months[i]));
		}

	}

	public String getPosts() {
		return (int) (Math.random() * 10000) + "";
	}

	public String getAppliedPosts() {
		return (int) (Math.random() * 100) + "";
	}

	public String getViews() {
		return (int) (Math.random() * 500) + "";
	}

	public String getDownloads() {
		return (int) (Math.random() * 10) + "";
	}

	public List<JobSeekerUpdates> getRecentupdates() {
		return recentupdates;
	}

	public void setRecentupdates(List<JobSeekerUpdates> recentupdates) {
		this.recentupdates = recentupdates;
	}
	
	
}
