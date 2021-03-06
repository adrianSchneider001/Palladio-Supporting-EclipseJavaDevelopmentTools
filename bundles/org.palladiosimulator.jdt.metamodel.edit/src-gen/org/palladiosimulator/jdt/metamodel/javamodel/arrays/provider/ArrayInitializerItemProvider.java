/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.arrays.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationsFactory;

import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayInitializer;
import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArraysFactory;
import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArraysPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExpressionsFactory;

import org.palladiosimulator.jdt.metamodel.javamodel.instantiations.InstantiationsFactory;

import org.palladiosimulator.jdt.metamodel.javamodel.literals.LiteralsFactory;

import org.palladiosimulator.jdt.metamodel.javamodel.references.ReferencesFactory;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayInitializer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ArrayInitializerItemProvider extends ArrayInitializationValueItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ArrayInitializerItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
        if (itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

        }
        return itemPropertyDescriptors;
    }

    /**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
     * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
        if (childrenFeatures == null) {
            super.getChildrenFeatures(object);
            childrenFeatures.add(ArraysPackage.Literals.ARRAY_INITIALIZER__INITIAL_VALUES);
        }
        return childrenFeatures;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature(Object object, Object child) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature(object, child);
    }

    /**
     * This returns ArrayInitializer.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/ArrayInitializer"));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected boolean shouldComposeCreationImage() {
        return true;
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        return getString("_UI_ArrayInitializer_type");
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged(Notification notification) {
        updateChildren(notification);

        switch (notification.getFeatureID(ArrayInitializer.class)) {
        case ArraysPackage.ARRAY_INITIALIZER__INITIAL_VALUES:
            fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
            return;
        default:
            super.notifyChanged(notification);
            return;
        }
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INITIALIZER__INITIAL_VALUES,
                ArraysFactory.eINSTANCE.createArrayInitializer()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INITIALIZER__INITIAL_VALUES,
                ArraysFactory.eINSTANCE.createArrayInstantiationBySize()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INITIALIZER__INITIAL_VALUES,
                ArraysFactory.eINSTANCE.createArrayInstantiationByValuesUntyped()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INITIALIZER__INITIAL_VALUES,
                ArraysFactory.eINSTANCE.createArrayInstantiationByValuesTyped()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INITIALIZER__INITIAL_VALUES,
                AnnotationsFactory.eINSTANCE.createAnnotationInstance()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INITIALIZER__INITIAL_VALUES,
                ExpressionsFactory.eINSTANCE.createAssignmentExpression()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INITIALIZER__INITIAL_VALUES,
                ExpressionsFactory.eINSTANCE.createConditionalExpression()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INITIALIZER__INITIAL_VALUES,
                ExpressionsFactory.eINSTANCE.createConditionalOrExpression()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INITIALIZER__INITIAL_VALUES,
                ExpressionsFactory.eINSTANCE.createConditionalAndExpression()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INITIALIZER__INITIAL_VALUES,
                ExpressionsFactory.eINSTANCE.createInclusiveOrExpression()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INITIALIZER__INITIAL_VALUES,
                ExpressionsFactory.eINSTANCE.createExclusiveOrExpression()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INITIALIZER__INITIAL_VALUES,
                ExpressionsFactory.eINSTANCE.createAndExpression()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INITIALIZER__INITIAL_VALUES,
                ExpressionsFactory.eINSTANCE.createEqualityExpression()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INITIALIZER__INITIAL_VALUES,
                ExpressionsFactory.eINSTANCE.createInstanceOfExpression()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INITIALIZER__INITIAL_VALUES,
                ExpressionsFactory.eINSTANCE.createRelationExpression()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INITIALIZER__INITIAL_VALUES,
                ExpressionsFactory.eINSTANCE.createShiftExpression()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INITIALIZER__INITIAL_VALUES,
                ExpressionsFactory.eINSTANCE.createAdditiveExpression()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INITIALIZER__INITIAL_VALUES,
                ExpressionsFactory.eINSTANCE.createMultiplicativeExpression()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INITIALIZER__INITIAL_VALUES,
                ExpressionsFactory.eINSTANCE.createUnaryExpression()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INITIALIZER__INITIAL_VALUES,
                ExpressionsFactory.eINSTANCE.createPrefixUnaryModificationExpression()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INITIALIZER__INITIAL_VALUES,
                ExpressionsFactory.eINSTANCE.createSuffixUnaryModificationExpression()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INITIALIZER__INITIAL_VALUES,
                ExpressionsFactory.eINSTANCE.createCastExpression()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INITIALIZER__INITIAL_VALUES,
                ExpressionsFactory.eINSTANCE.createNestedExpression()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INITIALIZER__INITIAL_VALUES,
                InstantiationsFactory.eINSTANCE.createNewConstructorCall()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INITIALIZER__INITIAL_VALUES,
                InstantiationsFactory.eINSTANCE.createExplicitConstructorCall()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INITIALIZER__INITIAL_VALUES,
                LiteralsFactory.eINSTANCE.createBooleanLiteral()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INITIALIZER__INITIAL_VALUES,
                LiteralsFactory.eINSTANCE.createCharacterLiteral()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INITIALIZER__INITIAL_VALUES,
                LiteralsFactory.eINSTANCE.createDecimalFloatLiteral()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INITIALIZER__INITIAL_VALUES,
                LiteralsFactory.eINSTANCE.createHexFloatLiteral()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INITIALIZER__INITIAL_VALUES,
                LiteralsFactory.eINSTANCE.createDecimalDoubleLiteral()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INITIALIZER__INITIAL_VALUES,
                LiteralsFactory.eINSTANCE.createHexDoubleLiteral()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INITIALIZER__INITIAL_VALUES,
                LiteralsFactory.eINSTANCE.createDecimalIntegerLiteral()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INITIALIZER__INITIAL_VALUES,
                LiteralsFactory.eINSTANCE.createHexIntegerLiteral()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INITIALIZER__INITIAL_VALUES,
                LiteralsFactory.eINSTANCE.createOctalIntegerLiteral()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INITIALIZER__INITIAL_VALUES,
                LiteralsFactory.eINSTANCE.createDecimalLongLiteral()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INITIALIZER__INITIAL_VALUES,
                LiteralsFactory.eINSTANCE.createHexLongLiteral()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INITIALIZER__INITIAL_VALUES,
                LiteralsFactory.eINSTANCE.createOctalLongLiteral()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INITIALIZER__INITIAL_VALUES,
                LiteralsFactory.eINSTANCE.createNullLiteral()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INITIALIZER__INITIAL_VALUES,
                ReferencesFactory.eINSTANCE.createIdentifierReference()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INITIALIZER__INITIAL_VALUES,
                ReferencesFactory.eINSTANCE.createMethodCall()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INITIALIZER__INITIAL_VALUES,
                ReferencesFactory.eINSTANCE.createReflectiveClassReference()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INITIALIZER__INITIAL_VALUES,
                ReferencesFactory.eINSTANCE.createPrimitiveTypeReference()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INITIALIZER__INITIAL_VALUES,
                ReferencesFactory.eINSTANCE.createStringReference()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INITIALIZER__INITIAL_VALUES,
                ReferencesFactory.eINSTANCE.createSelfReference()));
    }

}
