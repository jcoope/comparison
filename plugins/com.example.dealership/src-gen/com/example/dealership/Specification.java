/**
 */
package com.example.dealership;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.example.dealership.Specification#getModel <em>Model</em>}</li>
 *   <li>{@link com.example.dealership.Specification#getCylinders <em>Cylinders</em>}</li>
 *   <li>{@link com.example.dealership.Specification#getFuel <em>Fuel</em>}</li>
 * </ul>
 *
 * @see com.example.dealership.DealershipPackage#getSpecification()
 * @model
 * @generated
 */
public interface Specification extends EObject {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' attribute.
	 * @see #setModel(String)
	 * @see com.example.dealership.DealershipPackage#getSpecification_Model()
	 * @model
	 * @generated
	 */
	String getModel();

	/**
	 * Sets the value of the '{@link com.example.dealership.Specification#getModel <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' attribute.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(String value);

	/**
	 * Returns the value of the '<em><b>Cylinders</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cylinders</em>' attribute.
	 * @see #setCylinders(int)
	 * @see com.example.dealership.DealershipPackage#getSpecification_Cylinders()
	 * @model
	 * @generated
	 */
	int getCylinders();

	/**
	 * Sets the value of the '{@link com.example.dealership.Specification#getCylinders <em>Cylinders</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cylinders</em>' attribute.
	 * @see #getCylinders()
	 * @generated
	 */
	void setCylinders(int value);

	/**
	 * Returns the value of the '<em><b>Fuel</b></em>' attribute.
	 * The literals are from the enumeration {@link com.example.dealership.FuelType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuel</em>' attribute.
	 * @see com.example.dealership.FuelType
	 * @see #setFuel(FuelType)
	 * @see com.example.dealership.DealershipPackage#getSpecification_Fuel()
	 * @model
	 * @generated
	 */
	FuelType getFuel();

	/**
	 * Sets the value of the '{@link com.example.dealership.Specification#getFuel <em>Fuel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuel</em>' attribute.
	 * @see com.example.dealership.FuelType
	 * @see #getFuel()
	 * @generated
	 */
	void setFuel(FuelType value);

} // Specification
