/**
 * 
 */
package thesis.sentence.analysis.common;

/**
 * @author lohuynh
 *
 */
public class Complement {

	private NounPhrase compNN;
	private AdjectivePhrase compAdjPhrase;
	private AdverbPhrase compAdvPhrase;
	private String compForCopularVerb;

	/**
	 * Default Constructor
	 */
	public Complement() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param compNN
	 * @param compAdjPhrase
	 * @param compAdvPhrase
	 * @param compForCopularVerb
	 */
	public Complement(NounPhrase compNN, AdjectivePhrase compAdjPhrase,
			AdverbPhrase compAdvPhrase, String compForCopularVerb) {
		super();
		this.compNN = compNN;
		this.compAdjPhrase = compAdjPhrase;
		this.compAdvPhrase = compAdvPhrase;
		this.compForCopularVerb = compForCopularVerb;
	}

	/**
	 * @return the compNN
	 */
	public NounPhrase getCompNN() {
		return this.compNN;
	}

	/**
	 * @param compNN
	 *            the compNN to set
	 */
	public void setCompNN(NounPhrase compNN) {
		this.compNN = compNN;
	}

	/**
	 * @return the compAdjPhrase
	 */
	public AdjectivePhrase getCompAdjPhrase() {
		return this.compAdjPhrase;
	}

	/**
	 * @param compAdjPhrase
	 *            the compAdjPhrase to set
	 */
	public void setCompAdjPhrase(AdjectivePhrase compAdjPhrase) {
		this.compAdjPhrase = compAdjPhrase;
	}

	/**
	 * @return the compAdvPhrase
	 */
	public AdverbPhrase getCompAdvPhrase() {
		return this.compAdvPhrase;
	}

	/**
	 * @param compAdvPhrase
	 *            the compAdvPhrase to set
	 */
	public void setCompAdvPhrase(AdverbPhrase compAdvPhrase) {
		this.compAdvPhrase = compAdvPhrase;
	}

	/**
	 * @return the compForCopularVerb
	 */
	public String getCompForCopularVerb() {
		return this.compForCopularVerb;
	}

	/**
	 * @param compForCopularVerb
	 *            the compForCopularVerb to set
	 */
	public void setCompForCopularVerb(String compForCopularVerb) {
		this.compForCopularVerb = compForCopularVerb;
	}

}
