package de.adesso.airadessi.ejb;

import javax.ejb.Stateless;

@Stateless
public class CalculationBean {

	public String getBeanId() {
		return this.toString();
	}
}
