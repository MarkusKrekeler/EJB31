package de.adesso.air.model;

import java.util.Date;
import java.util.Set;

import de.adesso.air.model.types.Kategorie;

public class Buchung {

	private Date datum;

	private double preis;

	private Kategorie kategorie;

	private Set<Person> fluggaeste;

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

	public Kategorie getKategorie() {
		return kategorie;
	}

	public void setKategorie(Kategorie kategorie) {
		this.kategorie = kategorie;
	}

	public Set<Person> getFluggaeste() {
		return fluggaeste;
	}

	public void setFluggaeste(Set<Person> fluggaeste) {
		this.fluggaeste = fluggaeste;
	}

}
