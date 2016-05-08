/**
 * 
 */
package net.kurse.test.bo.blocs.equip;

import java.util.Set;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

/**
 * @author KaynEKH
 *
 */
@JsonPropertyOrder({ 
	"LIB",
	"TYP",
	"CLASS",
	"DMG",
	"CHR",
	"MUN",
	"PORTEE",
	"CAPAS",
	"NOTES"})
@SuppressWarnings("serial")
public class ArmeTir extends AbstractArme {

	@JsonProperty("CHR")	protected Boolean chargeur;	
	@JsonProperty("MUN")	protected Integer munition;	
	@JsonProperty("PORTEE")	protected Portee portee;
	
	/**
	 * 
	 */
	public ArmeTir() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param libelle
	 * @param type
	 * @param classification
	 * @param valeurDegats
	 * @param notes
	 * @param chargeur
	 * @param munition
	 * @param portee
	 */
	public ArmeTir(String libelle, Integer type, String classification, Integer valeurDegats,
			Boolean chargeur, Integer munition, Portee portee, Set<Integer> capacites, String notes) {
		super(libelle, type, classification, valeurDegats, capacites, notes);
		this.chargeur = chargeur;
		this.munition = munition;
		this.portee = portee;
	}

	/**
	 * @return the chargeur
	 */
	public Boolean getChargeur() {
		return chargeur;
	}

	/**
	 * @param chargeur the chargeur to set
	 */
	public void setChargeur(Boolean chargeur) {
		this.chargeur = chargeur;
	}

	/**
	 * @return the munition
	 */
	public Integer getMunition() {
		return munition;
	}

	/**
	 * @param munition the munition to set
	 */
	public void setMunition(Integer munition) {
		this.munition = munition;
	}

	/**
	 * @return the portee
	 */
	public Portee getPortee() {
		return portee;
	}

	/**
	 * @param portee the portee to set
	 */
	public void setPortee(Portee portee) {
		this.portee = portee;
	}
	
}
