/**
 */
package com.example.dealership;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.example.dealership.DealershipFactory
 * @model kind="package"
 * @generated
 */
public interface DealershipPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dealership";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/dealership";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dealership";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DealershipPackage eINSTANCE = com.example.dealership.impl.DealershipPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.example.dealership.impl.DealershipImpl <em>Dealership</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.dealership.impl.DealershipImpl
	 * @see com.example.dealership.impl.DealershipPackageImpl#getDealership()
	 * @generated
	 */
	int DEALERSHIP = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEALERSHIP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Cars</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEALERSHIP__CARS = 1;

	/**
	 * The feature id for the '<em><b>Libraries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEALERSHIP__LIBRARIES = 2;

	/**
	 * The number of structural features of the '<em>Dealership</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEALERSHIP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Dealership</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEALERSHIP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.example.dealership.impl.CarImpl <em>Car</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.dealership.impl.CarImpl
	 * @see com.example.dealership.impl.DealershipPackageImpl#getCar()
	 * @generated
	 */
	int CAR = 1;

	/**
	 * The feature id for the '<em><b>Reg Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__REG_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Sold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__SOLD = 1;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__SPECIFICATION = 2;

	/**
	 * The number of structural features of the '<em>Car</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Car</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.example.dealership.impl.SpecificationImpl <em>Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.dealership.impl.SpecificationImpl
	 * @see com.example.dealership.impl.DealershipPackageImpl#getSpecification()
	 * @generated
	 */
	int SPECIFICATION = 2;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__MODEL = 0;

	/**
	 * The feature id for the '<em><b>Cylinders</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__CYLINDERS = 1;

	/**
	 * The feature id for the '<em><b>Fuel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__FUEL = 2;

	/**
	 * The number of structural features of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.example.dealership.impl.LibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.dealership.impl.LibraryImpl
	 * @see com.example.dealership.impl.DealershipPackageImpl#getLibrary()
	 * @generated
	 */
	int LIBRARY = 3;

	/**
	 * The feature id for the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__MANUFACTURER = 0;

	/**
	 * The feature id for the '<em><b>Specifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__SPECIFICATIONS = 1;

	/**
	 * The number of structural features of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.example.dealership.FuelType <em>Fuel Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.dealership.FuelType
	 * @see com.example.dealership.impl.DealershipPackageImpl#getFuelType()
	 * @generated
	 */
	int FUEL_TYPE = 4;

	/**
	 * Returns the meta object for class '{@link com.example.dealership.Dealership <em>Dealership</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dealership</em>'.
	 * @see com.example.dealership.Dealership
	 * @generated
	 */
	EClass getDealership();

	/**
	 * Returns the meta object for the attribute '{@link com.example.dealership.Dealership#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.example.dealership.Dealership#getName()
	 * @see #getDealership()
	 * @generated
	 */
	EAttribute getDealership_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.example.dealership.Dealership#getCars <em>Cars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cars</em>'.
	 * @see com.example.dealership.Dealership#getCars()
	 * @see #getDealership()
	 * @generated
	 */
	EReference getDealership_Cars();

	/**
	 * Returns the meta object for the containment reference list '{@link com.example.dealership.Dealership#getLibraries <em>Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Libraries</em>'.
	 * @see com.example.dealership.Dealership#getLibraries()
	 * @see #getDealership()
	 * @generated
	 */
	EReference getDealership_Libraries();

	/**
	 * Returns the meta object for class '{@link com.example.dealership.Car <em>Car</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Car</em>'.
	 * @see com.example.dealership.Car
	 * @generated
	 */
	EClass getCar();

	/**
	 * Returns the meta object for the attribute '{@link com.example.dealership.Car#getRegNumber <em>Reg Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reg Number</em>'.
	 * @see com.example.dealership.Car#getRegNumber()
	 * @see #getCar()
	 * @generated
	 */
	EAttribute getCar_RegNumber();

	/**
	 * Returns the meta object for the attribute '{@link com.example.dealership.Car#isSold <em>Sold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sold</em>'.
	 * @see com.example.dealership.Car#isSold()
	 * @see #getCar()
	 * @generated
	 */
	EAttribute getCar_Sold();

	/**
	 * Returns the meta object for the reference '{@link com.example.dealership.Car#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specification</em>'.
	 * @see com.example.dealership.Car#getSpecification()
	 * @see #getCar()
	 * @generated
	 */
	EReference getCar_Specification();

	/**
	 * Returns the meta object for class '{@link com.example.dealership.Specification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specification</em>'.
	 * @see com.example.dealership.Specification
	 * @generated
	 */
	EClass getSpecification();

	/**
	 * Returns the meta object for the attribute '{@link com.example.dealership.Specification#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see com.example.dealership.Specification#getModel()
	 * @see #getSpecification()
	 * @generated
	 */
	EAttribute getSpecification_Model();

	/**
	 * Returns the meta object for the attribute '{@link com.example.dealership.Specification#getCylinders <em>Cylinders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cylinders</em>'.
	 * @see com.example.dealership.Specification#getCylinders()
	 * @see #getSpecification()
	 * @generated
	 */
	EAttribute getSpecification_Cylinders();

	/**
	 * Returns the meta object for the attribute '{@link com.example.dealership.Specification#getFuel <em>Fuel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fuel</em>'.
	 * @see com.example.dealership.Specification#getFuel()
	 * @see #getSpecification()
	 * @generated
	 */
	EAttribute getSpecification_Fuel();

	/**
	 * Returns the meta object for class '{@link com.example.dealership.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library</em>'.
	 * @see com.example.dealership.Library
	 * @generated
	 */
	EClass getLibrary();

	/**
	 * Returns the meta object for the attribute '{@link com.example.dealership.Library#getManufacturer <em>Manufacturer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manufacturer</em>'.
	 * @see com.example.dealership.Library#getManufacturer()
	 * @see #getLibrary()
	 * @generated
	 */
	EAttribute getLibrary_Manufacturer();

	/**
	 * Returns the meta object for the containment reference list '{@link com.example.dealership.Library#getSpecifications <em>Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specifications</em>'.
	 * @see com.example.dealership.Library#getSpecifications()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_Specifications();

	/**
	 * Returns the meta object for enum '{@link com.example.dealership.FuelType <em>Fuel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fuel Type</em>'.
	 * @see com.example.dealership.FuelType
	 * @generated
	 */
	EEnum getFuelType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DealershipFactory getDealershipFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.example.dealership.impl.DealershipImpl <em>Dealership</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.dealership.impl.DealershipImpl
		 * @see com.example.dealership.impl.DealershipPackageImpl#getDealership()
		 * @generated
		 */
		EClass DEALERSHIP = eINSTANCE.getDealership();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEALERSHIP__NAME = eINSTANCE.getDealership_Name();

		/**
		 * The meta object literal for the '<em><b>Cars</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEALERSHIP__CARS = eINSTANCE.getDealership_Cars();

		/**
		 * The meta object literal for the '<em><b>Libraries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEALERSHIP__LIBRARIES = eINSTANCE.getDealership_Libraries();

		/**
		 * The meta object literal for the '{@link com.example.dealership.impl.CarImpl <em>Car</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.dealership.impl.CarImpl
		 * @see com.example.dealership.impl.DealershipPackageImpl#getCar()
		 * @generated
		 */
		EClass CAR = eINSTANCE.getCar();

		/**
		 * The meta object literal for the '<em><b>Reg Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAR__REG_NUMBER = eINSTANCE.getCar_RegNumber();

		/**
		 * The meta object literal for the '<em><b>Sold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAR__SOLD = eINSTANCE.getCar_Sold();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAR__SPECIFICATION = eINSTANCE.getCar_Specification();

		/**
		 * The meta object literal for the '{@link com.example.dealership.impl.SpecificationImpl <em>Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.dealership.impl.SpecificationImpl
		 * @see com.example.dealership.impl.DealershipPackageImpl#getSpecification()
		 * @generated
		 */
		EClass SPECIFICATION = eINSTANCE.getSpecification();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIFICATION__MODEL = eINSTANCE.getSpecification_Model();

		/**
		 * The meta object literal for the '<em><b>Cylinders</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIFICATION__CYLINDERS = eINSTANCE.getSpecification_Cylinders();

		/**
		 * The meta object literal for the '<em><b>Fuel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIFICATION__FUEL = eINSTANCE.getSpecification_Fuel();

		/**
		 * The meta object literal for the '{@link com.example.dealership.impl.LibraryImpl <em>Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.dealership.impl.LibraryImpl
		 * @see com.example.dealership.impl.DealershipPackageImpl#getLibrary()
		 * @generated
		 */
		EClass LIBRARY = eINSTANCE.getLibrary();

		/**
		 * The meta object literal for the '<em><b>Manufacturer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIBRARY__MANUFACTURER = eINSTANCE.getLibrary_Manufacturer();

		/**
		 * The meta object literal for the '<em><b>Specifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__SPECIFICATIONS = eINSTANCE.getLibrary_Specifications();

		/**
		 * The meta object literal for the '{@link com.example.dealership.FuelType <em>Fuel Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.dealership.FuelType
		 * @see com.example.dealership.impl.DealershipPackageImpl#getFuelType()
		 * @generated
		 */
		EEnum FUEL_TYPE = eINSTANCE.getFuelType();

	}

} //DealershipPackage
