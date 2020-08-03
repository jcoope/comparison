/**
 */
package com.example.dealership.impl;

import com.example.dealership.DealershipPackage;
import com.example.dealership.FuelType;
import com.example.dealership.Specification;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.example.dealership.impl.SpecificationImpl#getModel <em>Model</em>}</li>
 *   <li>{@link com.example.dealership.impl.SpecificationImpl#getCylinders <em>Cylinders</em>}</li>
 *   <li>{@link com.example.dealership.impl.SpecificationImpl#getFuel <em>Fuel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecificationImpl extends MinimalEObjectImpl.Container implements Specification {
	/**
	 * The default value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected String model = MODEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCylinders() <em>Cylinders</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCylinders()
	 * @generated
	 * @ordered
	 */
	protected static final int CYLINDERS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCylinders() <em>Cylinders</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCylinders()
	 * @generated
	 * @ordered
	 */
	protected int cylinders = CYLINDERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFuel() <em>Fuel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuel()
	 * @generated
	 * @ordered
	 */
	protected static final FuelType FUEL_EDEFAULT = FuelType.PETROL;

	/**
	 * The cached value of the '{@link #getFuel() <em>Fuel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuel()
	 * @generated
	 * @ordered
	 */
	protected FuelType fuel = FUEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DealershipPackage.Literals.SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModel(String newModel) {
		String oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DealershipPackage.SPECIFICATION__MODEL, oldModel,
					model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCylinders() {
		return cylinders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCylinders(int newCylinders) {
		int oldCylinders = cylinders;
		cylinders = newCylinders;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DealershipPackage.SPECIFICATION__CYLINDERS,
					oldCylinders, cylinders));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FuelType getFuel() {
		return fuel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFuel(FuelType newFuel) {
		FuelType oldFuel = fuel;
		fuel = newFuel == null ? FUEL_EDEFAULT : newFuel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DealershipPackage.SPECIFICATION__FUEL, oldFuel,
					fuel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DealershipPackage.SPECIFICATION__MODEL:
			return getModel();
		case DealershipPackage.SPECIFICATION__CYLINDERS:
			return getCylinders();
		case DealershipPackage.SPECIFICATION__FUEL:
			return getFuel();
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
		case DealershipPackage.SPECIFICATION__MODEL:
			setModel((String) newValue);
			return;
		case DealershipPackage.SPECIFICATION__CYLINDERS:
			setCylinders((Integer) newValue);
			return;
		case DealershipPackage.SPECIFICATION__FUEL:
			setFuel((FuelType) newValue);
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
		case DealershipPackage.SPECIFICATION__MODEL:
			setModel(MODEL_EDEFAULT);
			return;
		case DealershipPackage.SPECIFICATION__CYLINDERS:
			setCylinders(CYLINDERS_EDEFAULT);
			return;
		case DealershipPackage.SPECIFICATION__FUEL:
			setFuel(FUEL_EDEFAULT);
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
		case DealershipPackage.SPECIFICATION__MODEL:
			return MODEL_EDEFAULT == null ? model != null : !MODEL_EDEFAULT.equals(model);
		case DealershipPackage.SPECIFICATION__CYLINDERS:
			return cylinders != CYLINDERS_EDEFAULT;
		case DealershipPackage.SPECIFICATION__FUEL:
			return fuel != FUEL_EDEFAULT;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (model: ");
		result.append(model);
		result.append(", cylinders: ");
		result.append(cylinders);
		result.append(", fuel: ");
		result.append(fuel);
		result.append(')');
		return result.toString();
	}

} //SpecificationImpl
