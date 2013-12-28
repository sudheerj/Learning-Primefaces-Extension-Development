package com.packt.pfextensions.model;

import java.io.Serializable;

public class Company implements Serializable{

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private String name;

		public Company() {
		}

		public Company(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	            
}
