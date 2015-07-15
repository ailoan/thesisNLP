/**
 * 
 */
package thesis.sentence.analysis.common;

/**
 * @author lohuynh
 *
 */
public class SBAR {
	private Subject subj;
	private Predicate predicateSbar;
	private String subordinator;
	private int typeSbar;

	/**
	 * 
	 */
	public SBAR() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param subj
	 * @param predicateSbar
	 * @param subordinator
	 */
	public SBAR(Subject subj, Predicate predicateSbar, String subordinator) {
		super();
		this.subj = subj;
		this.predicateSbar = predicateSbar;
		this.subordinator = subordinator;
	}

	/**
	 * @return the subj
	 */
	public Subject getSubj() {
		return this.subj;
	}

	/**
	 * @param subj
	 *            the subj to set
	 */
	public void setSubj(Subject subj) {
		this.subj = subj;
	}

	/**
	 * @return the predicateSbar
	 */
	public Predicate getPredicateSbar() {
		return this.predicateSbar;
	}

	/**
	 * @param predicateSbar
	 *            the predicateSbar to set
	 */
	public void setPredicateSbar(Predicate predicateSbar) {
		this.predicateSbar = predicateSbar;
	}

	/**
	 * @return the subordinator
	 */
	public String getSubordinator() {
		return this.subordinator;
	}

	/**
	 * @param subordinator
	 *            the subordinator to set
	 */
	public void setSubordinator(String subordinator) {
		this.subordinator = subordinator;
	}

	/**
	 * @return the typeSbar
	 */
	public int getTypeSbar() {
		return this.typeSbar;
	}

	/**
	 * @param typeSbar
	 *            the typeSbar to set
	 */
	public void setTypeSbar(int typeSbar) {
		this.typeSbar = typeSbar;
	}

}
