package de.adesso.airadessi.ejb;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateful;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.adesso.air.model.Flug;

@Stateful
public class FlugServiceBean {

	private final Logger logger = LoggerFactory
			.getLogger(FlugServiceBean.class);

	private final List<Flug> fluege = new ArrayList<Flug>();

	// Übung init Methode zum erstellen von Objekten
	// Übung Injecten einer Stateless Session Bean zum konvertieren von Objekten

	@EJB
	private FlugTimerService timerService;

	@PostConstruct
	public void initBean() {
		logger.info("Stateful Bean created!");

		Flug flug = new Flug();
		flug.setFlugnummer("AB1032");
		flug.setStartFlughafen("DTM");
		flug.setZielFlughafen("PMI");
		flug.setStartzeit(new Date());

		fluege.add(flug);

		timerService.init();
	}

	public List<Flug> fluegeSuchen() {
		logger.info("Suche Flüge");

		return fluege;

	}

	public void flugBuchen() {

	}

	public void flugStornieren() {

	}

	public void flugUmbuchen() {

	}

}
