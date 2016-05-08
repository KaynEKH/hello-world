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
	"ALL",
	"CAPAS",
	"NOTES"})
@SuppressWarnings("serial")
public class ArmeCaC extends AbstractArme {

	@JsonProperty("ALL")	protected Integer allonge;	
	
	/**
	 * 
	 */
	public ArmeCaC() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param libelle
	 * @param type
	 * @param classification
	 * @param valeurDegats
	 * @param notes
	 * @param allonge
	 */
	public ArmeCaC(String libelle, Integer type, String classification, Integer valeurDegats, Integer allonge, Set<Integer> capacites, String notes) {
		super(libelle, type, classification, valeurDegats, capacites, notes);
		this.allonge = allonge;
	}

	/**
	 * @return the allonge
	 */
	public Integer getAllonge() {
		return allonge;
	}

	/**
	 * @param allonge the allonge to set
	 */
	public void setAllonge(Integer allonge) {
		this.allonge = allonge;
	}
	
}
