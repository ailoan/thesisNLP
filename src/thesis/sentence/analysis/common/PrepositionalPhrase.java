/**
 * 
 */
package thesis.sentence.analysis.common;

/**
 * @author lohuynh
 *
 */
public class PrepositionalPhrase {
	private String adj;
	private NounPhrase nounPhrase;
	private SBAR sbarPrepPhrase;
	private int firstIdx;

	/**
	 * 
	 */
	public PrepositionalPhrase() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param adj
	 * @param nounPhrase
	 * @param sbarPrepPhrase
	 */
	public PrepositionalPhrase(String adj, NounPhrase nounPhrase,
			SBAR sbarPrepPhrase) {
		super();
		this.adj = adj;
		this.nounPhrase = nounPhrase;
		this.sbarPrepPhrase = sbarPrepPhrase;
	}

	/**
	 * @param adj
	 * @param nounPhrase
	 * @param sbarPrepPhrase
	 * @param firstIdx
	 */
	public PrepositionalPhrase(String adj, NounPhrase nounPhrase,
			SBAR sbarPrepPhrase, int firstIdx) {
		super();
		this.adj = adj;
		this.nounPhrase = nounPhrase;
		this.sbarPrepPhrase = sbarPrepPhrase;
		this.firstIdx = firstIdx;
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
	 * @return the sbarPrepPhrase
	 */
	public SBAR getSbarPrepPhrase() {
		return this.sbarPrepPhrase;
	}

	/**
	 * @param sbarPrepPhrase
	 *            the sbarPrepPhrase to set
	 */
	public void setSbarPrepPhrase(SBAR sbarPrepPhrase) {
		this.sbarPrepPhrase = sbarPrepPhrase;
	}

	/**
	 * @return the firstIdx
	 */
	public int getFirstIdx() {
		return this.firstIdx;
	}

	/**
	 * @param firstIdx
	 *            the firstIdx to set
	 */
	public void setFirstIdx(int firstIdx) {
		this.firstIdx = firstIdx;
	}

}
