/**
 */
package Manufacture.impl;

import Manufacture.IntermediateProduct;
import Manufacture.ManuSystem;
import Manufacture.ManufacturePackage;
import Manufacture.MaterialConditioner;
import Manufacture.Step;
import Manufacture.Storage;
import Manufacture.WorkPiece;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manu System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Manufacture.impl.ManuSystemImpl#getFirstStep <em>First Step</em>}</li>
 *   <li>{@link Manufacture.impl.ManuSystemImpl#getIntermediateproducts <em>Intermediateproducts</em>}</li>
 *   <li>{@link Manufacture.impl.ManuSystemImpl#getWorkpiece <em>Workpiece</em>}</li>
 *   <li>{@link Manufacture.impl.ManuSystemImpl#getStorage <em>Storage</em>}</li>
 *   <li>{@link Manufacture.impl.ManuSystemImpl#getMaterialconditioner <em>Materialconditioner</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ManuSystemImpl extends NamedElementImpl implements ManuSystem {
	/**
	 * The cached value of the '{@link #getFirstStep() <em>First Step</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstStep()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> firstStep;

	/**
	 * The cached value of the '{@link #getIntermediateproducts() <em>Intermediateproducts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntermediateproducts()
	 * @generated
	 * @ordered
	 */
	protected EList<IntermediateProduct> intermediateproducts;

	/**
	 * The cached value of the '{@link #getWorkpiece() <em>Workpiece</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkpiece()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkPiece> workpiece;

	/**
	 * The cached value of the '{@link #getStorage() <em>Storage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorage()
	 * @generated
	 * @ordered
	 */
	protected EList<Storage> storage;

	/**
	 * The cached value of the '{@link #getMaterialconditioner() <em>Materialconditioner</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterialconditioner()
	 * @generated
	 * @ordered
	 */
	protected EList<MaterialConditioner> materialconditioner;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManuSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManufacturePackage.Literals.MANU_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Step> getFirstStep() {
		if (firstStep == null) {
			firstStep = new EObjectContainmentEList<Step>(Step.class, this, ManufacturePackage.MANU_SYSTEM__FIRST_STEP);
		}
		return firstStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntermediateProduct> getIntermediateproducts() {
		if (intermediateproducts == null) {
			intermediateproducts = new EObjectContainmentEList<IntermediateProduct>(IntermediateProduct.class, this, ManufacturePackage.MANU_SYSTEM__INTERMEDIATEPRODUCTS);
		}
		return intermediateproducts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkPiece> getWorkpiece() {
		if (workpiece == null) {
			workpiece = new EObjectContainmentEList<WorkPiece>(WorkPiece.class, this, ManufacturePackage.MANU_SYSTEM__WORKPIECE);
		}
		return workpiece;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Storage> getStorage() {
		if (storage == null) {
			storage = new EObjectContainmentEList<Storage>(Storage.class, this, ManufacturePackage.MANU_SYSTEM__STORAGE);
		}
		return storage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MaterialConditioner> getMaterialconditioner() {
		if (materialconditioner == null) {
			materialconditioner = new EObjectContainmentEList<MaterialConditioner>(MaterialConditioner.class, this, ManufacturePackage.MANU_SYSTEM__MATERIALCONDITIONER);
		}
		return materialconditioner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ManufacturePackage.MANU_SYSTEM__FIRST_STEP:
				return ((InternalEList<?>)getFirstStep()).basicRemove(otherEnd, msgs);
			case ManufacturePackage.MANU_SYSTEM__INTERMEDIATEPRODUCTS:
				return ((InternalEList<?>)getIntermediateproducts()).basicRemove(otherEnd, msgs);
			case ManufacturePackage.MANU_SYSTEM__WORKPIECE:
				return ((InternalEList<?>)getWorkpiece()).basicRemove(otherEnd, msgs);
			case ManufacturePackage.MANU_SYSTEM__STORAGE:
				return ((InternalEList<?>)getStorage()).basicRemove(otherEnd, msgs);
			case ManufacturePackage.MANU_SYSTEM__MATERIALCONDITIONER:
				return ((InternalEList<?>)getMaterialconditioner()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ManufacturePackage.MANU_SYSTEM__FIRST_STEP:
				return getFirstStep();
			case ManufacturePackage.MANU_SYSTEM__INTERMEDIATEPRODUCTS:
				return getIntermediateproducts();
			case ManufacturePackage.MANU_SYSTEM__WORKPIECE:
				return getWorkpiece();
			case ManufacturePackage.MANU_SYSTEM__STORAGE:
				return getStorage();
			case ManufacturePackage.MANU_SYSTEM__MATERIALCONDITIONER:
				return getMaterialconditioner();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ManufacturePackage.MANU_SYSTEM__FIRST_STEP:
				getFirstStep().clear();
				getFirstStep().addAll((Collection<? extends Step>)newValue);
				return;
			case ManufacturePackage.MANU_SYSTEM__INTERMEDIATEPRODUCTS:
				getIntermediateproducts().clear();
				getIntermediateproducts().addAll((Collection<? extends IntermediateProduct>)newValue);
				return;
			case ManufacturePackage.MANU_SYSTEM__WORKPIECE:
				getWorkpiece().clear();
				getWorkpiece().addAll((Collection<? extends WorkPiece>)newValue);
				return;
			case ManufacturePackage.MANU_SYSTEM__STORAGE:
				getStorage().clear();
				getStorage().addAll((Collection<? extends Storage>)newValue);
				return;
			case ManufacturePackage.MANU_SYSTEM__MATERIALCONDITIONER:
				getMaterialconditioner().clear();
				getMaterialconditioner().addAll((Collection<? extends MaterialConditioner>)newValue);
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
			case ManufacturePackage.MANU_SYSTEM__FIRST_STEP:
				getFirstStep().clear();
				return;
			case ManufacturePackage.MANU_SYSTEM__INTERMEDIATEPRODUCTS:
				getIntermediateproducts().clear();
				return;
			case ManufacturePackage.MANU_SYSTEM__WORKPIECE:
				getWorkpiece().clear();
				return;
			case ManufacturePackage.MANU_SYSTEM__STORAGE:
				getStorage().clear();
				return;
			case ManufacturePackage.MANU_SYSTEM__MATERIALCONDITIONER:
				getMaterialconditioner().clear();
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
			case ManufacturePackage.MANU_SYSTEM__FIRST_STEP:
				return firstStep != null && !firstStep.isEmpty();
			case ManufacturePackage.MANU_SYSTEM__INTERMEDIATEPRODUCTS:
				return intermediateproducts != null && !intermediateproducts.isEmpty();
			case ManufacturePackage.MANU_SYSTEM__WORKPIECE:
				return workpiece != null && !workpiece.isEmpty();
			case ManufacturePackage.MANU_SYSTEM__STORAGE:
				return storage != null && !storage.isEmpty();
			case ManufacturePackage.MANU_SYSTEM__MATERIALCONDITIONER:
				return materialconditioner != null && !materialconditioner.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ManuSystemImpl
