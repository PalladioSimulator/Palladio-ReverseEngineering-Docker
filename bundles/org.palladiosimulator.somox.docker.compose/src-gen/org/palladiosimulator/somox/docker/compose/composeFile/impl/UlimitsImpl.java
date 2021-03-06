/**
 * generated by Xtext 2.21.0
 */
package org.palladiosimulator.somox.docker.compose.composeFile.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.palladiosimulator.somox.docker.compose.composeFile.ComposeFilePackage;
import org.palladiosimulator.somox.docker.compose.composeFile.Ulimits;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ulimits</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.somox.docker.compose.composeFile.impl.UlimitsImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.palladiosimulator.somox.docker.compose.composeFile.impl.UlimitsImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.palladiosimulator.somox.docker.compose.composeFile.impl.UlimitsImpl#getSoft <em>Soft</em>}</li>
 *   <li>{@link org.palladiosimulator.somox.docker.compose.composeFile.impl.UlimitsImpl#getHard <em>Hard</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UlimitsImpl extends MinimalEObjectImpl.Container implements Ulimits
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final String VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected String value = VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getSoft() <em>Soft</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSoft()
   * @generated
   * @ordered
   */
  protected static final String SOFT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSoft() <em>Soft</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSoft()
   * @generated
   * @ordered
   */
  protected String soft = SOFT_EDEFAULT;

  /**
   * The default value of the '{@link #getHard() <em>Hard</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHard()
   * @generated
   * @ordered
   */
  protected static final String HARD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHard() <em>Hard</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHard()
   * @generated
   * @ordered
   */
  protected String hard = HARD_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UlimitsImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ComposeFilePackage.Literals.ULIMITS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComposeFilePackage.ULIMITS__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setValue(String newValue)
  {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComposeFilePackage.ULIMITS__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getSoft()
  {
    return soft;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSoft(String newSoft)
  {
    String oldSoft = soft;
    soft = newSoft;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComposeFilePackage.ULIMITS__SOFT, oldSoft, soft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getHard()
  {
    return hard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setHard(String newHard)
  {
    String oldHard = hard;
    hard = newHard;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComposeFilePackage.ULIMITS__HARD, oldHard, hard));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ComposeFilePackage.ULIMITS__NAME:
        return getName();
      case ComposeFilePackage.ULIMITS__VALUE:
        return getValue();
      case ComposeFilePackage.ULIMITS__SOFT:
        return getSoft();
      case ComposeFilePackage.ULIMITS__HARD:
        return getHard();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ComposeFilePackage.ULIMITS__NAME:
        setName((String)newValue);
        return;
      case ComposeFilePackage.ULIMITS__VALUE:
        setValue((String)newValue);
        return;
      case ComposeFilePackage.ULIMITS__SOFT:
        setSoft((String)newValue);
        return;
      case ComposeFilePackage.ULIMITS__HARD:
        setHard((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ComposeFilePackage.ULIMITS__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ComposeFilePackage.ULIMITS__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case ComposeFilePackage.ULIMITS__SOFT:
        setSoft(SOFT_EDEFAULT);
        return;
      case ComposeFilePackage.ULIMITS__HARD:
        setHard(HARD_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ComposeFilePackage.ULIMITS__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ComposeFilePackage.ULIMITS__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
      case ComposeFilePackage.ULIMITS__SOFT:
        return SOFT_EDEFAULT == null ? soft != null : !SOFT_EDEFAULT.equals(soft);
      case ComposeFilePackage.ULIMITS__HARD:
        return HARD_EDEFAULT == null ? hard != null : !HARD_EDEFAULT.equals(hard);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", value: ");
    result.append(value);
    result.append(", soft: ");
    result.append(soft);
    result.append(", hard: ");
    result.append(hard);
    result.append(')');
    return result.toString();
  }

} //UlimitsImpl
