package com.packt.pfextensions.model;

import java.io.Serializable;
import java.util.List;

public class JobPost implements Serializable{

		private static final long serialVersionUID = 20111120L;

		private String title;
		private String postDescription;
		private String location;
		
		private List<JobDetails> jobDetails;
		
		public JobPost(String title, String postDescription, String location,
				List<JobDetails> jobDetails) {
			super();
			this.title = title;
			this.postDescription = postDescription;
			this.location = location;
			this.jobDetails = jobDetails;
		}

		public String getTitle() {
			return title;
		}

		public String getPostDescription() {
			return postDescription;
		}

		public String getLocation() {
			return location;
		}

		public List<JobDetails> getJobDetails() {
			return jobDetails;
		}

		

		
}
