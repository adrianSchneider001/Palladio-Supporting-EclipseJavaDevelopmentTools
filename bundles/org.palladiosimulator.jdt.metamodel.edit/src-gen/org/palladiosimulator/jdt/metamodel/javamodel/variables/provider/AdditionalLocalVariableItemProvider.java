/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.variables.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationsFactory;

import org.palladiosimulator.jdt.metamodel.javamodel.annotations.provider.JavaModelEditPlugin;

import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArraysFactory;
import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArraysPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExpressionsFactory;

import org.palladiosimulator.jdt.metamodel.javamodel.instantiations.InstantiationsFactory;
import org.palladiosimulator.jdt.metamodel.javamodel.instantiations.InstantiationsPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.literals.LiteralsFactory;

import org.palladiosimulator.jdt.metamodel.javamodel.references.ReferencesFactory;

import org.palladiosimulator.jdt.metamodel.javamodel.references.provider.ReferenceableElementItemProvider;

import org.palladiosimulator.jdt.metamodel.javamodel.variables.AdditionalLocalVariable;
import org.palladiosimulator.jdt.metamodel.javamodel.variables.VariablesPackage;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.jdt.metamodel.javamodel.variables.AdditionalLocalVariable} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AdditionalLocalVariableItemProvider extends ReferenceableElementItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AdditionalLocalVariableItemProvider(AdapterFactory adapterFactory) {
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
            childrenFeatures.add(ArraysPackage.Literals.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_BEFORE);
            childrenFeatures.add(ArraysPackage.Literals.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_AFTER);
            childrenFeatures.add(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE);
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
     * This returns AdditionalLocalVariable.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/AdditionalLocalVariable"));
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
        String label = ((AdditionalLocalVariable) object).getName();
        return label == null || label.length() == 0 ? getString("_UI_AdditionalLocalVariable_type")
                : getString("_UI_AdditionalLocalVariable_type") + " " + label;
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

        switch (notification.getFeatureID(AdditionalLocalVariable.class)) {
        case VariablesPackage.ADDITIONAL_LOCAL_VARIABLE__ARRAY_DIMENSIONS_BEFORE:
        case VariablesPackage.ADDITIONAL_LOCAL_VARIABLE__ARRAY_DIMENSIONS_AFTER:
        case VariablesPackage.ADDITIONAL_LOCAL_VARIABLE__INITIAL_VALUE:
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

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_BEFORE,
                ArraysFactory.eINSTANCE.createArrayDimension()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_AFTER,
                ArraysFactory.eINSTANCE.createArrayDimension()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                AnnotationsFactory.eINSTANCE.createAnnotationInstance()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                ArraysFactory.eINSTANCE.createArrayInstantiationBySize()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                ArraysFactory.eINSTANCE.createArrayInstantiationByValuesUntyped()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                ArraysFactory.eINSTANCE.createArrayInstantiationByValuesTyped()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                ExpressionsFactory.eINSTANCE.createAssignmentExpression()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                ExpressionsFactory.eINSTANCE.createConditionalExpression()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                ExpressionsFactory.eINSTANCE.createConditionalOrExpression()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                ExpressionsFactory.eINSTANCE.createConditionalAndExpression()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                ExpressionsFactory.eINSTANCE.createInclusiveOrExpression()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                ExpressionsFactory.eINSTANCE.createExclusiveOrExpression()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                ExpressionsFactory.eINSTANCE.createAndExpression()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                ExpressionsFactory.eINSTANCE.createEqualityExpression()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                ExpressionsFactory.eINSTANCE.createInstanceOfExpression()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                ExpressionsFactory.eINSTANCE.createRelationExpression()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                ExpressionsFactory.eINSTANCE.createShiftExpression()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                ExpressionsFactory.eINSTANCE.createAdditiveExpression()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                ExpressionsFactory.eINSTANCE.createMultiplicativeExpression()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                ExpressionsFactory.eINSTANCE.createUnaryExpression()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                ExpressionsFactory.eINSTANCE.createPrefixUnaryModificationExpression()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                ExpressionsFactory.eINSTANCE.createSuffixUnaryModificationExpression()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                ExpressionsFactory.eINSTANCE.createCastExpression()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                ExpressionsFactory.eINSTANCE.createNestedExpression()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                InstantiationsFactory.eINSTANCE.createNewConstructorCall()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                InstantiationsFactory.eINSTANCE.createExplicitConstructorCall()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                LiteralsFactory.eINSTANCE.createBooleanLiteral()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                LiteralsFactory.eINSTANCE.createCharacterLiteral()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                LiteralsFactory.eINSTANCE.createDecimalFloatLiteral()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                LiteralsFactory.eINSTANCE.createHexFloatLiteral()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                LiteralsFactory.eINSTANCE.createDecimalDoubleLiteral()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                LiteralsFactory.eINSTANCE.createHexDoubleLiteral()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                LiteralsFactory.eINSTANCE.createDecimalIntegerLiteral()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                LiteralsFactory.eINSTANCE.createHexIntegerLiteral()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                LiteralsFactory.eINSTANCE.createOctalIntegerLiteral()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                LiteralsFactory.eINSTANCE.createDecimalLongLiteral()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                LiteralsFactory.eINSTANCE.createHexLongLiteral()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                LiteralsFactory.eINSTANCE.createOctalLongLiteral()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                LiteralsFactory.eINSTANCE.createNullLiteral()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                ReferencesFactory.eINSTANCE.createIdentifierReference()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                ReferencesFactory.eINSTANCE.createMethodCall()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                ReferencesFactory.eINSTANCE.createReflectiveClassReference()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                ReferencesFactory.eINSTANCE.createPrimitiveTypeReference()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                ReferencesFactory.eINSTANCE.createStringReference()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                ReferencesFactory.eINSTANCE.createSelfReference()));
    }

    /**
     * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
        Object childFeature = feature;
        Object childObject = child;

        boolean qualify = childFeature == ArraysPackage.Literals.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_BEFORE
                || childFeature == ArraysPackage.Literals.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_AFTER;

        if (qualify) {
            return getString("_UI_CreateChild_text2",
                    new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
    }

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return JavaModelEditPlugin.INSTANCE;
    }

}
