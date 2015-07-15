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
public class Subject {
	private List<NounPhrase> npList = new ArrayList<NounPhrase>();
	private SBAR sbarSubj;
	private int subjVoice;

	/**
	 * 
	 */
	public Subject() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param npList
	 * @param sbarSubj
	 * @param subjVoice
	 */
	public Subject(List<NounPhrase> npList, SBAR sbarSubj, int subjVoice) {
		super();
		this.npList = npList;
		this.sbarSubj = sbarSubj;
		this.subjVoice = subjVoice;
	}

	/**
	 * @return the npList
	 */
	public List<NounPhrase> getNpList() {
		return this.npList;
	}

	/**
	 * @param npList
	 *            the npList to set
	 */
	public void setNpList(List<NounPhrase> npList) {
		this.npList = npList;
	}

	/**
	 * @return the sbarSubj
	 */
	public SBAR getSbarSubj() {
		return this.sbarSubj;
	}

	/**
	 * @param sbarSubj
	 *            the sbarSubj to set
	 */
	public void setSbarSubj(SBAR sbarSubj) {
		this.sbarSubj = sbarSubj;
	}

	/**
	 * @return the subjVoice
	 */
	public int getSubjVoice() {
		return this.subjVoice;
	}

	/**
	 * @param subjVoice
	 *            the subjVoice to set
	 */
	public void setSubjVoice(int subjVoice) {
		this.subjVoice = subjVoice;
	}

}
