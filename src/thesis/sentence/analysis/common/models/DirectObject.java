/**
 * 
 */
package thesis.sentence.analysis.common.models;

/**
 * @author lohuynh
 *
 */
public class DirectObject {

	private NounPhrase nounphraseDO;
	private SBAR vsbarDO;
	private String pronounDO;

	/**
	 * Default Constructor
	 */
	public DirectObject() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the nounphraseDO
	 */
	public NounPhrase getNounphraseDO() {
		return this.nounphraseDO;
	}

	/**
	 * @param nounphraseDO
	 *            the nounphraseDO to set
	 */
	public void setNounphraseDO(NounPhrase nounphraseDO) {
		this.nounphraseDO = nounphraseDO;
	}

	/**
	 * @return the vsbarDO
	 */
	public SBAR getVsbarDO() {
		return this.vsbarDO;
	}

	/**
	 * @param vsbarDO
	 *            the vsbarDO to set
	 */
	public void setVsbarDO(SBAR vsbarDO) {
		this.vsbarDO = vsbarDO;
	}

	/**
	 * @return the pronounDO
	 */
	public String getPronounDO() {
		return this.pronounDO;
	}

	/**
	 * @param pronounDO
	 *            the pronounDO to set
	 */
	public void setPronounDO(String pronounDO) {
		this.pronounDO = pronounDO;
	}

	/**
	 * @param nounphraseDO
	 * @param vsbarDO
	 * @param pronounDO
	 */
	public DirectObject(NounPhrase nounphraseDO, SBAR vsbarDO, String pronounDO) {
		super();
		this.nounphraseDO = nounphraseDO;
		this.vsbarDO = vsbarDO;
		this.pronounDO = pronounDO;
	}

}
