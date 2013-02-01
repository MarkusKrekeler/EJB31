package de.adesso.air.model;

import java.util.Date;
import java.util.Set;

public class Flug {

	private String flugnummer;

	private Date startzeit;

	private String startFlughafen;

	private String zielFlughafen;

	private Flugzeug flugzeug;

	private Set<Buchung> buchungen;

	public String getFlugnummer() {
		return flugnummer;
	}

	public void setFlugnummer(String flugnummer) {
		this.flugnummer = flugnummer;
	}

	public Date getStartzeit() {
		return startzeit;
	}

	public void setStartzeit(Date startzeit) {
		this.startzeit = startzeit;
	}

	public String getStartFlughafen() {
		return startFlughafen;
	}

	public void setStartFlughafen(String startFlughafen) {
		this.startFlughafen = startFlughafen;
	}

	public String getZielFlughafen() {
		return zielFlughafen;
	}

	public void setZielFlughafen(String zielFlughafen) {
		this.zielFlughafen = zielFlughafen;
	}

	public Flugzeug getFlugzeug() {
		return flugzeug;
	}

	public void setFlugzeug(Flugzeug flugzeug) {
		this.flugzeug = flugzeug;
	}

	public Set<Buchung> getBuchungen() {
		return buchungen;
	}

	public void setBuchungen(Set<Buchung> buchungen) {
		this.buchungen = buchungen;
	}

}
