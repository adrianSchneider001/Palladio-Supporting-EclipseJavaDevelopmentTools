/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.expressions;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Or Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.ConditionalOrExpression#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExpressionsPackage#getConditionalOrExpression()
 * @model
 * @generated
 */
public interface ConditionalOrExpression extends ConditionalExpressionChild {
    /**
     * Returns the value of the '<em><b>Children</b></em>' containment reference list.
     * The list contents are of type {@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.ConditionalOrExpressionChild}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Children</em>' containment reference list.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExpressionsPackage#getConditionalOrExpression_Children()
     * @model containment="true" required="true"
     * @generated
     */
    EList<ConditionalOrExpressionChild> getChildren();

} // ConditionalOrExpression
