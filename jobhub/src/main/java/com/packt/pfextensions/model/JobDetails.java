package com.packt.pfextensions.model;

import java.io.Serializable;
import java.util.List;

public class JobDetails implements Serializable{

		private static final long serialVersionUID = 20111120L;

		private String jobCategory;
		private String experience;
		private String position;
		private List<SkillsDetails> skillsDetails;

		
		public JobDetails(String jobCategory, String experience,
				String position, List<SkillsDetails> skillsDetails) {
			super();
			this.jobCategory = jobCategory;
			this.experience = experience;
			this.position = position;
			this.skillsDetails = skillsDetails;
		}


		public String getJobCategory() {
			return jobCategory;
		}


		public String getExperience() {
			return experience;
		}


		public String getPosition() {
			return position;
		}


		public List<SkillsDetails> getSkillsDetails() {
			return skillsDetails;
		}

		
}
