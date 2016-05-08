/**
 * 
 */
package net.kurse.test.bo.blocs.equip;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

/**
 * @author KaynEKH
 *
 */
@JsonPropertyOrder({ 
	"COURT",
	"MOYEN",
	"LONG",
	"XTREM"})
@SuppressWarnings("serial")
public class Portee implements Serializable {

	@JsonProperty("COURT")	private Integer pcourt;
	@JsonProperty("MOYEN")	private Integer pmoyen;
	@JsonProperty("LONG")	private Integer plong;
	@JsonProperty("XTREM")	private Integer pxtrem;
	
	public Portee() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param pcourt
	 * @param pmoyen
	 * @param plong
	 * @param pxtrem
	 */
	public Portee(Integer pcourt, Integer pmoyen, Integer plong, Integer pxtrem) {
		this.pcourt = pcourt;
		this.pmoyen = pmoyen;
		this.plong = plong;
		this.pxtrem = pxtrem;
	}

	/**
	 * @return the pcourt
	 */
	public Integer getPcourt() {
		return pcourt;
	}

	/**
	 * @param pcourt the pcourt to set
	 */
	public void setPcourt(Integer pcourt) {
		this.pcourt = pcourt;
	}

	/**
	 * @return the pmoyen
	 */
	public Integer getPmoyen() {
		return pmoyen;
	}

	/**
	 * @param pmoyen the pmoyen to set
	 */
	public void setPmoyen(Integer pmoyen) {
		this.pmoyen = pmoyen;
	}

	/**
	 * @return the plong
	 */
	public Integer getPlong() {
		return plong;
	}

	/**
	 * @param plong the plong to set
	 */
	public void setPlong(Integer plong) {
		this.plong = plong;
	}

	/**
	 * @return the pxtrem
	 */
	public Integer getPxtrem() {
		return pxtrem;
	}

	/**
	 * @param pxtrem the pxtrem to set
	 */
	public void setPxtrem(Integer pxtrem) {
		this.pxtrem = pxtrem;
	}
	
}
