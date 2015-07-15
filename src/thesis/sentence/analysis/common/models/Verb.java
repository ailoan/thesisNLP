/**
 * 
 */
package thesis.sentence.analysis.common.models;

/**
 * @author lohuynh
 *
 */
public class Verb {

	/**
	 * 
	 */
	private String verbName;
	private int verbForm;
	private int verbVoice;
	private String verbTense;
	private int verbIdx;
	private int verbType;
	private String stemmedVerb;

	public Verb() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param verbName
	 * @param verbForm
	 * @param verbVoice
	 * @param verbTense
	 * @param verbIdx
	 * @param verbType
	 */
	public Verb(String verbName, int verbForm, int verbVoice, String verbTense,
			int verbIdx, int verbType) {
		super();
		this.verbName = verbName;
		this.verbForm = verbForm;
		this.verbVoice = verbVoice;
		this.verbTense = verbTense;
		this.verbIdx = verbIdx;
		this.verbType = verbType;
	}
	
	/**
	 * @param originalVerb
	 * @return
	 */
	public String stemmingVerb(String originalVerb){
		// implement method to stemming Verb
		return this.stemmedVerb;
	}

	/**
	 * @return the verbName
	 */
	public String getVerbName() {
		return this.verbName;
	}

	/**
	 * @param verbName
	 *            the verbName to set
	 */
	public void setVerbName(String verbName) {
		this.verbName = verbName;
	}

	/**
	 * @return the verbForm
	 */
	public int getVerbForm() {
		return this.verbForm;
	}

	/**
	 * @param verbForm
	 *            the verbForm to set
	 */
	public void setVerbForm(int verbForm) {
		this.verbForm = verbForm;
	}

	/**
	 * @return the verbVoice
	 */
	public int getVerbVoice() {
		return this.verbVoice;
	}

	/**
	 * @param verbVoice
	 *            the verbVoice to set
	 */
	public void setVerbVoice(int verbVoice) {
		this.verbVoice = verbVoice;
	}

	/**
	 * @return the verbTense
	 */
	public String getVerbTense() {
		return this.verbTense;
	}

	/**
	 * @param verbTense
	 *            the verbTense to set
	 */
	public void setVerbTense(String verbTense) {
		this.verbTense = verbTense;
	}

	/**
	 * @return the verbIdx
	 */
	public int getVerbIdx() {
		return this.verbIdx;
	}

	/**
	 * @param verbIdx
	 *            the verbIdx to set
	 */
	public void setVerbIdx(int verbIdx) {
		this.verbIdx = verbIdx;
	}

	/**
	 * @return the verbType
	 */
	public int getVerbType() {
		return this.verbType;
	}

	/**
	 * @param verbType
	 *            the verbType to set
	 */
	public void setVerbType(int verbType) {
		this.verbType = verbType;
	}

	/**
	 * @return the stemmedVerb
	 */
	public String getStemmedVerb() {
		return this.stemmedVerb;
	}

}
