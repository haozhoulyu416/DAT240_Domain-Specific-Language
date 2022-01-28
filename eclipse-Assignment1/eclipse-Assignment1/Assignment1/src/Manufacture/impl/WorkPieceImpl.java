/**
 */
package Manufacture.impl;

import Manufacture.ManufacturePackage;
import Manufacture.WorkPiece;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Piece</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Manufacture.impl.WorkPieceImpl#getKilogram <em>Kilogram</em>}</li>
 *   <li>{@link Manufacture.impl.WorkPieceImpl#getCubic <em>Cubic</em>}</li>
 *   <li>{@link Manufacture.impl.WorkPieceImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkPieceImpl extends UsableImpl implements WorkPiece {
	/**
	 * The default value of the '{@link #getKilogram() <em>Kilogram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKilogram()
	 * @generated
	 * @ordered
	 */
	protected static final int KILOGRAM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getKilogram() <em>Kilogram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKilogram()
	 * @generated
	 * @ordered
	 */
	protected int kilogram = KILOGRAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getCubic() <em>Cubic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCubic()
	 * @generated
	 * @ordered
	 */
	protected static final int CUBIC_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCubic() <em>Cubic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCubic()
	 * @generated
	 * @ordered
	 */
	protected int cubic = CUBIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkPieceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManufacturePackage.Literals.WORK_PIECE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getKilogram() {
		return kilogram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKilogram(int newKilogram) {
		int oldKilogram = kilogram;
		kilogram = newKilogram;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManufacturePackage.WORK_PIECE__KILOGRAM, oldKilogram, kilogram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCubic() {
		return cubic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCubic(int newCubic) {
		int oldCubic = cubic;
		cubic = newCubic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManufacturePackage.WORK_PIECE__CUBIC, oldCubic, cubic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManufacturePackage.WORK_PIECE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ManufacturePackage.WORK_PIECE__KILOGRAM:
				return getKilogram();
			case ManufacturePackage.WORK_PIECE__CUBIC:
				return getCubic();
			case ManufacturePackage.WORK_PIECE__TYPE:
				return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ManufacturePackage.WORK_PIECE__KILOGRAM:
				setKilogram((Integer)newValue);
				return;
			case ManufacturePackage.WORK_PIECE__CUBIC:
				setCubic((Integer)newValue);
				return;
			case ManufacturePackage.WORK_PIECE__TYPE:
				setType((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ManufacturePackage.WORK_PIECE__KILOGRAM:
				setKilogram(KILOGRAM_EDEFAULT);
				return;
			case ManufacturePackage.WORK_PIECE__CUBIC:
				setCubic(CUBIC_EDEFAULT);
				return;
			case ManufacturePackage.WORK_PIECE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ManufacturePackage.WORK_PIECE__KILOGRAM:
				return kilogram != KILOGRAM_EDEFAULT;
			case ManufacturePackage.WORK_PIECE__CUBIC:
				return cubic != CUBIC_EDEFAULT;
			case ManufacturePackage.WORK_PIECE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (kilogram: ");
		result.append(kilogram);
		result.append(", cubic: ");
		result.append(cubic);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //WorkPieceImpl
