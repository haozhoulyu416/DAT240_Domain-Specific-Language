/**
 */
package Manufacture;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Piece</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Manufacture.WorkPiece#getKilogram <em>Kilogram</em>}</li>
 *   <li>{@link Manufacture.WorkPiece#getCubic <em>Cubic</em>}</li>
 *   <li>{@link Manufacture.WorkPiece#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see Manufacture.ManufacturePackage#getWorkPiece()
 * @model
 * @generated
 */
public interface WorkPiece extends Usable {
	/**
	 * Returns the value of the '<em><b>Kilogram</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kilogram</em>' attribute.
	 * @see #setKilogram(int)
	 * @see Manufacture.ManufacturePackage#getWorkPiece_Kilogram()
	 * @model
	 * @generated
	 */
	int getKilogram();

	/**
	 * Sets the value of the '{@link Manufacture.WorkPiece#getKilogram <em>Kilogram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kilogram</em>' attribute.
	 * @see #getKilogram()
	 * @generated
	 */
	void setKilogram(int value);

	/**
	 * Returns the value of the '<em><b>Cubic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cubic</em>' attribute.
	 * @see #setCubic(int)
	 * @see Manufacture.ManufacturePackage#getWorkPiece_Cubic()
	 * @model
	 * @generated
	 */
	int getCubic();

	/**
	 * Sets the value of the '{@link Manufacture.WorkPiece#getCubic <em>Cubic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cubic</em>' attribute.
	 * @see #getCubic()
	 * @generated
	 */
	void setCubic(int value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see Manufacture.ManufacturePackage#getWorkPiece_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link Manufacture.WorkPiece#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // WorkPiece
