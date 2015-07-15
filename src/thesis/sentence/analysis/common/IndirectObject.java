/**
 * 
 */
package thesis.sentence.analysis.common;

/**
 * @author lohuynh
 *
 */
public class IndirectObject {

	private NounPhrase nounphraseIO;
	private SBAR vsbarIO;
	private String pronounIO;

	/**
	 * Default Constructor
	 */
	public IndirectObject() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nounphraseIO
	 * @param vsbarIO
	 * @param pronounIO
	 */
	public IndirectObject(NounPhrase nounphraseIO, SBAR vsbarIO,
			String pronounIO) {
		super();
		this.nounphraseIO = nounphraseIO;
		this.vsbarIO = vsbarIO;
		this.pronounIO = pronounIO;
	}

	/**
	 * @return the nounphraseIO
	 */
	public NounPhrase getNounphraseIO() {
		return this.nounphraseIO;
	}

	/**
	 * @param nounphraseIO
	 *            the nounphraseIO to set
	 */
	public void setNounphraseIO(NounPhrase nounphraseIO) {
		this.nounphraseIO = nounphraseIO;
	}

	/**
	 * @return the vsbarIO
	 */
	public SBAR getVsbarIO() {
		return this.vsbarIO;
	}

	/**
	 * @param vsbarIO
	 *            the vsbarIO to set
	 */
	public void setVsbarIO(SBAR vsbarIO) {
		this.vsbarIO = vsbarIO;
	}

	/**
	 * @return the pronounIO
	 */
	public String getPronounIO() {
		return this.pronounIO;
	}

	/**
	 * @param pronounIO
	 *            the pronounIO to set
	 */
	public void setPronounIO(String pronounIO) {
		this.pronounIO = pronounIO;
	}

}
