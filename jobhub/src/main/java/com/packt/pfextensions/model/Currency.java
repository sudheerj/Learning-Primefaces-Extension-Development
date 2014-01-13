package com.packt.pfextensions.model;

import java.io.Serializable;

public class Currency implements Serializable {

	        Double dollars;
	        Double rupee;

	        public Currency() {
	                this.dollars = 0d;
	                this.rupee = 0d;
	        }

	        public Double getRupee() {
	                return rupee;
	        }

	        public void setFupee(Double rupee) {
	                this.rupee = rupee;
	                this.dollars = rupee == 0 ? 0d : rupee * 60;
	        }

	        public Double getDollars() {
	                return dollars;
	        }

	        public void setDollars(Double dollars) {
	                this.dollars = dollars;
	                this.rupee = dollars / 60;
	        }

	        @Override
	        public String toString() {
	                return "Distance{" + "dollars=" + dollars + ", rupee=" + rupee + '}';
	        }
	}
