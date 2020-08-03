/**
 */
package com.example.dealership.impl;

import com.example.dealership.Car;
import com.example.dealership.DealershipPackage;
import com.example.dealership.Specification;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Car</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.example.dealership.impl.CarImpl#getRegNumber <em>Reg Number</em>}</li>
 *   <li>{@link com.example.dealership.impl.CarImpl#isSold <em>Sold</em>}</li>
 *   <li>{@link com.example.dealership.impl.CarImpl#getSpecification <em>Specification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CarImpl extends MinimalEObjectImpl.Container implements Car {
	/**
	 * The default value of the '{@link #getRegNumber() <em>Reg Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String REG_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegNumber() <em>Reg Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegNumber()
	 * @generated
	 * @ordered
	 */
	protected String regNumber = REG_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #isSold() <em>Sold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSold()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SOLD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSold() <em>Sold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSold()
	 * @generated
	 * @ordered
	 */
	protected boolean sold = SOLD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSpecification() <em>Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecification()
	 * @generated
	 * @ordered
	 */
	protected Specification specification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DealershipPackage.Literals.CAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRegNumber() {
		return regNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegNumber(String newRegNumber) {
		String oldRegNumber = regNumber;
		regNumber = newRegNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DealershipPackage.CAR__REG_NUMBER, oldRegNumber,
					regNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSold() {
		return sold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSold(boolean newSold) {
		boolean oldSold = sold;
		sold = newSold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DealershipPackage.CAR__SOLD, oldSold, sold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Specification getSpecification() {
		if (specification != null && specification.eIsProxy()) {
			InternalEObject oldSpecification = (InternalEObject) specification;
			specification = (Specification) eResolveProxy(oldSpecification);
			if (specification != oldSpecification) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DealershipPackage.CAR__SPECIFICATION,
							oldSpecification, specification));
			}
		}
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specification basicGetSpecification() {
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecification(Specification newSpecification) {
		Specification oldSpecification = specification;
		specification = newSpecification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DealershipPackage.CAR__SPECIFICATION,
					oldSpecification, specification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DealershipPackage.CAR__REG_NUMBER:
			return getRegNumber();
		case DealershipPackage.CAR__SOLD:
			return isSold();
		case DealershipPackage.CAR__SPECIFICATION:
			if (resolve)
				return getSpecification();
			return basicGetSpecification();
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
		case DealershipPackage.CAR__REG_NUMBER:
			setRegNumber((String) newValue);
			return;
		case DealershipPackage.CAR__SOLD:
			setSold((Boolean) newValue);
			return;
		case DealershipPackage.CAR__SPECIFICATION:
			setSpecification((Specification) newValue);
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
		case DealershipPackage.CAR__REG_NUMBER:
			setRegNumber(REG_NUMBER_EDEFAULT);
			return;
		case DealershipPackage.CAR__SOLD:
			setSold(SOLD_EDEFAULT);
			return;
		case DealershipPackage.CAR__SPECIFICATION:
			setSpecification((Specification) null);
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
		case DealershipPackage.CAR__REG_NUMBER:
			return REG_NUMBER_EDEFAULT == null ? regNumber != null : !REG_NUMBER_EDEFAULT.equals(regNumber);
		case DealershipPackage.CAR__SOLD:
			return sold != SOLD_EDEFAULT;
		case DealershipPackage.CAR__SPECIFICATION:
			return specification != null;
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
		result.append(" (regNumber: ");
		result.append(regNumber);
		result.append(", sold: ");
		result.append(sold);
		result.append(')');
		return result.toString();
	}

} //CarImpl
