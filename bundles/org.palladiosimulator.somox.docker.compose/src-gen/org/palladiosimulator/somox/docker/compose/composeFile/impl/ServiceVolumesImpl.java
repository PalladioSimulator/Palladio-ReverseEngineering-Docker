/**
 * generated by Xtext 2.21.0
 */
package org.palladiosimulator.somox.docker.compose.composeFile.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.palladiosimulator.somox.docker.compose.composeFile.ComposeFilePackage;
import org.palladiosimulator.somox.docker.compose.composeFile.ServiceVolumes;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Volumes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.somox.docker.compose.composeFile.impl.ServiceVolumesImpl#getVolumes <em>Volumes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceVolumesImpl extends MinimalEObjectImpl.Container implements ServiceVolumes
{
  /**
   * The default value of the '{@link #getVolumes() <em>Volumes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVolumes()
   * @generated
   * @ordered
   */
  protected static final String VOLUMES_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVolumes() <em>Volumes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVolumes()
   * @generated
   * @ordered
   */
  protected String volumes = VOLUMES_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ServiceVolumesImpl()
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
    return ComposeFilePackage.Literals.SERVICE_VOLUMES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getVolumes()
  {
    return volumes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVolumes(String newVolumes)
  {
    String oldVolumes = volumes;
    volumes = newVolumes;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComposeFilePackage.SERVICE_VOLUMES__VOLUMES, oldVolumes, volumes));
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
      case ComposeFilePackage.SERVICE_VOLUMES__VOLUMES:
        return getVolumes();
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
      case ComposeFilePackage.SERVICE_VOLUMES__VOLUMES:
        setVolumes((String)newValue);
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
      case ComposeFilePackage.SERVICE_VOLUMES__VOLUMES:
        setVolumes(VOLUMES_EDEFAULT);
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
      case ComposeFilePackage.SERVICE_VOLUMES__VOLUMES:
        return VOLUMES_EDEFAULT == null ? volumes != null : !VOLUMES_EDEFAULT.equals(volumes);
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
    result.append(" (volumes: ");
    result.append(volumes);
    result.append(')');
    return result.toString();
  }

} //ServiceVolumesImpl
