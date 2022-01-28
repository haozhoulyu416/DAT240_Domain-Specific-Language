/**
 */
package Manufacture;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manu System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Manufacture.ManuSystem#getFirstStep <em>First Step</em>}</li>
 *   <li>{@link Manufacture.ManuSystem#getIntermediateproducts <em>Intermediateproducts</em>}</li>
 *   <li>{@link Manufacture.ManuSystem#getWorkpiece <em>Workpiece</em>}</li>
 *   <li>{@link Manufacture.ManuSystem#getStorage <em>Storage</em>}</li>
 *   <li>{@link Manufacture.ManuSystem#getMaterialconditioner <em>Materialconditioner</em>}</li>
 * </ul>
 *
 * @see Manufacture.ManufacturePackage#getManuSystem()
 * @model
 * @generated
 */
public interface ManuSystem extends NamedElement {
	/**
	 * Returns the value of the '<em><b>First Step</b></em>' containment reference list.
	 * The list contents are of type {@link Manufacture.Step}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Step</em>' containment reference list.
	 * @see Manufacture.ManufacturePackage#getManuSystem_FirstStep()
	 * @model containment="true"
	 * @generated
	 */
	EList<Step> getFirstStep();

	/**
	 * Returns the value of the '<em><b>Intermediateproducts</b></em>' containment reference list.
	 * The list contents are of type {@link Manufacture.IntermediateProduct}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intermediateproducts</em>' containment reference list.
	 * @see Manufacture.ManufacturePackage#getManuSystem_Intermediateproducts()
	 * @model containment="true"
	 * @generated
	 */
	EList<IntermediateProduct> getIntermediateproducts();

	/**
	 * Returns the value of the '<em><b>Workpiece</b></em>' containment reference list.
	 * The list contents are of type {@link Manufacture.WorkPiece}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workpiece</em>' containment reference list.
	 * @see Manufacture.ManufacturePackage#getManuSystem_Workpiece()
	 * @model containment="true"
	 * @generated
	 */
	EList<WorkPiece> getWorkpiece();

	/**
	 * Returns the value of the '<em><b>Storage</b></em>' containment reference list.
	 * The list contents are of type {@link Manufacture.Storage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage</em>' containment reference list.
	 * @see Manufacture.ManufacturePackage#getManuSystem_Storage()
	 * @model containment="true"
	 * @generated
	 */
	EList<Storage> getStorage();

	/**
	 * Returns the value of the '<em><b>Materialconditioner</b></em>' containment reference list.
	 * The list contents are of type {@link Manufacture.MaterialConditioner}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Materialconditioner</em>' containment reference list.
	 * @see Manufacture.ManufacturePackage#getManuSystem_Materialconditioner()
	 * @model containment="true"
	 * @generated
	 */
	EList<MaterialConditioner> getMaterialconditioner();

} // ManuSystem
