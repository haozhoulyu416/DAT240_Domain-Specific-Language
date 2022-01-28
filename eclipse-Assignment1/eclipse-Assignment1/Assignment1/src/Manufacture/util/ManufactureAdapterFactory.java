/**
 */
package Manufacture.util;

import Manufacture.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Manufacture.ManufacturePackage
 * @generated
 */
public class ManufactureAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ManufacturePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManufactureAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ManufacturePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManufactureSwitch<Adapter> modelSwitch =
		new ManufactureSwitch<Adapter>() {
			@Override
			public Adapter caseManuSystem(ManuSystem object) {
				return createManuSystemAdapter();
			}
			@Override
			public Adapter caseStep(Step object) {
				return createStepAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseWorkPiece(WorkPiece object) {
				return createWorkPieceAdapter();
			}
			@Override
			public Adapter caseStorage(Storage object) {
				return createStorageAdapter();
			}
			@Override
			public Adapter caseIntermediateProduct(IntermediateProduct object) {
				return createIntermediateProductAdapter();
			}
			@Override
			public Adapter caseUsable(Usable object) {
				return createUsableAdapter();
			}
			@Override
			public Adapter caseHierarchyStep(HierarchyStep object) {
				return createHierarchyStepAdapter();
			}
			@Override
			public Adapter caseManuStep(ManuStep object) {
				return createManuStepAdapter();
			}
			@Override
			public Adapter caseTransStep(TransStep object) {
				return createTransStepAdapter();
			}
			@Override
			public Adapter caseQAStep(QAStep object) {
				return createQAStepAdapter();
			}
			@Override
			public Adapter caseMaterialConditioner(MaterialConditioner object) {
				return createMaterialConditionerAdapter();
			}
			@Override
			public Adapter caseBiCon(BiCon object) {
				return createBiConAdapter();
			}
			@Override
			public Adapter caseUniCon(UniCon object) {
				return createUniConAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link Manufacture.ManuSystem <em>Manu System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Manufacture.ManuSystem
	 * @generated
	 */
	public Adapter createManuSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Manufacture.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Manufacture.Step
	 * @generated
	 */
	public Adapter createStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Manufacture.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Manufacture.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Manufacture.WorkPiece <em>Work Piece</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Manufacture.WorkPiece
	 * @generated
	 */
	public Adapter createWorkPieceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Manufacture.Storage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Manufacture.Storage
	 * @generated
	 */
	public Adapter createStorageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Manufacture.IntermediateProduct <em>Intermediate Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Manufacture.IntermediateProduct
	 * @generated
	 */
	public Adapter createIntermediateProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Manufacture.Usable <em>Usable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Manufacture.Usable
	 * @generated
	 */
	public Adapter createUsableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Manufacture.HierarchyStep <em>Hierarchy Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Manufacture.HierarchyStep
	 * @generated
	 */
	public Adapter createHierarchyStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Manufacture.ManuStep <em>Manu Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Manufacture.ManuStep
	 * @generated
	 */
	public Adapter createManuStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Manufacture.TransStep <em>Trans Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Manufacture.TransStep
	 * @generated
	 */
	public Adapter createTransStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Manufacture.QAStep <em>QA Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Manufacture.QAStep
	 * @generated
	 */
	public Adapter createQAStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Manufacture.MaterialConditioner <em>Material Conditioner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Manufacture.MaterialConditioner
	 * @generated
	 */
	public Adapter createMaterialConditionerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Manufacture.BiCon <em>Bi Con</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Manufacture.BiCon
	 * @generated
	 */
	public Adapter createBiConAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Manufacture.UniCon <em>Uni Con</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Manufacture.UniCon
	 * @generated
	 */
	public Adapter createUniConAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ManufactureAdapterFactory
