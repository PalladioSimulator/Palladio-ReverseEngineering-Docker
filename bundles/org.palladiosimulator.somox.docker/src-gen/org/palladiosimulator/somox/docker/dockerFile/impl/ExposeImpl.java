/**
 * generated by Xtext 2.21.0
 */
package org.palladiosimulator.somox.docker.dockerFile.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.somox.docker.dockerFile.DockerFilePackage;
import org.palladiosimulator.somox.docker.dockerFile.Expose;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expose</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.somox.docker.dockerFile.impl.ExposeImpl#getPorts <em>Ports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExposeImpl extends InstructionImpl implements Expose
{
  /**
   * The default value of the '{@link #getPorts() <em>Ports</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPorts()
   * @generated
   * @ordered
   */
  protected static final String PORTS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPorts() <em>Ports</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPorts()
   * @generated
   * @ordered
   */
  protected String ports = PORTS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExposeImpl()
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
    return DockerFilePackage.Literals.EXPOSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPorts()
  {
    return ports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPorts(String newPorts)
  {
    String oldPorts = ports;
    ports = newPorts;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DockerFilePackage.EXPOSE__PORTS, oldPorts, ports));
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
      case DockerFilePackage.EXPOSE__PORTS:
        return getPorts();
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
      case DockerFilePackage.EXPOSE__PORTS:
        setPorts((String)newValue);
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
      case DockerFilePackage.EXPOSE__PORTS:
        setPorts(PORTS_EDEFAULT);
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
      case DockerFilePackage.EXPOSE__PORTS:
        return PORTS_EDEFAULT == null ? ports != null : !PORTS_EDEFAULT.equals(ports);
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
    result.append(" (ports: ");
    result.append(ports);
    result.append(')');
    return result.toString();
  }

} //ExposeImpl
