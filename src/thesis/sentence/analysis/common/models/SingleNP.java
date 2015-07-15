/**
 * 
 */
package thesis.sentence.analysis.common.models;

/**
 * @author lohuynh
 *
 */
public class SingleNP {
	private String headNoun;
	private String premodifier;
	private String determier;
	private int headNounIdx;

	/**
	 * 
	 */
	public SingleNP() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param headNoun
	 * @param premodifier
	 * @param determier
	 * @param headNounIdx
	 */
	public SingleNP(String headNoun, String premodifier, String determier,
			int headNounIdx) {
		super();
		this.headNoun = headNoun;
		this.premodifier = premodifier;
		this.determier = determier;
		this.headNounIdx = headNounIdx;
	}

	/**
	 * @return the headNoun
	 */
	public String getHeadNoun() {
		return this.headNoun;
	}

	/**
	 * @param headNoun
	 *            the headNoun to set
	 */
	public void setHeadNoun(String headNoun) {
		this.headNoun = headNoun;
	}

	/**
	 * @return the premodifier
	 */
	public String getPremodifier() {
		return this.premodifier;
	}

	/**
	 * @param premodifier
	 *            the premodifier to set
	 */
	public void setPremodifier(String premodifier) {
		this.premodifier = premodifier;
	}

	/**
	 * @return the determier
	 */
	public String getDetermier() {
		return this.determier;
	}

	/**
	 * @param determier
	 *            the determier to set
	 */
	public void setDetermier(String determier) {
		this.determier = determier;
	}

	/**
	 * @return the headNounIdx
	 */
	public int getHeadNounIdx() {
		return this.headNounIdx;
	}

	/**
	 * @param headNounIdx
	 *            the headNounIdx to set
	 */
	public void setHeadNounIdx(int headNounIdx) {
		this.headNounIdx = headNounIdx;
	}

}
