/**
 * 
 */
package thesis.sentence.analysis.common.models;

/**
 * @author lohuynh
 *
 */
public class AdjectivePhrase {

	private String adj;
	private PrepositionalPhrase prepPhrase;
	private AdverbPhrase advPhrase;

	/**
	 * Default
	 */
	public AdjectivePhrase() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param adj
	 * @param prepPhrase
	 * @param advPhrase
	 */
	public AdjectivePhrase(String adj, PrepositionalPhrase prepPhrase,
			AdverbPhrase advPhrase) {
		super();
		this.adj = adj;
		this.prepPhrase = prepPhrase;
		this.advPhrase = advPhrase;
	}

	/**
	 * @return the adj
	 */
	public String getAdj() {
		return this.adj;
	}

	/**
	 * @param adj
	 *            the adj to set
	 */
	public void setAdj(String adj) {
		this.adj = adj;
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
