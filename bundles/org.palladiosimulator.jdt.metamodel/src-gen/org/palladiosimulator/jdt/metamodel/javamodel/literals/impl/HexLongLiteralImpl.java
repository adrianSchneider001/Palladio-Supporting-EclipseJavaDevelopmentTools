/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.literals.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.literals.HexLongLiteral;
import org.palladiosimulator.jdt.metamodel.javamodel.literals.LiteralsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hex Long Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.HexLongLiteralImpl#getHexValue <em>Hex Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HexLongLiteralImpl extends LongLiteralImpl implements HexLongLiteral {
    /**
     * The default value of the '{@link #getHexValue() <em>Hex Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHexValue()
     * @generated
     * @ordered
     */
    protected static final BigInteger HEX_VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHexValue() <em>Hex Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHexValue()
     * @generated
     * @ordered
     */
    protected BigInteger hexValue = HEX_VALUE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected HexLongLiteralImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return LiteralsPackage.Literals.HEX_LONG_LITERAL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BigInteger getHexValue() {
        return hexValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setHexValue(BigInteger newHexValue) {
        BigInteger oldHexValue = hexValue;
        hexValue = newHexValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, LiteralsPackage.HEX_LONG_LITERAL__HEX_VALUE,
                    oldHexValue, hexValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case LiteralsPackage.HEX_LONG_LITERAL__HEX_VALUE:
            return getHexValue();
        default:
            return super.eGet(featureID, resolve, coreType);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case LiteralsPackage.HEX_LONG_LITERAL__HEX_VALUE:
            setHexValue((BigInteger) newValue);
            return;
        default:
            super.eSet(featureID, newValue);
            return;
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
        case LiteralsPackage.HEX_LONG_LITERAL__HEX_VALUE:
            setHexValue(HEX_VALUE_EDEFAULT);
            return;
        default:
            super.eUnset(featureID);
            return;
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
        case LiteralsPackage.HEX_LONG_LITERAL__HEX_VALUE:
            return HEX_VALUE_EDEFAULT == null ? hexValue != null : !HEX_VALUE_EDEFAULT.equals(hexValue);
        default:
            return super.eIsSet(featureID);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy())
            return super.toString();

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (hexValue: ");
        result.append(hexValue);
        result.append(')');
        return result.toString();
    }

} //HexLongLiteralImpl
