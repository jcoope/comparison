/**
 */
package com.example.dealership;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Car</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.example.dealership.Car#getRegNumber <em>Reg Number</em>}</li>
 *   <li>{@link com.example.dealership.Car#isSold <em>Sold</em>}</li>
 *   <li>{@link com.example.dealership.Car#getSpecification <em>Specification</em>}</li>
 * </ul>
 *
 * @see com.example.dealership.DealershipPackage#getCar()
 * @model
 * @generated
 */
public interface Car extends EObject {
	/**
	 * Returns the value of the '<em><b>Reg Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reg Number</em>' attribute.
	 * @see #setRegNumber(String)
	 * @see com.example.dealership.DealershipPackage#getCar_RegNumber()
	 * @model
	 * @generated
	 */
	String getRegNumber();

	/**
	 * Sets the value of the '{@link com.example.dealership.Car#getRegNumber <em>Reg Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reg Number</em>' attribute.
	 * @see #getRegNumber()
	 * @generated
	 */
	void setRegNumber(String value);

	/**
	 * Returns the value of the '<em><b>Sold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sold</em>' attribute.
	 * @see #setSold(boolean)
	 * @see com.example.dealership.DealershipPackage#getCar_Sold()
	 * @model
	 * @generated
	 */
	boolean isSold();

	/**
	 * Sets the value of the '{@link com.example.dealership.Car#isSold <em>Sold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sold</em>' attribute.
	 * @see #isSold()
	 * @generated
	 */
	void setSold(boolean value);

	/**
	 * Returns the value of the '<em><b>Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' reference.
	 * @see #setSpecification(Specification)
	 * @see com.example.dealership.DealershipPackage#getCar_Specification()
	 * @model
	 * @generated
	 */
	Specification getSpecification();

	/**
	 * Sets the value of the '{@link com.example.dealership.Car#getSpecification <em>Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' reference.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(Specification value);

} // Car
