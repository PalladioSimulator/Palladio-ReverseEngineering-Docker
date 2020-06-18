/**
 * generated by Xtext 2.21.0
 */
package org.palladiosimulator.somox.docker.dockerFile.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.palladiosimulator.somox.docker.dockerFile.DockerFilePackage;
import org.palladiosimulator.somox.docker.dockerFile.Env;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Env</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.somox.docker.dockerFile.impl.EnvImpl#getKey <em>Key</em>}</li>
 *   <li>{@link org.palladiosimulator.somox.docker.dockerFile.impl.EnvImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnvImpl extends InstructionImpl implements Env
{
  /**
   * The cached value of the '{@link #getKey() <em>Key</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKey()
   * @generated
   * @ordered
   */
  protected EList<String> key;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected EList<String> value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EnvImpl()
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
    return DockerFilePackage.Literals.ENV;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getKey()
  {
    if (key == null)
    {
      key = new EDataTypeEList<String>(String.class, this, DockerFilePackage.ENV__KEY);
    }
    return key;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getValue()
  {
    if (value == null)
    {
      value = new EDataTypeEList<String>(String.class, this, DockerFilePackage.ENV__VALUE);
    }
    return value;
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
      case DockerFilePackage.ENV__KEY:
        return getKey();
      case DockerFilePackage.ENV__VALUE:
        return getValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DockerFilePackage.ENV__KEY:
        getKey().clear();
        getKey().addAll((Collection<? extends String>)newValue);
        return;
      case DockerFilePackage.ENV__VALUE:
        getValue().clear();
        getValue().addAll((Collection<? extends String>)newValue);
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
      case DockerFilePackage.ENV__KEY:
        getKey().clear();
        return;
      case DockerFilePackage.ENV__VALUE:
        getValue().clear();
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
      case DockerFilePackage.ENV__KEY:
        return key != null && !key.isEmpty();
      case DockerFilePackage.ENV__VALUE:
        return value != null && !value.isEmpty();
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
    result.append(" (key: ");
    result.append(key);
    result.append(", value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //EnvImpl