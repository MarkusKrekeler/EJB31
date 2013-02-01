package de.adesso.air.model;

import de.adesso.air.model.types.Flugzeugtyp;

public class Flugzeug {

	private Flugzeugtyp flugzeugTyp;

	private int leistung;

	private int sitzplaetze;

	private int besatzung;

	public Flugzeugtyp getFlugzeugTyp() {
		return flugzeugTyp;
	}

	public void setFlugzeugTyp(Flugzeugtyp flugzeugTyp) {
		this.flugzeugTyp = flugzeugTyp;
	}

	public int getLeistung() {
		return leistung;
	}

	public void setLeistung(int leistung) {
		this.leistung = leistung;
	}

	public int getSitzplaetze() {
		return sitzplaetze;
	}

	public void setSitzplaetze(int sitzplaetze) {
		this.sitzplaetze = sitzplaetze;
	}

	public int getBesatzung() {
		return besatzung;
	}

	public void setBesatzung(int besatzung) {
		this.besatzung = besatzung;
	}

}
