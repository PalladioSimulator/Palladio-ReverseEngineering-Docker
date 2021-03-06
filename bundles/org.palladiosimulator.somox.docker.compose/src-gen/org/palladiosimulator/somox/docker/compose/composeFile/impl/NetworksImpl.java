/**
 * generated by Xtext 2.21.0
 */
package org.palladiosimulator.somox.docker.compose.composeFile.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.palladiosimulator.somox.docker.compose.composeFile.ComposeFilePackage;
import org.palladiosimulator.somox.docker.compose.composeFile.Ipam;
import org.palladiosimulator.somox.docker.compose.composeFile.ListOrMapping;
import org.palladiosimulator.somox.docker.compose.composeFile.Mapping;
import org.palladiosimulator.somox.docker.compose.composeFile.Networks;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Networks</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.somox.docker.compose.composeFile.impl.NetworksImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.palladiosimulator.somox.docker.compose.composeFile.impl.NetworksImpl#getDriver <em>Driver</em>}</li>
 *   <li>{@link org.palladiosimulator.somox.docker.compose.composeFile.impl.NetworksImpl#getDriver_opts <em>Driver opts</em>}</li>
 *   <li>{@link org.palladiosimulator.somox.docker.compose.composeFile.impl.NetworksImpl#getAttachable <em>Attachable</em>}</li>
 *   <li>{@link org.palladiosimulator.somox.docker.compose.composeFile.impl.NetworksImpl#getEnable_ipv6 <em>Enable ipv6</em>}</li>
 *   <li>{@link org.palladiosimulator.somox.docker.compose.composeFile.impl.NetworksImpl#getIpam <em>Ipam</em>}</li>
 *   <li>{@link org.palladiosimulator.somox.docker.compose.composeFile.impl.NetworksImpl#getInternal <em>Internal</em>}</li>
 *   <li>{@link org.palladiosimulator.somox.docker.compose.composeFile.impl.NetworksImpl#getLabels <em>Labels</em>}</li>
 *   <li>{@link org.palladiosimulator.somox.docker.compose.composeFile.impl.NetworksImpl#getExternal <em>External</em>}</li>
 *   <li>{@link org.palladiosimulator.somox.docker.compose.composeFile.impl.NetworksImpl#getCustomName <em>Custom Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworksImpl extends MinimalEObjectImpl.Container implements Networks
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
   * The default value of the '{@link #getDriver() <em>Driver</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDriver()
   * @generated
   * @ordered
   */
  protected static final String DRIVER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDriver() <em>Driver</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDriver()
   * @generated
   * @ordered
   */
  protected String driver = DRIVER_EDEFAULT;

  /**
   * The cached value of the '{@link #getDriver_opts() <em>Driver opts</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDriver_opts()
   * @generated
   * @ordered
   */
  protected Mapping driver_opts;

  /**
   * The default value of the '{@link #getAttachable() <em>Attachable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttachable()
   * @generated
   * @ordered
   */
  protected static final String ATTACHABLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAttachable() <em>Attachable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttachable()
   * @generated
   * @ordered
   */
  protected String attachable = ATTACHABLE_EDEFAULT;

  /**
   * The default value of the '{@link #getEnable_ipv6() <em>Enable ipv6</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnable_ipv6()
   * @generated
   * @ordered
   */
  protected static final String ENABLE_IPV6_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEnable_ipv6() <em>Enable ipv6</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnable_ipv6()
   * @generated
   * @ordered
   */
  protected String enable_ipv6 = ENABLE_IPV6_EDEFAULT;

  /**
   * The cached value of the '{@link #getIpam() <em>Ipam</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIpam()
   * @generated
   * @ordered
   */
  protected Ipam ipam;

  /**
   * The default value of the '{@link #getInternal() <em>Internal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInternal()
   * @generated
   * @ordered
   */
  protected static final String INTERNAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInternal() <em>Internal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInternal()
   * @generated
   * @ordered
   */
  protected String internal = INTERNAL_EDEFAULT;

  /**
   * The cached value of the '{@link #getLabels() <em>Labels</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabels()
   * @generated
   * @ordered
   */
  protected ListOrMapping labels;

  /**
   * The default value of the '{@link #getExternal() <em>External</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExternal()
   * @generated
   * @ordered
   */
  protected static final String EXTERNAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExternal() <em>External</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExternal()
   * @generated
   * @ordered
   */
  protected String external = EXTERNAL_EDEFAULT;

  /**
   * The default value of the '{@link #getCustomName() <em>Custom Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCustomName()
   * @generated
   * @ordered
   */
  protected static final String CUSTOM_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCustomName() <em>Custom Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCustomName()
   * @generated
   * @ordered
   */
  protected String customName = CUSTOM_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NetworksImpl()
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
    return ComposeFilePackage.Literals.NETWORKS;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ComposeFilePackage.NETWORKS__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDriver()
  {
    return driver;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDriver(String newDriver)
  {
    String oldDriver = driver;
    driver = newDriver;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComposeFilePackage.NETWORKS__DRIVER, oldDriver, driver));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Mapping getDriver_opts()
  {
    return driver_opts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDriver_opts(Mapping newDriver_opts, NotificationChain msgs)
  {
    Mapping oldDriver_opts = driver_opts;
    driver_opts = newDriver_opts;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComposeFilePackage.NETWORKS__DRIVER_OPTS, oldDriver_opts, newDriver_opts);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDriver_opts(Mapping newDriver_opts)
  {
    if (newDriver_opts != driver_opts)
    {
      NotificationChain msgs = null;
      if (driver_opts != null)
        msgs = ((InternalEObject)driver_opts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComposeFilePackage.NETWORKS__DRIVER_OPTS, null, msgs);
      if (newDriver_opts != null)
        msgs = ((InternalEObject)newDriver_opts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComposeFilePackage.NETWORKS__DRIVER_OPTS, null, msgs);
      msgs = basicSetDriver_opts(newDriver_opts, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComposeFilePackage.NETWORKS__DRIVER_OPTS, newDriver_opts, newDriver_opts));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getAttachable()
  {
    return attachable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAttachable(String newAttachable)
  {
    String oldAttachable = attachable;
    attachable = newAttachable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComposeFilePackage.NETWORKS__ATTACHABLE, oldAttachable, attachable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getEnable_ipv6()
  {
    return enable_ipv6;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEnable_ipv6(String newEnable_ipv6)
  {
    String oldEnable_ipv6 = enable_ipv6;
    enable_ipv6 = newEnable_ipv6;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComposeFilePackage.NETWORKS__ENABLE_IPV6, oldEnable_ipv6, enable_ipv6));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Ipam getIpam()
  {
    return ipam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIpam(Ipam newIpam, NotificationChain msgs)
  {
    Ipam oldIpam = ipam;
    ipam = newIpam;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComposeFilePackage.NETWORKS__IPAM, oldIpam, newIpam);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setIpam(Ipam newIpam)
  {
    if (newIpam != ipam)
    {
      NotificationChain msgs = null;
      if (ipam != null)
        msgs = ((InternalEObject)ipam).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComposeFilePackage.NETWORKS__IPAM, null, msgs);
      if (newIpam != null)
        msgs = ((InternalEObject)newIpam).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComposeFilePackage.NETWORKS__IPAM, null, msgs);
      msgs = basicSetIpam(newIpam, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComposeFilePackage.NETWORKS__IPAM, newIpam, newIpam));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getInternal()
  {
    return internal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setInternal(String newInternal)
  {
    String oldInternal = internal;
    internal = newInternal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComposeFilePackage.NETWORKS__INTERNAL, oldInternal, internal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ListOrMapping getLabels()
  {
    return labels;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLabels(ListOrMapping newLabels, NotificationChain msgs)
  {
    ListOrMapping oldLabels = labels;
    labels = newLabels;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComposeFilePackage.NETWORKS__LABELS, oldLabels, newLabels);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLabels(ListOrMapping newLabels)
  {
    if (newLabels != labels)
    {
      NotificationChain msgs = null;
      if (labels != null)
        msgs = ((InternalEObject)labels).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComposeFilePackage.NETWORKS__LABELS, null, msgs);
      if (newLabels != null)
        msgs = ((InternalEObject)newLabels).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComposeFilePackage.NETWORKS__LABELS, null, msgs);
      msgs = basicSetLabels(newLabels, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComposeFilePackage.NETWORKS__LABELS, newLabels, newLabels));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getExternal()
  {
    return external;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setExternal(String newExternal)
  {
    String oldExternal = external;
    external = newExternal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComposeFilePackage.NETWORKS__EXTERNAL, oldExternal, external));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCustomName()
  {
    return customName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCustomName(String newCustomName)
  {
    String oldCustomName = customName;
    customName = newCustomName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComposeFilePackage.NETWORKS__CUSTOM_NAME, oldCustomName, customName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ComposeFilePackage.NETWORKS__DRIVER_OPTS:
        return basicSetDriver_opts(null, msgs);
      case ComposeFilePackage.NETWORKS__IPAM:
        return basicSetIpam(null, msgs);
      case ComposeFilePackage.NETWORKS__LABELS:
        return basicSetLabels(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case ComposeFilePackage.NETWORKS__NAME:
        return getName();
      case ComposeFilePackage.NETWORKS__DRIVER:
        return getDriver();
      case ComposeFilePackage.NETWORKS__DRIVER_OPTS:
        return getDriver_opts();
      case ComposeFilePackage.NETWORKS__ATTACHABLE:
        return getAttachable();
      case ComposeFilePackage.NETWORKS__ENABLE_IPV6:
        return getEnable_ipv6();
      case ComposeFilePackage.NETWORKS__IPAM:
        return getIpam();
      case ComposeFilePackage.NETWORKS__INTERNAL:
        return getInternal();
      case ComposeFilePackage.NETWORKS__LABELS:
        return getLabels();
      case ComposeFilePackage.NETWORKS__EXTERNAL:
        return getExternal();
      case ComposeFilePackage.NETWORKS__CUSTOM_NAME:
        return getCustomName();
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
      case ComposeFilePackage.NETWORKS__NAME:
        setName((String)newValue);
        return;
      case ComposeFilePackage.NETWORKS__DRIVER:
        setDriver((String)newValue);
        return;
      case ComposeFilePackage.NETWORKS__DRIVER_OPTS:
        setDriver_opts((Mapping)newValue);
        return;
      case ComposeFilePackage.NETWORKS__ATTACHABLE:
        setAttachable((String)newValue);
        return;
      case ComposeFilePackage.NETWORKS__ENABLE_IPV6:
        setEnable_ipv6((String)newValue);
        return;
      case ComposeFilePackage.NETWORKS__IPAM:
        setIpam((Ipam)newValue);
        return;
      case ComposeFilePackage.NETWORKS__INTERNAL:
        setInternal((String)newValue);
        return;
      case ComposeFilePackage.NETWORKS__LABELS:
        setLabels((ListOrMapping)newValue);
        return;
      case ComposeFilePackage.NETWORKS__EXTERNAL:
        setExternal((String)newValue);
        return;
      case ComposeFilePackage.NETWORKS__CUSTOM_NAME:
        setCustomName((String)newValue);
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
      case ComposeFilePackage.NETWORKS__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ComposeFilePackage.NETWORKS__DRIVER:
        setDriver(DRIVER_EDEFAULT);
        return;
      case ComposeFilePackage.NETWORKS__DRIVER_OPTS:
        setDriver_opts((Mapping)null);
        return;
      case ComposeFilePackage.NETWORKS__ATTACHABLE:
        setAttachable(ATTACHABLE_EDEFAULT);
        return;
      case ComposeFilePackage.NETWORKS__ENABLE_IPV6:
        setEnable_ipv6(ENABLE_IPV6_EDEFAULT);
        return;
      case ComposeFilePackage.NETWORKS__IPAM:
        setIpam((Ipam)null);
        return;
      case ComposeFilePackage.NETWORKS__INTERNAL:
        setInternal(INTERNAL_EDEFAULT);
        return;
      case ComposeFilePackage.NETWORKS__LABELS:
        setLabels((ListOrMapping)null);
        return;
      case ComposeFilePackage.NETWORKS__EXTERNAL:
        setExternal(EXTERNAL_EDEFAULT);
        return;
      case ComposeFilePackage.NETWORKS__CUSTOM_NAME:
        setCustomName(CUSTOM_NAME_EDEFAULT);
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
      case ComposeFilePackage.NETWORKS__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ComposeFilePackage.NETWORKS__DRIVER:
        return DRIVER_EDEFAULT == null ? driver != null : !DRIVER_EDEFAULT.equals(driver);
      case ComposeFilePackage.NETWORKS__DRIVER_OPTS:
        return driver_opts != null;
      case ComposeFilePackage.NETWORKS__ATTACHABLE:
        return ATTACHABLE_EDEFAULT == null ? attachable != null : !ATTACHABLE_EDEFAULT.equals(attachable);
      case ComposeFilePackage.NETWORKS__ENABLE_IPV6:
        return ENABLE_IPV6_EDEFAULT == null ? enable_ipv6 != null : !ENABLE_IPV6_EDEFAULT.equals(enable_ipv6);
      case ComposeFilePackage.NETWORKS__IPAM:
        return ipam != null;
      case ComposeFilePackage.NETWORKS__INTERNAL:
        return INTERNAL_EDEFAULT == null ? internal != null : !INTERNAL_EDEFAULT.equals(internal);
      case ComposeFilePackage.NETWORKS__LABELS:
        return labels != null;
      case ComposeFilePackage.NETWORKS__EXTERNAL:
        return EXTERNAL_EDEFAULT == null ? external != null : !EXTERNAL_EDEFAULT.equals(external);
      case ComposeFilePackage.NETWORKS__CUSTOM_NAME:
        return CUSTOM_NAME_EDEFAULT == null ? customName != null : !CUSTOM_NAME_EDEFAULT.equals(customName);
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
    result.append(", driver: ");
    result.append(driver);
    result.append(", attachable: ");
    result.append(attachable);
    result.append(", enable_ipv6: ");
    result.append(enable_ipv6);
    result.append(", internal: ");
    result.append(internal);
    result.append(", external: ");
    result.append(external);
    result.append(", customName: ");
    result.append(customName);
    result.append(')');
    return result.toString();
  }

} //NetworksImpl
