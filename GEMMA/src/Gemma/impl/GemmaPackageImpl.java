/**
 */
package Gemma.impl;

import Gemma.ElementoExpresion;
import Gemma.ExpresionBinaria;
import Gemma.Gemma;
import Gemma.GemmaFactory;
import Gemma.GemmaPackage;
import Gemma.MacroOm;
import Gemma.Om;
import Gemma.TipoMacroOm;
import Gemma.TipoOm;
import Gemma.TipoVariable;
import Gemma.Transicion;
import Gemma.TransicionEntreMacroOmOm;
import Gemma.TrasicionEntreOmOm;
import Gemma.Variable;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GemmaPackageImpl extends EPackageImpl implements GemmaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gemmaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass macroOmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass omEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trasicionEntreOmOmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transicionEntreMacroOmOmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expresionBinariaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementoExpresionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transicionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoOmEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoMacroOmEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoVariableEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Gemma.GemmaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GemmaPackageImpl() {
		super(eNS_URI, GemmaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link GemmaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GemmaPackage init() {
		if (isInited) return (GemmaPackage)EPackage.Registry.INSTANCE.getEPackage(GemmaPackage.eNS_URI);

		// Obtain or create and register package
		GemmaPackageImpl theGemmaPackage = (GemmaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GemmaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GemmaPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theGemmaPackage.createPackageContents();

		// Initialize created meta-data
		theGemmaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGemmaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GemmaPackage.eNS_URI, theGemmaPackage);
		return theGemmaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGemma() {
		return gemmaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGemma_MacroOms() {
		return (EReference)gemmaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGemma_Transiciones() {
		return (EReference)gemmaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGemma_Variables() {
		return (EReference)gemmaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMacroOm() {
		return macroOmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMacroOm_Name() {
		return (EAttribute)macroOmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMacroOm_Tipo() {
		return (EAttribute)macroOmEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMacroOm_Oms() {
		return (EReference)macroOmEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOm() {
		return omEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOm_Name() {
		return (EAttribute)omEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOm_Tipo() {
		return (EAttribute)omEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOm_EsOmRaiz() {
		return (EAttribute)omEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrasicionEntreOmOm() {
		return trasicionEntreOmOmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrasicionEntreOmOm_Origen() {
		return (EReference)trasicionEntreOmOmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrasicionEntreOmOm_Destino() {
		return (EReference)trasicionEntreOmOmEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransicionEntreMacroOmOm() {
		return transicionEntreMacroOmOmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransicionEntreMacroOmOm_Origen() {
		return (EReference)transicionEntreMacroOmOmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransicionEntreMacroOmOm_Destino() {
		return (EReference)transicionEntreMacroOmOmEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpresionBinaria() {
		return expresionBinariaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpresionBinaria_ExpresionIzquierda() {
		return (EReference)expresionBinariaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpresionBinaria_ExpresionDerecha() {
		return (EReference)expresionBinariaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementoExpresion() {
		return elementoExpresionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Name() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Tipo() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransicion() {
		return transicionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransicion_ExpresionBinaria() {
		return (EReference)transicionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransicion_Name() {
		return (EAttribute)transicionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTipoOm() {
		return tipoOmEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTipoMacroOm() {
		return tipoMacroOmEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTipoVariable() {
		return tipoVariableEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GemmaFactory getGemmaFactory() {
		return (GemmaFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		gemmaEClass = createEClass(GEMMA);
		createEReference(gemmaEClass, GEMMA__MACRO_OMS);
		createEReference(gemmaEClass, GEMMA__TRANSICIONES);
		createEReference(gemmaEClass, GEMMA__VARIABLES);

		macroOmEClass = createEClass(MACRO_OM);
		createEAttribute(macroOmEClass, MACRO_OM__NAME);
		createEAttribute(macroOmEClass, MACRO_OM__TIPO);
		createEReference(macroOmEClass, MACRO_OM__OMS);

		omEClass = createEClass(OM);
		createEAttribute(omEClass, OM__NAME);
		createEAttribute(omEClass, OM__TIPO);
		createEAttribute(omEClass, OM__ES_OM_RAIZ);

		trasicionEntreOmOmEClass = createEClass(TRASICION_ENTRE_OM_OM);
		createEReference(trasicionEntreOmOmEClass, TRASICION_ENTRE_OM_OM__ORIGEN);
		createEReference(trasicionEntreOmOmEClass, TRASICION_ENTRE_OM_OM__DESTINO);

		transicionEntreMacroOmOmEClass = createEClass(TRANSICION_ENTRE_MACRO_OM_OM);
		createEReference(transicionEntreMacroOmOmEClass, TRANSICION_ENTRE_MACRO_OM_OM__ORIGEN);
		createEReference(transicionEntreMacroOmOmEClass, TRANSICION_ENTRE_MACRO_OM_OM__DESTINO);

		expresionBinariaEClass = createEClass(EXPRESION_BINARIA);
		createEReference(expresionBinariaEClass, EXPRESION_BINARIA__EXPRESION_IZQUIERDA);
		createEReference(expresionBinariaEClass, EXPRESION_BINARIA__EXPRESION_DERECHA);

		elementoExpresionEClass = createEClass(ELEMENTO_EXPRESION);

		variableEClass = createEClass(VARIABLE);
		createEAttribute(variableEClass, VARIABLE__NAME);
		createEAttribute(variableEClass, VARIABLE__TIPO);

		transicionEClass = createEClass(TRANSICION);
		createEReference(transicionEClass, TRANSICION__EXPRESION_BINARIA);
		createEAttribute(transicionEClass, TRANSICION__NAME);

		// Create enums
		tipoOmEEnum = createEEnum(TIPO_OM);
		tipoMacroOmEEnum = createEEnum(TIPO_MACRO_OM);
		tipoVariableEEnum = createEEnum(TIPO_VARIABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		trasicionEntreOmOmEClass.getESuperTypes().add(this.getTransicion());
		transicionEntreMacroOmOmEClass.getESuperTypes().add(this.getTransicion());
		expresionBinariaEClass.getESuperTypes().add(this.getElementoExpresion());
		variableEClass.getESuperTypes().add(this.getElementoExpresion());

		// Initialize classes, features, and operations; add parameters
		initEClass(gemmaEClass, Gemma.class, "Gemma", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGemma_MacroOms(), this.getMacroOm(), null, "macroOms", null, 1, -1, Gemma.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGemma_Transiciones(), this.getTransicion(), null, "transiciones", null, 1, -1, Gemma.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGemma_Variables(), this.getVariable(), null, "variables", null, 0, -1, Gemma.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(macroOmEClass, MacroOm.class, "MacroOm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMacroOm_Name(), ecorePackage.getEString(), "name", null, 0, 1, MacroOm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMacroOm_Tipo(), this.getTipoMacroOm(), "tipo", null, 0, 1, MacroOm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMacroOm_Oms(), this.getOm(), null, "oms", null, 1, -1, MacroOm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(omEClass, Om.class, "Om", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOm_Name(), ecorePackage.getEString(), "name", null, 0, 1, Om.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOm_Tipo(), this.getTipoOm(), "tipo", null, 0, 1, Om.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOm_EsOmRaiz(), ecorePackage.getEBoolean(), "esOmRaiz", null, 0, 1, Om.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trasicionEntreOmOmEClass, TrasicionEntreOmOm.class, "TrasicionEntreOmOm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrasicionEntreOmOm_Origen(), this.getOm(), null, "origen", null, 1, 1, TrasicionEntreOmOm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrasicionEntreOmOm_Destino(), this.getOm(), null, "destino", null, 1, 1, TrasicionEntreOmOm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transicionEntreMacroOmOmEClass, TransicionEntreMacroOmOm.class, "TransicionEntreMacroOmOm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransicionEntreMacroOmOm_Origen(), this.getMacroOm(), null, "origen", null, 1, 1, TransicionEntreMacroOmOm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransicionEntreMacroOmOm_Destino(), this.getOm(), null, "destino", null, 1, 1, TransicionEntreMacroOmOm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expresionBinariaEClass, ExpresionBinaria.class, "ExpresionBinaria", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpresionBinaria_ExpresionIzquierda(), this.getElementoExpresion(), null, "expresionIzquierda", null, 0, 1, ExpresionBinaria.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpresionBinaria_ExpresionDerecha(), this.getElementoExpresion(), null, "expresionDerecha", null, 0, 1, ExpresionBinaria.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementoExpresionEClass, ElementoExpresion.class, "ElementoExpresion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Tipo(), this.getTipoVariable(), "tipo", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transicionEClass, Transicion.class, "Transicion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransicion_ExpresionBinaria(), this.getExpresionBinaria(), null, "expresionBinaria", null, 1, 1, Transicion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransicion_Name(), ecorePackage.getEString(), "name", null, 0, 1, Transicion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(tipoOmEEnum, TipoOm.class, "TipoOm");
		addEEnumLiteral(tipoOmEEnum, TipoOm.A1);
		addEEnumLiteral(tipoOmEEnum, TipoOm.A2);
		addEEnumLiteral(tipoOmEEnum, TipoOm.A3);
		addEEnumLiteral(tipoOmEEnum, TipoOm.A4);
		addEEnumLiteral(tipoOmEEnum, TipoOm.A5);
		addEEnumLiteral(tipoOmEEnum, TipoOm.A6);
		addEEnumLiteral(tipoOmEEnum, TipoOm.A7);
		addEEnumLiteral(tipoOmEEnum, TipoOm.F1);
		addEEnumLiteral(tipoOmEEnum, TipoOm.F2);
		addEEnumLiteral(tipoOmEEnum, TipoOm.F3);
		addEEnumLiteral(tipoOmEEnum, TipoOm.F4);
		addEEnumLiteral(tipoOmEEnum, TipoOm.F5);
		addEEnumLiteral(tipoOmEEnum, TipoOm.F6);
		addEEnumLiteral(tipoOmEEnum, TipoOm.D1);
		addEEnumLiteral(tipoOmEEnum, TipoOm.D2);
		addEEnumLiteral(tipoOmEEnum, TipoOm.D3);

		initEEnum(tipoMacroOmEEnum, TipoMacroOm.class, "TipoMacroOm");
		addEEnumLiteral(tipoMacroOmEEnum, TipoMacroOm.A);
		addEEnumLiteral(tipoMacroOmEEnum, TipoMacroOm.F);
		addEEnumLiteral(tipoMacroOmEEnum, TipoMacroOm.D);

		initEEnum(tipoVariableEEnum, TipoVariable.class, "TipoVariable");
		addEEnumLiteral(tipoVariableEEnum, TipoVariable.GLOBAL);
		addEEnumLiteral(tipoVariableEEnum, TipoVariable.PRIVADA);

		// Create resource
		createResource(eNS_URI);
	}

} //GemmaPackageImpl