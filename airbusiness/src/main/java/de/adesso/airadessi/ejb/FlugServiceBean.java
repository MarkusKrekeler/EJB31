package de.adesso.airadessi.ejb;

import javax.annotation.PostConstruct;
import javax.ejb.Stateful;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Stateful
public class FlugServiceBean {

	private final Logger logger = LoggerFactory
			.getLogger(FlugServiceBean.class);

	// Übung init Methode zum erstellen von Objekten
	// Übung Injecten einer Stateless Session Bean zum konvertieren von Objekten

	@PostConstruct
	public void initBean() {
		logger.info("Stateful Bean created!");
	}

	public void fluegeSuchen() {

	}

	public void flugBuchen() {

	}

	public void flugStornieren() {

	}

	public void flugUmbuchen() {

	}

}
