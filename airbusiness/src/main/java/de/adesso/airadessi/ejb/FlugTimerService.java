package de.adesso.airadessi.ejb;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.Timeout;
import javax.ejb.TimerService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Stateless
public class FlugTimerService {

	private final Logger logger = LoggerFactory
			.getLogger(FlugTimerService.class);

	@Resource
	private TimerService timerService;

	public void init() {

		timerService.createTimer(100l, "hello there");
	}

	private void setTimer() {

	}

	@Timeout
	public void flugInformationenVerschicken() {
		logger.info("hsadasdsad");
	}

	// @Schedule
	// public void automaticTimeout() {
	// // this.setLastAutomaticTimeout(new Date());
	// logger.info("Automatic timeout occured");
	// }
}
