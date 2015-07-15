/**
 * 
 */
package thesis.sentence.analysis.common;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lohuynh
 *
 */
public class Predicate {
	private List<VerbPhrase> vpList = new ArrayList<VerbPhrase>();
	private PrepositionalPhrase prepPhrase;
	private String refSubj;
	private String adv;

	/**
	 * 
	 */
	public Predicate() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param vpList
	 * @param prepPhrase
	 * @param refSubj
	 * @param adv
	 */
	public Predicate(List<VerbPhrase> vpList, PrepositionalPhrase prepPhrase,
			String refSubj, String adv) {
		super();
		this.vpList = vpList;
		this.prepPhrase = prepPhrase;
		this.refSubj = refSubj;
		this.adv = adv;
	}

	/**
	 * @return the vpList
	 */
	public List<VerbPhrase> getVpList() {
		return this.vpList;
	}

	/**
	 * @param vpList
	 *            the vpList to set
	 */
	public void setVpList(List<VerbPhrase> vpList) {
		this.vpList = vpList;
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
	 * @return the refSubj
	 */
	public String getRefSubj() {
		return this.refSubj;
	}

	/**
	 * @param refSubj
	 *            the refSubj to set
	 */
	public void setRefSubj(String refSubj) {
		this.refSubj = refSubj;
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
