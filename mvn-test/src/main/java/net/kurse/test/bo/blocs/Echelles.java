package net.kurse.test.bo.blocs;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

@JsonPropertyOrder({ 
	"COR",
	"ESP",
	"AME"})
@SuppressWarnings("serial")
public class Echelles implements Serializable {

	@JsonProperty("COR") private Integer corps;
	@JsonProperty("ESP") private Integer esprit;
	@JsonProperty("AME") private Integer ame;
	
	public Echelles() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param corps
	 * @param esprit
	 * @param ame
	 */
	public Echelles(Integer corps, Integer esprit, Integer ame) {
		this.corps = corps;
		this.esprit = esprit;
		this.ame = ame;
	}

	/**
	 * @return the corps
	 */
	public Integer getCorps() {
		return corps;
	}

	/**
	 * @param corps the corps to set
	 */
	public void setCorps(Integer corps) {
		this.corps = corps;
	}

	/**
	 * @return the esprit
	 */
	public Integer getEsprit() {
		return esprit;
	}

	/**
	 * @param esprit the esprit to set
	 */
	public void setEsprit(Integer esprit) {
		this.esprit = esprit;
	}

	/**
	 * @return the ame
	 */
	public Integer getAme() {
		return ame;
	}

	/**
	 * @param ame the ame to set
	 */
	public void setAme(Integer ame) {
		this.ame = ame;
	}
	
}
