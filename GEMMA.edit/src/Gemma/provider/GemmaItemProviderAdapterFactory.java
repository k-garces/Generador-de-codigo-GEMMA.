/**
 */
package Gemma.provider;

import Gemma.util.GemmaAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GemmaItemProviderAdapterFactory extends GemmaAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GemmaItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link Gemma.Gemma} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GemmaItemProvider gemmaItemProvider;

	/**
	 * This creates an adapter for a {@link Gemma.Gemma}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGemmaAdapter() {
		if (gemmaItemProvider == null) {
			gemmaItemProvider = new GemmaItemProvider(this);
		}

		return gemmaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Gemma.MacroOm} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MacroOmItemProvider macroOmItemProvider;

	/**
	 * This creates an adapter for a {@link Gemma.MacroOm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMacroOmAdapter() {
		if (macroOmItemProvider == null) {
			macroOmItemProvider = new MacroOmItemProvider(this);
		}

		return macroOmItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Gemma.Om} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OmItemProvider omItemProvider;

	/**
	 * This creates an adapter for a {@link Gemma.Om}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOmAdapter() {
		if (omItemProvider == null) {
			omItemProvider = new OmItemProvider(this);
		}

		return omItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Gemma.TrasicionEntreOmOm} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrasicionEntreOmOmItemProvider trasicionEntreOmOmItemProvider;

	/**
	 * This creates an adapter for a {@link Gemma.TrasicionEntreOmOm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTrasicionEntreOmOmAdapter() {
		if (trasicionEntreOmOmItemProvider == null) {
			trasicionEntreOmOmItemProvider = new TrasicionEntreOmOmItemProvider(this);
		}

		return trasicionEntreOmOmItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Gemma.TransicionEntreMacroOmOm} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransicionEntreMacroOmOmItemProvider transicionEntreMacroOmOmItemProvider;

	/**
	 * This creates an adapter for a {@link Gemma.TransicionEntreMacroOmOm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTransicionEntreMacroOmOmAdapter() {
		if (transicionEntreMacroOmOmItemProvider == null) {
			transicionEntreMacroOmOmItemProvider = new TransicionEntreMacroOmOmItemProvider(this);
		}

		return transicionEntreMacroOmOmItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Gemma.ExpresionBinaria} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpresionBinariaItemProvider expresionBinariaItemProvider;

	/**
	 * This creates an adapter for a {@link Gemma.ExpresionBinaria}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExpresionBinariaAdapter() {
		if (expresionBinariaItemProvider == null) {
			expresionBinariaItemProvider = new ExpresionBinariaItemProvider(this);
		}

		return expresionBinariaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Gemma.ElementoExpresion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementoExpresionItemProvider elementoExpresionItemProvider;

	/**
	 * This creates an adapter for a {@link Gemma.ElementoExpresion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createElementoExpresionAdapter() {
		if (elementoExpresionItemProvider == null) {
			elementoExpresionItemProvider = new ElementoExpresionItemProvider(this);
		}

		return elementoExpresionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Gemma.VariableOm} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableOmItemProvider variableOmItemProvider;

	/**
	 * This creates an adapter for a {@link Gemma.VariableOm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVariableOmAdapter() {
		if (variableOmItemProvider == null) {
			variableOmItemProvider = new VariableOmItemProvider(this);
		}

		return variableOmItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Gemma.Transicion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransicionItemProvider transicionItemProvider;

	/**
	 * This creates an adapter for a {@link Gemma.Transicion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTransicionAdapter() {
		if (transicionItemProvider == null) {
			transicionItemProvider = new TransicionItemProvider(this);
		}

		return transicionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Gemma.VariableGemma} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableGemmaItemProvider variableGemmaItemProvider;

	/**
	 * This creates an adapter for a {@link Gemma.VariableGemma}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVariableGemmaAdapter() {
		if (variableGemmaItemProvider == null) {
			variableGemmaItemProvider = new VariableGemmaItemProvider(this);
		}

		return variableGemmaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Gemma.RefVariableGemma} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefVariableGemmaItemProvider refVariableGemmaItemProvider;

	/**
	 * This creates an adapter for a {@link Gemma.RefVariableGemma}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRefVariableGemmaAdapter() {
		if (refVariableGemmaItemProvider == null) {
			refVariableGemmaItemProvider = new RefVariableGemmaItemProvider(this);
		}

		return refVariableGemmaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Gemma.ExpresionNot} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpresionNotItemProvider expresionNotItemProvider;

	/**
	 * This creates an adapter for a {@link Gemma.ExpresionNot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExpresionNotAdapter() {
		if (expresionNotItemProvider == null) {
			expresionNotItemProvider = new ExpresionNotItemProvider(this);
		}

		return expresionNotItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Gemma.RefVariableOm} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefVariableOmItemProvider refVariableOmItemProvider;

	/**
	 * This creates an adapter for a {@link Gemma.RefVariableOm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRefVariableOmAdapter() {
		if (refVariableOmItemProvider == null) {
			refVariableOmItemProvider = new RefVariableOmItemProvider(this);
		}

		return refVariableOmItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Gemma.ExpresionConjunta} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpresionConjuntaItemProvider expresionConjuntaItemProvider;

	/**
	 * This creates an adapter for a {@link Gemma.ExpresionConjunta}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExpresionConjuntaAdapter() {
		if (expresionConjuntaItemProvider == null) {
			expresionConjuntaItemProvider = new ExpresionConjuntaItemProvider(this);
		}

		return expresionConjuntaItemProvider;
	}

	/**
	 * This creates an adapter for a {@link Gemma.VariableHardware}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (gemmaItemProvider != null) gemmaItemProvider.dispose();
		if (macroOmItemProvider != null) macroOmItemProvider.dispose();
		if (omItemProvider != null) omItemProvider.dispose();
		if (trasicionEntreOmOmItemProvider != null) trasicionEntreOmOmItemProvider.dispose();
		if (transicionEntreMacroOmOmItemProvider != null) transicionEntreMacroOmOmItemProvider.dispose();
		if (expresionBinariaItemProvider != null) expresionBinariaItemProvider.dispose();
		if (elementoExpresionItemProvider != null) elementoExpresionItemProvider.dispose();
		if (variableOmItemProvider != null) variableOmItemProvider.dispose();
		if (transicionItemProvider != null) transicionItemProvider.dispose();
		if (variableGemmaItemProvider != null) variableGemmaItemProvider.dispose();
		if (refVariableGemmaItemProvider != null) refVariableGemmaItemProvider.dispose();
		if (expresionNotItemProvider != null) expresionNotItemProvider.dispose();
		if (refVariableOmItemProvider != null) refVariableOmItemProvider.dispose();
		if (expresionConjuntaItemProvider != null) expresionConjuntaItemProvider.dispose();
	}

}
