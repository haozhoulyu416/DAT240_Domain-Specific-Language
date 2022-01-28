/**
 */
package Manufacture;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Manufacture.Step#getProduces <em>Produces</em>}</li>
 *   <li>{@link Manufacture.Step#getSpeed <em>Speed</em>}</li>
 *   <li>{@link Manufacture.Step#getPerson <em>Person</em>}</li>
 *   <li>{@link Manufacture.Step#getUses <em>Uses</em>}</li>
 * </ul>
 *
 * @see Manufacture.ManufacturePackage#getStep()
 * @model
 * @generated
 */
public interface Step extends EObject {
	/**
	 * Returns the value of the '<em><b>Produces</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Produces</em>' reference.
	 * @see #setProduces(IntermediateProduct)
	 * @see Manufacture.ManufacturePackage#getStep_Produces()
	 * @model
	 * @generated
	 */
	IntermediateProduct getProduces();

	/**
	 * Sets the value of the '{@link Manufacture.Step#getProduces <em>Produces</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Produces</em>' reference.
	 * @see #getProduces()
	 * @generated
	 */
	void setProduces(IntermediateProduct value);

	/**
	 * Returns the value of the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed</em>' attribute.
	 * @see #setSpeed(float)
	 * @see Manufacture.ManufacturePackage#getStep_Speed()
	 * @model ordered="false"
	 * @generated
	 */
	float getSpeed();

	/**
	 * Sets the value of the '{@link Manufacture.Step#getSpeed <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' attribute.
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(float value);

	/**
	 * Returns the value of the '<em><b>Person</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' attribute.
	 * @see #setPerson(String)
	 * @see Manufacture.ManufacturePackage#getStep_Person()
	 * @model
	 * @generated
	 */
	String getPerson();

	/**
	 * Sets the value of the '{@link Manufacture.Step#getPerson <em>Person</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person</em>' attribute.
	 * @see #getPerson()
	 * @generated
	 */
	void setPerson(String value);

	/**
	 * Returns the value of the '<em><b>Uses</b></em>' reference list.
	 * The list contents are of type {@link Manufacture.MaterialConditioner}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses</em>' reference list.
	 * @see Manufacture.ManufacturePackage#getStep_Uses()
	 * @model
	 * @generated
	 */
	EList<MaterialConditioner> getUses();

} // Step
