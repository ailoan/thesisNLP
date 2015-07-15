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
public class VerbPhrase {

	private String aux;
	private int posNeg;
	private String partical;
	private int patternType;
	private Verb verb;
	private List<IndirectObject> indirectObjList = new ArrayList<IndirectObject>();
	private List<DirectObject> directObjList = new ArrayList<DirectObject>();
	private Complement complement;

	/**
	 * Default Constructor
	 */
	public VerbPhrase() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param aux
	 * @param posNeg
	 * @param partical
	 * @param patternType
	 * @param verb
	 * @param indirectObjList
	 * @param directObjList
	 * @param complement
	 */
	public VerbPhrase(String aux, int posNeg, String partical, int patternType,
			Verb verb, List<IndirectObject> indirectObjList,
			List<DirectObject> directObjList, Complement complement) {
		super();
		this.aux = aux;
		this.posNeg = posNeg;
		this.partical = partical;
		this.patternType = patternType;
		this.verb = verb;
		this.indirectObjList = indirectObjList;
		this.directObjList = directObjList;
		this.complement = complement;
	}

	/**
	 * @return the aux
	 */
	public String getAux() {
		return this.aux;
	}

	/**
	 * @param aux
	 *            the aux to set
	 */
	public void setAux(String aux) {
		this.aux = aux;
	}

	/**
	 * @return the posNeg
	 */
	public int getPosNeg() {
		return this.posNeg;
	}

	/**
	 * @param posNeg
	 *            the posNeg to set
	 */
	public void setPosNeg(int posNeg) {
		this.posNeg = posNeg;
	}

	/**
	 * @return the partical
	 */
	public String getPartical() {
		return this.partical;
	}

	/**
	 * @param partical
	 *            the partical to set
	 */
	public void setPartical(String partical) {
		this.partical = partical;
	}

	/**
	 * @return the patternType
	 */
	public int getPatternType() {
		return this.patternType;
	}

	/**
	 * @param patternType
	 *            the patternType to set
	 */
	public void setPatternType(int patternType) {
		this.patternType = patternType;
	}

	/**
	 * @return the verb
	 */
	public Verb getVerb() {
		return this.verb;
	}

	/**
	 * @param verb
	 *            the verb to set
	 */
	public void setVerb(Verb verb) {
		this.verb = verb;
	}

	/**
	 * @return the indirectObjList
	 */
	public List<IndirectObject> getIndirectObjList() {
		return this.indirectObjList;
	}

	/**
	 * @param indirectObjList
	 *            the indirectObjList to set
	 */
	public void setIndirectObjList(List<IndirectObject> indirectObjList) {
		this.indirectObjList = indirectObjList;
	}

	/**
	 * @return the directObjList
	 */
	public List<DirectObject> getDirectObjList() {
		return this.directObjList;
	}

	/**
	 * @param directObjList
	 *            the directObjList to set
	 */
	public void setDirectObjList(List<DirectObject> directObjList) {
		this.directObjList = directObjList;
	}

	/**
	 * @return the complement
	 */
	public Complement getComplement() {
		return this.complement;
	}

	/**
	 * @param complement
	 *            the complement to set
	 */
	public void setComplement(Complement complement) {
		this.complement = complement;
	}

}
