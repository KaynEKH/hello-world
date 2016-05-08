/**
 * 
 */
package net.kurse.test.bo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

import net.kurse.test.bo.blocs.Aptitudes;
import net.kurse.test.bo.blocs.Caracs;
import net.kurse.test.bo.blocs.Echelles;
import net.kurse.test.bo.blocs.equip.ArmeCaC;
import net.kurse.test.bo.blocs.equip.ArmeTir;

/**
 * @author KaynEKH
 *
 */
@SuppressWarnings("serial")
@JsonPropertyOrder({ "ECH", "CAR", "APT", "EQP_ARME"})
public class CharSheet implements Serializable {

	@JsonProperty("ECH") private Echelles echelles;
	@JsonProperty("CAR") private Caracs caracs;
	@JsonProperty("APT") private Aptitudes aptitudes;
	@JsonProperty("EQP_ARME_CAC") private List<ArmeCaC> listeArmementCaC;
	@JsonProperty("EQP_ARME_TIR") private List<ArmeTir> listeArmementTir;
	// private Competences competences;

	public CharSheet() {
		this.echelles = new Echelles();
		this.caracs = new Caracs();
		this.aptitudes = new Aptitudes();
		this.listeArmementCaC = new ArrayList<ArmeCaC>();
		this.listeArmementTir = new ArrayList<ArmeTir>();
		// this.competences = new Competences();
	}

	/**
	 * @param caracs
	 * @param echelles
	 */
	public CharSheet(Echelles echelles, Caracs caracs) {
		this.echelles = echelles;
		this.caracs = caracs;
		this.aptitudes = new Aptitudes(caracs);
		this.listeArmementCaC = new ArrayList<ArmeCaC>();
		this.listeArmementTir = new ArrayList<ArmeTir>();
	}

	/**
	 * @param caracs
	 * @param echelles
	 */
	public CharSheet(Echelles echelles, Caracs caracs, List<ArmeCaC> listeArmementCaC, List<ArmeTir> listeArmementTir) {
		this.echelles = echelles;
		this.caracs = caracs;
		this.aptitudes = new Aptitudes(caracs);
		this.listeArmementCaC = listeArmementCaC;
		this.listeArmementTir = listeArmementTir;
	}
	
	/**
	 * @return the caracs
	 */
	public Caracs getCaracs() {
		return caracs;
	}

	/**
	 * @param caracs
	 *            the caracs to set
	 */
	public void setCaracs(Caracs caracs) {
		this.caracs = caracs;
	}

	/**
	 * @return the echelles
	 */
	public Echelles getEchelles() {
		return echelles;
	}

	/**
	 * @param echelles
	 *            the echelles to set
	 */
	public void setEchelles(Echelles echelles) {
		this.echelles = echelles;
	}

	/**
	 * @return the aptitudes
	 */
	public Aptitudes getAptitudes() {
		return aptitudes;
	}

	/**
	 * @param aptitudes the aptitudes to set
	 */
	public void setAptitudes(Aptitudes aptitudes) {
		this.aptitudes = aptitudes;
	}

	/**
	 * @return the listeArmementCaC
	 */
	public List<ArmeCaC> getListeArmementCaC() {
		return listeArmementCaC;
	}

	/**
	 * @param listeArmementCaC the listeArmementCaC to set
	 */
	public void setListeArmementCaC(List<ArmeCaC> listeArmementCaC) {
		this.listeArmementCaC = listeArmementCaC;
	}

	/**
	 * @return the listeArmementTir
	 */
	public List<ArmeTir> getListeArmementTir() {
		return listeArmementTir;
	}

	/**
	 * @param listeArmementTir the listeArmementTir to set
	 */
	public void setListeArmementTir(List<ArmeTir> listeArmementTir) {
		this.listeArmementTir = listeArmementTir;
	}

	//
	// /**
	// * @return the competences
	// */
	// public Competences getCompetences() {
	// return competences;
	// }
	//
	// /**
	// * @param competences the competences to set
	// */
	// public void setCompetences(Competences competences) {
	// this.competences = competences;
	// }
}
