/**
 * 
 */
package net.kurse.test.bo.blocs.equip;

import java.util.Set;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author KaynEKH
 *
 */
@SuppressWarnings("serial")
public abstract class AbstractArme extends AbstractEquipement {

	@JsonProperty("CLASS")	protected String classification;	
	@JsonProperty("DMG")	protected Integer valeurDegats;
	@JsonProperty("CAPAS")	protected Set<Integer> capacites;
	
	/**
	 * 
	 */
	public AbstractArme() {
		super();
	}

	/**
	 * @param libelle
	 * @param type
	 * @param notes
	 * @param classification
	 * @param valeurDegats
	 */
	public AbstractArme(String libelle, Integer type, String classification, Integer valeurDegats, Set<Integer> capacites, String notes) {
		super(libelle, type, notes);
		this.classification = classification;
		this.valeurDegats = valeurDegats;
		this.capacites = capacites;
	}

	/**
	 * @return the classification
	 */
	public String getClassification() {
		return classification;
	}

	/**
	 * @param classification the classification to set
	 */
	public void setClassification(String classification) {
		this.classification = classification;
	}

	/**
	 * @return the valeurDegats
	 */
	public Integer getValeurDegats() {
		return valeurDegats;
	}

	/**
	 * @param valeurDegats the valeurDegats to set
	 */
	public void setValeurDegats(Integer valeurDegats) {
		this.valeurDegats = valeurDegats;
	}

	/**
	 * @return the capacites
	 */
	public Set<Integer> getCapacites() {
		return capacites;
	}

	/**
	 * @param capacites the capacites to set
	 */
	public void setCapacites(Set<Integer> capacites) {
		this.capacites = capacites;
	}
	
}
