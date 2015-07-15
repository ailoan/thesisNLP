/**
 * 
 */
package thesis.sentence.analysis.common;

/**
 * @author lohuynh
 *
 */
public class AdverbPhrase {

	private SBAR sbarAdvPhrase;
	private PrepositionalPhrase prepPhrase;
	private NounPhrase nounPhrase;
	private String adv;

	/**
	 * Default Constructor
	 */
	public AdverbPhrase() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param sbarAdvPhrase
	 * @param prepPhrase
	 * @param nounPhrase
	 * @param adv
	 */
	public AdverbPhrase(SBAR sbarAdvPhrase, PrepositionalPhrase prepPhrase,
			NounPhrase nounPhrase, String adv) {
		super();
		this.sbarAdvPhrase = sbarAdvPhrase;
		this.prepPhrase = prepPhrase;
		this.nounPhrase = nounPhrase;
		this.adv = adv;
	}

	/**
	 * @return the sbarAdvPhrase
	 */
	public SBAR getSbarAdvPhrase() {
		return this.sbarAdvPhrase;
	}

	/**
	 * @param sbarAdvPhrase
	 *            the sbarAdvPhrase to set
	 */
	public void setSbarAdvPhrase(SBAR sbarAdvPhrase) {
		this.sbarAdvPhrase = sbarAdvPhrase;
	}

	/**
	 * @return the prepPhrase
	 */
	public PrepositionalPhrase getPrepPhrase() {
		return this.prepPhrase;
	}

	/**
	 * @param prepPhrase
	 *            the prepPhrase to set
	 */
	public void setPrepPhrase(PrepositionalPhrase prepPhrase) {
		this.prepPhrase = prepPhrase;
	}

	/**
	 * @return the nounPhrase
	 */
	public NounPhrase getNounPhrase() {
		return this.nounPhrase;
	}

	/**
	 * @param nounPhrase
	 *            the nounPhrase to set
	 */
	public void setNounPhrase(NounPhrase nounPhrase) {
		this.nounPhrase = nounPhrase;
	}

	/**
	 * @return the adv
	 */
	public String getAdv() {
		return this.adv;
	}

	/**
	 * @param adv
	 *            the adv to set
	 */
	public void setAdv(String adv) {
		this.adv = adv;
	}

}
