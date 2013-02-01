package de.adesso.air.model;

import java.util.Date;

public class Person {

	private String name;

	private String vorname;

	private Date geburtsdatum;

	private boolean terrorist;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public Date getGeburtsdatum() {
		return geburtsdatum;
	}

	public void setGeburtsdatum(Date geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}

	public boolean isTerrorist() {
		return terrorist;
	}

	public void setTerrorist(boolean terrorist) {
		this.terrorist = terrorist;
	}

}
