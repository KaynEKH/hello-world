/**
 * 
 */
package net.kurse.test.bo.blocs.equip;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author KaynEKH
 *
 */
@SuppressWarnings("serial")
public abstract class AbstractEquipement implements Serializable {

	@JsonProperty("LIB") protected String libelle;
	@JsonProperty("TYP") protected Integer type;
	@JsonProperty("NOTES") protected String notes;
	
	public AbstractEquipement() {
		// TODO Auto-generated constructor stub
	}

	
	/**
	 * @param libelle
	 * @param type
	 * @param notes
	 */
	public AbstractEquipement(String libelle, Integer type, String notes) {
		super();
		this.libelle = libelle;
		this.type = type;
		this.notes = notes;
	}

	/**
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	/**
	 * @return the type
	 */
	public Integer getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(Integer type) {
		this.type = type;
	}

	/**
	 * @return the notes
	 */
	public String getNotes() {
		return notes;
	}

	/**
	 * @param notes the notes to set
	 */
	public void setNotes(String notes) {
		this.notes = notes;
	}
		
}
