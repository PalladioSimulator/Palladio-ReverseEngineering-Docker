/**
 * generated by Xtext 2.21.0
 */
package org.palladiosimulator.somox.docker.dockerFile.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.palladiosimulator.somox.docker.dockerFile.DockerFilePackage;
import org.palladiosimulator.somox.docker.dockerFile.RunWithNoShell;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Run With No Shell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.somox.docker.dockerFile.impl.RunWithNoShellImpl#getExecutable <em>Executable</em>}</li>
 *   <li>{@link org.palladiosimulator.somox.docker.dockerFile.impl.RunWithNoShellImpl#getParams <em>Params</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RunWithNoShellImpl extends RunImpl implements RunWithNoShell
{
  /**
   * The default value of the '{@link #getExecutable() <em>Executable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExecutable()
   * @generated
   * @ordered
   */
  protected static final String EXECUTABLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExecutable() <em>Executable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExecutable()
   * @generated
   * @ordered
   */
  protected String executable = EXECUTABLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getParams() <em>Params</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected EList<String> params;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RunWithNoShellImpl()
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
    return DockerFilePackage.Literals.RUN_WITH_NO_SHELL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getExecutable()
  {
    return executable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setExecutable(String newExecutable)
  {
    String oldExecutable = executable;
    executable = newExecutable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DockerFilePackage.RUN_WITH_NO_SHELL__EXECUTABLE, oldExecutable, executable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getParams()
  {
    if (params == null)
    {
      params = new EDataTypeEList<String>(String.class, this, DockerFilePackage.RUN_WITH_NO_SHELL__PARAMS);
    }
    return params;
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
      case DockerFilePackage.RUN_WITH_NO_SHELL__EXECUTABLE:
        return getExecutable();
      case DockerFilePackage.RUN_WITH_NO_SHELL__PARAMS:
        return getParams();
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
      case DockerFilePackage.RUN_WITH_NO_SHELL__EXECUTABLE:
        setExecutable((String)newValue);
        return;
      case DockerFilePackage.RUN_WITH_NO_SHELL__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends String>)newValue);
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
      case DockerFilePackage.RUN_WITH_NO_SHELL__EXECUTABLE:
        setExecutable(EXECUTABLE_EDEFAULT);
        return;
      case DockerFilePackage.RUN_WITH_NO_SHELL__PARAMS:
        getParams().clear();
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
      case DockerFilePackage.RUN_WITH_NO_SHELL__EXECUTABLE:
        return EXECUTABLE_EDEFAULT == null ? executable != null : !EXECUTABLE_EDEFAULT.equals(executable);
      case DockerFilePackage.RUN_WITH_NO_SHELL__PARAMS:
        return params != null && !params.isEmpty();
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
    result.append(" (executable: ");
    result.append(executable);
    result.append(", params: ");
    result.append(params);
    result.append(')');
    return result.toString();
  }

} //RunWithNoShellImpl
