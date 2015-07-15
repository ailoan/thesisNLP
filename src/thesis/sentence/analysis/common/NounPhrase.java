/**
 * 
 */
package thesis.sentence.analysis.common;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lohuynh
 * @version 0.1
 */
public class NounPhrase {
	private List<SingleNP> singleNPList = new ArrayList<SingleNP>();
	private String conjunction;
	private SBAR sbarNP;
	private PrepositionalPhrase prepPhrase;

	/**
	 * 
	 */
	public NounPhrase() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param singleNPList
	 * @param conjunction
	 * @param sbarNP
	 * @param prepPhrase
	 */
	public NounPhrase(List<SingleNP> singleNPList, String conjunction,
			SBAR sbarNP, PrepositionalPhrase prepPhrase) {
		super();
		this.singleNPList = singleNPList;
		this.conjunction = conjunction;
		this.sbarNP = sbarNP;
		this.prepPhrase = prepPhrase;
	}

	/**
	 * @return the singleNPList
	 */
	public List<SingleNP> getSingleNPList() {
		return this.singleNPList;
	}

	/**
	 * @param singleNPList
	 *            the singleNPList to set
	 */
	public void setSingleNPList(List<SingleNP> singleNPList) {
		this.singleNPList = singleNPList;
	}

	/**
	 * @return the conjunction
	 */
	public String getConjunction() {
		return this.conjunction;
	}

	/**
	 * @param conjunction
	 *            the conjunction to set
	 */
	public void setConjunction(String conjunction) {
		this.conjunction = conjunction;
	}

	/**
	 * @return the sbarNP
	 */
	public SBAR getSbarNP() {
		return this.sbarNP;
	}

	/**
	 * @param sbarNP
	 *            the sbarNP to set
	 */
	public void setSbarNP(SBAR sbarNP) {
		this.sbarNP = sbarNP;
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

}
