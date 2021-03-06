package com.packt.pfextensions.model;

import java.io.Serializable;

public class SkillsDetails implements Serializable{

		private static final long serialVersionUID = 20111120L;

		private String frameworks;
		private String experience;
		private String certifications;		
		private String rating;
		
		
		public SkillsDetails(String frameworks, String experience,
				String certifications, String rating) {
			super();
			this.frameworks = frameworks;
			this.experience = experience;
			this.certifications = certifications;
			this.rating = rating;
		}
		
		public String getFrameworks() {
			return frameworks;
		}
		public String getCertifications() {
			return certifications;
		}
		public String getExperience() {
			return experience;
		}
		public String getRating() {
			return rating;
		}
		
		
}
