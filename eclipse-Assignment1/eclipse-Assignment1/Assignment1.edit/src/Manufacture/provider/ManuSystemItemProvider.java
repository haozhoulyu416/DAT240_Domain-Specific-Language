/**
 */
package Manufacture.provider;


import Manufacture.ManuSystem;
import Manufacture.ManufactureFactory;
import Manufacture.ManufacturePackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link Manufacture.ManuSystem} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ManuSystemItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManuSystemItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ManufacturePackage.Literals.MANU_SYSTEM__FIRST_STEP);
			childrenFeatures.add(ManufacturePackage.Literals.MANU_SYSTEM__INTERMEDIATEPRODUCTS);
			childrenFeatures.add(ManufacturePackage.Literals.MANU_SYSTEM__WORKPIECE);
			childrenFeatures.add(ManufacturePackage.Literals.MANU_SYSTEM__STORAGE);
			childrenFeatures.add(ManufacturePackage.Literals.MANU_SYSTEM__MATERIALCONDITIONER);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ManuSystem.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ManuSystem"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ManuSystem)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ManuSystem_type") :
			getString("_UI_ManuSystem_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ManuSystem.class)) {
			case ManufacturePackage.MANU_SYSTEM__FIRST_STEP:
			case ManufacturePackage.MANU_SYSTEM__INTERMEDIATEPRODUCTS:
			case ManufacturePackage.MANU_SYSTEM__WORKPIECE:
			case ManufacturePackage.MANU_SYSTEM__STORAGE:
			case ManufacturePackage.MANU_SYSTEM__MATERIALCONDITIONER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ManufacturePackage.Literals.MANU_SYSTEM__FIRST_STEP,
				 ManufactureFactory.eINSTANCE.createStep()));

		newChildDescriptors.add
			(createChildParameter
				(ManufacturePackage.Literals.MANU_SYSTEM__FIRST_STEP,
				 ManufactureFactory.eINSTANCE.createHierarchyStep()));

		newChildDescriptors.add
			(createChildParameter
				(ManufacturePackage.Literals.MANU_SYSTEM__FIRST_STEP,
				 ManufactureFactory.eINSTANCE.createManuStep()));

		newChildDescriptors.add
			(createChildParameter
				(ManufacturePackage.Literals.MANU_SYSTEM__FIRST_STEP,
				 ManufactureFactory.eINSTANCE.createTransStep()));

		newChildDescriptors.add
			(createChildParameter
				(ManufacturePackage.Literals.MANU_SYSTEM__FIRST_STEP,
				 ManufactureFactory.eINSTANCE.createQAStep()));

		newChildDescriptors.add
			(createChildParameter
				(ManufacturePackage.Literals.MANU_SYSTEM__INTERMEDIATEPRODUCTS,
				 ManufactureFactory.eINSTANCE.createIntermediateProduct()));

		newChildDescriptors.add
			(createChildParameter
				(ManufacturePackage.Literals.MANU_SYSTEM__WORKPIECE,
				 ManufactureFactory.eINSTANCE.createWorkPiece()));

		newChildDescriptors.add
			(createChildParameter
				(ManufacturePackage.Literals.MANU_SYSTEM__STORAGE,
				 ManufactureFactory.eINSTANCE.createStorage()));

		newChildDescriptors.add
			(createChildParameter
				(ManufacturePackage.Literals.MANU_SYSTEM__MATERIALCONDITIONER,
				 ManufactureFactory.eINSTANCE.createMaterialConditioner()));

		newChildDescriptors.add
			(createChildParameter
				(ManufacturePackage.Literals.MANU_SYSTEM__MATERIALCONDITIONER,
				 ManufactureFactory.eINSTANCE.createBiCon()));

		newChildDescriptors.add
			(createChildParameter
				(ManufacturePackage.Literals.MANU_SYSTEM__MATERIALCONDITIONER,
				 ManufactureFactory.eINSTANCE.createUniCon()));
	}

}
