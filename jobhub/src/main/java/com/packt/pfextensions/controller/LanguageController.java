package com.packt.pfextensions.controller;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

@ManagedBean
@RequestScoped
public class LanguageController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String localeCode;

	private static Map<String, Object> countries;
	ResourceBundle messageBundle;

	@ManagedProperty(value = "#{loginBean}")
	private LoginBean loginBean; // +setter
	static {
		countries = new LinkedHashMap<String, Object>();
		countries.put("English", Locale.ENGLISH); // label, value
		countries.put("Turkey", Locale.forLanguageTag("tr-TR"));
	}

	@PostConstruct
	public void init() {

	}

	public void countryLocaleCodeChanged(ValueChangeEvent e) {
		System.out.println("locale changed");

		String newLocaleValue = e.getNewValue().toString();

		// loop country map to compare the locale code
		for (Map.Entry<String, Object> entry : countries.entrySet()) {

			if (entry.getValue().toString().equals(newLocaleValue)) {

				FacesContext.getCurrentInstance().getViewRoot()
						.setLocale((Locale) entry.getValue());

			}
		}
		System.out.println("login scoped bean");

		messageBundle = ResourceBundle.getBundle("com.packt.messages",FacesContext.getCurrentInstance().getViewRoot().getLocale());
		String loginmessage=messageBundle.getString("login.login"); 
		loginBean.setLoginmessage(loginmessage);
	}

	public Map<String, Object> getCountriesInMap() {
		return countries;
	}

	public String getLocaleCode() {
		return localeCode;
	}

	public void setLocaleCode(String localeCode) {
		this.localeCode = localeCode;
	}

	public LoginBean getLoginBean() {
		return loginBean;
	}

	public void setLoginBean(LoginBean loginBean) {
		this.loginBean = loginBean;
	}

}
