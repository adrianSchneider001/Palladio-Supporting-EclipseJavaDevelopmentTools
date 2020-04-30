/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.types.provider;

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

import org.palladiosimulator.jdt.metamodel.javamodel.types.util.TypesAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TypesItemProviderAdapterFactory extends TypesAdapterFactory
        implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
    public TypesItemProviderAdapterFactory() {
        supportedTypes.add(IEditingDomainItemProvider.class);
        supportedTypes.add(IStructuredItemContentProvider.class);
        supportedTypes.add(ITreeItemContentProvider.class);
        supportedTypes.add(IItemLabelProvider.class);
        supportedTypes.add(IItemPropertySource.class);
    }

    /**
     * This keeps track of the one adapter used for all {@link org.palladiosimulator.jdt.metamodel.javamodel.types.ClassifierReference} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ClassifierReferenceItemProvider classifierReferenceItemProvider;

    /**
     * This creates an adapter for a {@link org.palladiosimulator.jdt.metamodel.javamodel.types.ClassifierReference}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createClassifierReferenceAdapter() {
        if (classifierReferenceItemProvider == null) {
            classifierReferenceItemProvider = new ClassifierReferenceItemProvider(this);
        }

        return classifierReferenceItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.palladiosimulator.jdt.metamodel.javamodel.types.NamespaceClassifierReference} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected NamespaceClassifierReferenceItemProvider namespaceClassifierReferenceItemProvider;

    /**
     * This creates an adapter for a {@link org.palladiosimulator.jdt.metamodel.javamodel.types.NamespaceClassifierReference}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createNamespaceClassifierReferenceAdapter() {
        if (namespaceClassifierReferenceItemProvider == null) {
            namespaceClassifierReferenceItemProvider = new NamespaceClassifierReferenceItemProvider(this);
        }

        return namespaceClassifierReferenceItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.palladiosimulator.jdt.metamodel.javamodel.types.Boolean} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BooleanItemProvider booleanItemProvider;

    /**
     * This creates an adapter for a {@link org.palladiosimulator.jdt.metamodel.javamodel.types.Boolean}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createBooleanAdapter() {
        if (booleanItemProvider == null) {
            booleanItemProvider = new BooleanItemProvider(this);
        }

        return booleanItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.palladiosimulator.jdt.metamodel.javamodel.types.Byte} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ByteItemProvider byteItemProvider;

    /**
     * This creates an adapter for a {@link org.palladiosimulator.jdt.metamodel.javamodel.types.Byte}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createByteAdapter() {
        if (byteItemProvider == null) {
            byteItemProvider = new ByteItemProvider(this);
        }

        return byteItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.palladiosimulator.jdt.metamodel.javamodel.types.Char} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CharItemProvider charItemProvider;

    /**
     * This creates an adapter for a {@link org.palladiosimulator.jdt.metamodel.javamodel.types.Char}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createCharAdapter() {
        if (charItemProvider == null) {
            charItemProvider = new CharItemProvider(this);
        }

        return charItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.palladiosimulator.jdt.metamodel.javamodel.types.Double} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DoubleItemProvider doubleItemProvider;

    /**
     * This creates an adapter for a {@link org.palladiosimulator.jdt.metamodel.javamodel.types.Double}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createDoubleAdapter() {
        if (doubleItemProvider == null) {
            doubleItemProvider = new DoubleItemProvider(this);
        }

        return doubleItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.palladiosimulator.jdt.metamodel.javamodel.types.Float} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FloatItemProvider floatItemProvider;

    /**
     * This creates an adapter for a {@link org.palladiosimulator.jdt.metamodel.javamodel.types.Float}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createFloatAdapter() {
        if (floatItemProvider == null) {
            floatItemProvider = new FloatItemProvider(this);
        }

        return floatItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.palladiosimulator.jdt.metamodel.javamodel.types.Int} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IntItemProvider intItemProvider;

    /**
     * This creates an adapter for a {@link org.palladiosimulator.jdt.metamodel.javamodel.types.Int}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createIntAdapter() {
        if (intItemProvider == null) {
            intItemProvider = new IntItemProvider(this);
        }

        return intItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.palladiosimulator.jdt.metamodel.javamodel.types.Long} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LongItemProvider longItemProvider;

    /**
     * This creates an adapter for a {@link org.palladiosimulator.jdt.metamodel.javamodel.types.Long}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createLongAdapter() {
        if (longItemProvider == null) {
            longItemProvider = new LongItemProvider(this);
        }

        return longItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.palladiosimulator.jdt.metamodel.javamodel.types.Short} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ShortItemProvider shortItemProvider;

    /**
     * This creates an adapter for a {@link org.palladiosimulator.jdt.metamodel.javamodel.types.Short}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createShortAdapter() {
        if (shortItemProvider == null) {
            shortItemProvider = new ShortItemProvider(this);
        }

        return shortItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.palladiosimulator.jdt.metamodel.javamodel.types.Void} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected VoidItemProvider voidItemProvider;

    /**
     * This creates an adapter for a {@link org.palladiosimulator.jdt.metamodel.javamodel.types.Void}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createVoidAdapter() {
        if (voidItemProvider == null) {
            voidItemProvider = new VoidItemProvider(this);
        }

        return voidItemProvider;
    }

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
            if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
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
        if (classifierReferenceItemProvider != null)
            classifierReferenceItemProvider.dispose();
        if (namespaceClassifierReferenceItemProvider != null)
            namespaceClassifierReferenceItemProvider.dispose();
        if (booleanItemProvider != null)
            booleanItemProvider.dispose();
        if (byteItemProvider != null)
            byteItemProvider.dispose();
        if (charItemProvider != null)
            charItemProvider.dispose();
        if (doubleItemProvider != null)
            doubleItemProvider.dispose();
        if (floatItemProvider != null)
            floatItemProvider.dispose();
        if (intItemProvider != null)
            intItemProvider.dispose();
        if (longItemProvider != null)
            longItemProvider.dispose();
        if (shortItemProvider != null)
            shortItemProvider.dispose();
        if (voidItemProvider != null)
            voidItemProvider.dispose();
    }

}
