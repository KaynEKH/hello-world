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
		"VIG",
		"SOM",
		"ADA",
		"COG",
		"EGO",
		"CON"})
@SuppressWarnings("serial")
public class Caracs implements Serializable {

	@JsonProperty("VIG") private Integer vigueur;
	@JsonProperty("SOM") private Integer somatique;
	@JsonProperty("ADA") private Integer adaptabilite;
	@JsonProperty("COG") private Integer cognition;
	@JsonProperty("EGO") private Integer ego;
	@JsonProperty("CON") private Integer conscience;
	
	public Caracs() {
		
	}

	/**
	 * @param vigueur
	 * @param somatique
	 * @param adaptabilite
	 * @param cognition
	 * @param ego
	 * @param conscience
	 */
	public Caracs(Integer vigueur, Integer somatique, Integer adaptabilite, Integer cognition, Integer ego,
			Integer conscience) {
		this.vigueur = vigueur;
		this.somatique = somatique;
		this.adaptabilite = adaptabilite;
		this.cognition = cognition;
		this.ego = ego;
		this.conscience = conscience;
	}

	/**
	 * @return the vigueur
	 */
	public Integer getVigueur() {
		return vigueur;
	}

	/**
	 * @param vigueur the vigueur to set
	 */
	public void setVigueur(Integer vigueur) {
		this.vigueur = vigueur;
	}

	/**
	 * @return the somatique
	 */
	public Integer getSomatique() {
		return somatique;
	}

	/**
	 * @param somatique the somatique to set
	 */
	public void setSomatique(Integer somatique) {
		this.somatique = somatique;
	}

	/**
	 * @return the adaptabilite
	 */
	public Integer getAdaptabilite() {
		return adaptabilite;
	}

	/**
	 * @param adaptabilite the adaptabilite to set
	 */
	public void setAdaptabilite(Integer adaptabilite) {
		this.adaptabilite = adaptabilite;
	}

	/**
	 * @return the cognition
	 */
	public Integer getCognition() {
		return cognition;
	}

	/**
	 * @param cognition the cognition to set
	 */
	public void setCognition(Integer cognition) {
		this.cognition = cognition;
	}

	/**
	 * @return the ego
	 */
	public Integer getEgo() {
		return ego;
	}

	/**
	 * @param ego the ego to set
	 */
	public void setEgo(Integer ego) {
		this.ego = ego;
	}

	/**
	 * @return the conscience
	 */
	public Integer getConscience() {
		return conscience;
	}

	/**
	 * @param conscience the conscience to set
	 */
	public void setConscience(Integer conscience) {
		this.conscience = conscience;
	}
	
}
