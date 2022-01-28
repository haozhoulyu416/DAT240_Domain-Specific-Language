/**
 */
package Manufacture.tests;

import Manufacture.IntermediateProduct;
import Manufacture.ManufactureFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Intermediate Product</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntermediateProductTest extends UsableTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IntermediateProductTest.class);
	}

	/**
	 * Constructs a new Intermediate Product test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateProductTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Intermediate Product test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IntermediateProduct getFixture() {
		return (IntermediateProduct)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ManufactureFactory.eINSTANCE.createIntermediateProduct());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //IntermediateProductTest
