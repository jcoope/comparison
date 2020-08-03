/**
 */
package com.example.dealership;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dealership</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.example.dealership.Dealership#getName <em>Name</em>}</li>
 *   <li>{@link com.example.dealership.Dealership#getCars <em>Cars</em>}</li>
 *   <li>{@link com.example.dealership.Dealership#getLibraries <em>Libraries</em>}</li>
 * </ul>
 *
 * @see com.example.dealership.DealershipPackage#getDealership()
 * @model
 * @generated
 */
public interface Dealership extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.example.dealership.DealershipPackage#getDealership_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.example.dealership.Dealership#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Cars</b></em>' containment reference list.
	 * The list contents are of type {@link com.example.dealership.Car}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cars</em>' containment reference list.
	 * @see com.example.dealership.DealershipPackage#getDealership_Cars()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Car> getCars();

	/**
	 * Returns the value of the '<em><b>Libraries</b></em>' containment reference list.
	 * The list contents are of type {@link com.example.dealership.Library}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Libraries</em>' containment reference list.
	 * @see com.example.dealership.DealershipPackage#getDealership_Libraries()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Library> getLibraries();

} // Dealership
