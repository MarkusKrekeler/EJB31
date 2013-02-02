package de.adesso.airadessi.view.suche;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.adesso.air.model.Flug;
import de.adesso.airadessi.ejb.CalculationBean;
import de.adesso.airadessi.ejb.FlugServiceBean;

@ManagedBean(name = "flugSucheBean")
@SessionScoped
public class FlugSucheBean {

	private final Logger logger = LoggerFactory.getLogger(FlugSucheBean.class);

	@EJB
	private FlugServiceBean service;

	@EJB
	private CalculationBean statelessBean;

	private List<Flug> fluege;

	public void suche() {
		logger.info("Hallo");
		fluege = service.fluegeSuchen();

	}

	public String statelessInfo() {
		return statelessBean.getBeanId();
	}

	public String rechne() {
		int a = 1;

		int b = a + 10;

		return String.valueOf(b);
	}

	public List<Flug> getFluege() {
		return fluege;
	}

	public void setFluege(List<Flug> fluege) {
		this.fluege = fluege;
	}

}
