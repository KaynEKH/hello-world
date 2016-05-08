/**
 * 
 */
package net.kurse.test.bo.blocs;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

/**
 * @author KaynEKH
 *
 */
@JsonPropertyOrder({ 
	"MEL",
	"TIR",
	"PHY",
	"SBT",
	"PIL",
	"TEC",
	"ACU",
	"COM"})
@SuppressWarnings("serial")
public class Aptitudes implements Serializable {

	@JsonProperty("MEL") private Integer melee;
	@JsonProperty("TIR") private Integer tir;
	@JsonProperty("PHY") private Integer physique;
	@JsonProperty("SBT") private Integer subtilite;
	@JsonProperty("PIL") private Integer pilotage;
	@JsonProperty("TEC") private Integer technique;
	@JsonProperty("ACU") private Integer acuite;
	@JsonProperty("COM") private Integer communication;
	
	public Aptitudes() {

	}

	/**
	 * @param melee
	 * @param tir
	 * @param physique
	 * @param subtilite
	 * @param pilotage
	 * @param technique
	 * @param acuite
	 * @param communication
	 */
	public Aptitudes(Integer melee, Integer tir, Integer physique, Integer subtilite, Integer pilotage, Integer technique, Integer acuite,
			Integer communication) {
		this.melee = melee;
		this.tir = tir;
		this.physique = physique;
		this.subtilite = subtilite;
		this.pilotage = pilotage;
		this.technique = technique;
		this.acuite = acuite;
		this.communication = communication;
	}
	
	/**
	 * @param caracs
	 */
	public Aptitudes(Caracs caracs) {
		this.melee = caracs.getSomatique() + caracs.getEgo();
		this.tir = caracs.getSomatique() + caracs.getConscience();
		this.physique = caracs.getSomatique() + caracs.getVigueur();
		this.subtilite = caracs.getAdaptabilite() + caracs.getConscience();
		this.pilotage = caracs.getSomatique() + caracs.getCognition();
		this.communication = caracs.getAdaptabilite() + caracs.getEgo();
		this.acuite = caracs.getConscience() + caracs.getAdaptabilite();
		this.technique = caracs.getCognition() + caracs.getConscience();
	}

	/**
	 * @return the melee
	 */
	public Integer getMelee() {
		return melee;
	}

	/**
	 * @param melee the melee to set
	 */
	public void setMelee(Integer melee) {
		this.melee = melee;
	}

	/**
	 * @return the tir
	 */
	public Integer getTir() {
		return tir;
	}

	/**
	 * @param tir the tir to set
	 */
	public void setTir(Integer tir) {
		this.tir = tir;
	}

	/**
	 * @return the physique
	 */
	public Integer getPhysique() {
		return physique;
	}

	/**
	 * @param physique the physique to set
	 */
	public void setPhysique(Integer physique) {
		this.physique = physique;
	}

	/**
	 * @return the subtilite
	 */
	public Integer getSubtilite() {
		return subtilite;
	}

	/**
	 * @param subtilite the subtilite to set
	 */
	public void setSubtilite(Integer subtilite) {
		this.subtilite = subtilite;
	}

	/**
	 * @return the pilotage
	 */
	public Integer getPilotage() {
		return pilotage;
	}

	/**
	 * @param pilotage the pilotage to set
	 */
	public void setPilotage(Integer pilotage) {
		this.pilotage = pilotage;
	}

	/**
	 * @return the technique
	 */
	public Integer getTechnique() {
		return technique;
	}

	/**
	 * @param technique the technique to set
	 */
	public void setTechnique(Integer technique) {
		this.technique = technique;
	}

	/**
	 * @return the acuite
	 */
	public Integer getAcuite() {
		return acuite;
	}

	/**
	 * @param acuite the acuite to set
	 */
	public void setAcuite(Integer acuite) {
		this.acuite = acuite;
	}

	/**
	 * @return the communication
	 */
	public Integer getCommunication() {
		return communication;
	}

	/**
	 * @param communication the communication to set
	 */
	public void setCommunication(Integer communication) {
		this.communication = communication;
	}
	
}
