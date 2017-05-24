//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.16 at 05:58:11 PM CET 
//

package eu.fbk.das.adaptation.ensemble;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * solver of a role in an ensemble
 * 
 * <p>
 * Java class for Solver complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="Solver">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="issue" type="{http://das.fbk.eu/Ensemble}Issue"/>
 *         &lt;element name="solverCondition" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="solution" type="{http://das.fbk.eu/Ensemble}Solution" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="selected" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Solver", namespace = "http://das.fbk.eu/Ensemble", propOrder = {
		"issue", "solverCondition", "solution" })
public class Solver {

	@XmlElement(required = true)
	protected Issue issue;
	@XmlElement(required = true)
	protected String solverCondition;
	@XmlElement(required = true)
	protected List<Solution> solution;

	public void setSolution(List<Solution> solution) {
		this.solution = solution;
	}

	@XmlAttribute(name = "name")
	protected String name;
	@XmlAttribute(name = "selected", required = true)
	protected boolean selected;

	/**
	 * Gets the value of the issue property.
	 * 
	 * @return possible object is {@link Issue }
	 * 
	 */
	public Issue getIssue() {
		return issue;
	}

	/**
	 * Sets the value of the issue property.
	 * 
	 * @param value
	 *            allowed object is {@link Issue }
	 * 
	 */
	public void setIssue(Issue value) {
		this.issue = value;
	}

	/**
	 * Gets the value of the solverCondition property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSolverCondition() {
		return solverCondition;
	}

	/**
	 * Sets the value of the solverCondition property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSolverCondition(String value) {
		this.solverCondition = value;
	}

	/**
	 * Gets the value of the solution property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the solution property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getSolution().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Solution }
	 * 
	 * 
	 */
	public List<Solution> getSolution() {
		if (solution == null) {
			solution = new ArrayList<Solution>();
		}
		return this.solution;
	}

	/**
	 * Gets the value of the name property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the name property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setName(String value) {
		this.name = value;
	}

	/**
	 * Gets the value of the selected property.
	 * 
	 */
	public boolean isSelected() {
		return selected;
	}

	/**
	 * Sets the value of the selected property.
	 * 
	 */
	public void setSelected(boolean value) {
		this.selected = value;
	}

}
