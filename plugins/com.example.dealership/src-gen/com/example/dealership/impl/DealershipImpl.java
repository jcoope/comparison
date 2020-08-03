/**
 */
package com.example.dealership.impl;

import com.example.dealership.Car;
import com.example.dealership.Dealership;
import com.example.dealership.DealershipPackage;
import com.example.dealership.Library;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dealership</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.example.dealership.impl.DealershipImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.example.dealership.impl.DealershipImpl#getCars <em>Cars</em>}</li>
 *   <li>{@link com.example.dealership.impl.DealershipImpl#getLibraries <em>Libraries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DealershipImpl extends MinimalEObjectImpl.Container implements Dealership {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCars() <em>Cars</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCars()
	 * @generated
	 * @ordered
	 */
	protected EList<Car> cars;

	/**
	 * The cached value of the '{@link #getLibraries() <em>Libraries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraries()
	 * @generated
	 * @ordered
	 */
	protected EList<Library> libraries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DealershipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DealershipPackage.Literals.DEALERSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DealershipPackage.DEALERSHIP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Car> getCars() {
		if (cars == null) {
			cars = new EObjectContainmentEList.Resolving<Car>(Car.class, this, DealershipPackage.DEALERSHIP__CARS);
		}
		return cars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Library> getLibraries() {
		if (libraries == null) {
			libraries = new EObjectContainmentEList.Resolving<Library>(Library.class, this,
					DealershipPackage.DEALERSHIP__LIBRARIES);
		}
		return libraries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DealershipPackage.DEALERSHIP__CARS:
			return ((InternalEList<?>) getCars()).basicRemove(otherEnd, msgs);
		case DealershipPackage.DEALERSHIP__LIBRARIES:
			return ((InternalEList<?>) getLibraries()).basicRemove(otherEnd, msgs);
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
		case DealershipPackage.DEALERSHIP__NAME:
			return getName();
		case DealershipPackage.DEALERSHIP__CARS:
			return getCars();
		case DealershipPackage.DEALERSHIP__LIBRARIES:
			return getLibraries();
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
		case DealershipPackage.DEALERSHIP__NAME:
			setName((String) newValue);
			return;
		case DealershipPackage.DEALERSHIP__CARS:
			getCars().clear();
			getCars().addAll((Collection<? extends Car>) newValue);
			return;
		case DealershipPackage.DEALERSHIP__LIBRARIES:
			getLibraries().clear();
			getLibraries().addAll((Collection<? extends Library>) newValue);
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
		case DealershipPackage.DEALERSHIP__NAME:
			setName(NAME_EDEFAULT);
			return;
		case DealershipPackage.DEALERSHIP__CARS:
			getCars().clear();
			return;
		case DealershipPackage.DEALERSHIP__LIBRARIES:
			getLibraries().clear();
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
		case DealershipPackage.DEALERSHIP__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case DealershipPackage.DEALERSHIP__CARS:
			return cars != null && !cars.isEmpty();
		case DealershipPackage.DEALERSHIP__LIBRARIES:
			return libraries != null && !libraries.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DealershipImpl
