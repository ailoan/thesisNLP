/**
 * 
 */
package thesis.sentence.analysis.common;

/**
 * @author lohuynh
 *
 */
public class AdverbialClause {
	private AdverbPhrase advPhrase;

	/**
	 * 
	 */
	public AdverbialClause() {
		// TODO Auto-generated constructor stub
	}
	

	/**
	 * @param advPhrase
	 */
	public AdverbialClause(AdverbPhrase advPhrase) {
		super();
		this.advPhrase = advPhrase;
	}


	/**
	 * @return the advPhrase
	 */
	public AdverbPhrase getAdvPhrase() {
		return this.advPhrase;
	}

	/**
	 * @param advPhrase
	 *            the advPhrase to set
	 */
	public void setAdvPhrase(AdverbPhrase advPhrase) {
		this.advPhrase = advPhrase;
	}

}
