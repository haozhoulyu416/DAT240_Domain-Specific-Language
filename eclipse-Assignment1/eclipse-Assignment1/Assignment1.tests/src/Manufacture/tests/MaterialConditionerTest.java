/**
 */
package Manufacture.tests;

import Manufacture.ManufactureFactory;
import Manufacture.MaterialConditioner;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Material Conditioner</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MaterialConditionerTest extends TestCase {

	/**
	 * The fixture for this Material Conditioner test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaterialConditioner fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MaterialConditionerTest.class);
	}

	/**
	 * Constructs a new Material Conditioner test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaterialConditionerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Material Conditioner test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(MaterialConditioner fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Material Conditioner test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaterialConditioner getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ManufactureFactory.eINSTANCE.createMaterialConditioner());
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

} //MaterialConditionerTest
