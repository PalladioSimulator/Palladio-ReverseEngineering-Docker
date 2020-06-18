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
import org.palladiosimulator.somox.docker.compose.composeFile.Deploy;
import org.palladiosimulator.somox.docker.compose.composeFile.DeployConfigs;
import org.palladiosimulator.somox.docker.compose.composeFile.Mapping;
import org.palladiosimulator.somox.docker.compose.composeFile.Placement;
import org.palladiosimulator.somox.docker.compose.composeFile.RestartPolicy;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deploy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.somox.docker.compose.composeFile.impl.DeployImpl#getEndpoint_mode <em>Endpoint mode</em>}</li>
 *   <li>{@link org.palladiosimulator.somox.docker.compose.composeFile.impl.DeployImpl#getLabels <em>Labels</em>}</li>
 *   <li>{@link org.palladiosimulator.somox.docker.compose.composeFile.impl.DeployImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link org.palladiosimulator.somox.docker.compose.composeFile.impl.DeployImpl#getPlacement <em>Placement</em>}</li>
 *   <li>{@link org.palladiosimulator.somox.docker.compose.composeFile.impl.DeployImpl#getReplicas <em>Replicas</em>}</li>
 *   <li>{@link org.palladiosimulator.somox.docker.compose.composeFile.impl.DeployImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link org.palladiosimulator.somox.docker.compose.composeFile.impl.DeployImpl#getRestart_policy <em>Restart policy</em>}</li>
 *   <li>{@link org.palladiosimulator.somox.docker.compose.composeFile.impl.DeployImpl#getRollback_config <em>Rollback config</em>}</li>
 *   <li>{@link org.palladiosimulator.somox.docker.compose.composeFile.impl.DeployImpl#getUpdate_config <em>Update config</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeployImpl extends MinimalEObjectImpl.Container implements Deploy
{
  /**
   * The default value of the '{@link #getEndpoint_mode() <em>Endpoint mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndpoint_mode()
   * @generated
   * @ordered
   */
  protected static final String ENDPOINT_MODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEndpoint_mode() <em>Endpoint mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndpoint_mode()
   * @generated
   * @ordered
   */
  protected String endpoint_mode = ENDPOINT_MODE_EDEFAULT;

  /**
   * The cached value of the '{@link #getLabels() <em>Labels</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabels()
   * @generated
   * @ordered
   */
  protected Mapping labels;

  /**
   * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMode()
   * @generated
   * @ordered
   */
  protected static final String MODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMode()
   * @generated
   * @ordered
   */
  protected String mode = MODE_EDEFAULT;

  /**
   * The cached value of the '{@link #getPlacement() <em>Placement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlacement()
   * @generated
   * @ordered
   */
  protected Placement placement;

  /**
   * The default value of the '{@link #getReplicas() <em>Replicas</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReplicas()
   * @generated
   * @ordered
   */
  protected static final String REPLICAS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReplicas() <em>Replicas</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReplicas()
   * @generated
   * @ordered
   */
  protected String replicas = REPLICAS_EDEFAULT;

  /**
   * The default value of the '{@link #getResources() <em>Resources</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResources()
   * @generated
   * @ordered
   */
  protected static final String RESOURCES_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getResources() <em>Resources</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResources()
   * @generated
   * @ordered
   */
  protected String resources = RESOURCES_EDEFAULT;

  /**
   * The cached value of the '{@link #getRestart_policy() <em>Restart policy</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRestart_policy()
   * @generated
   * @ordered
   */
  protected RestartPolicy restart_policy;

  /**
   * The cached value of the '{@link #getRollback_config() <em>Rollback config</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRollback_config()
   * @generated
   * @ordered
   */
  protected DeployConfigs rollback_config;

  /**
   * The cached value of the '{@link #getUpdate_config() <em>Update config</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpdate_config()
   * @generated
   * @ordered
   */
  protected DeployConfigs update_config;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeployImpl()
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
    return ComposeFilePackage.Literals.DEPLOY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getEndpoint_mode()
  {
    return endpoint_mode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEndpoint_mode(String newEndpoint_mode)
  {
    String oldEndpoint_mode = endpoint_mode;
    endpoint_mode = newEndpoint_mode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComposeFilePackage.DEPLOY__ENDPOINT_MODE, oldEndpoint_mode, endpoint_mode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Mapping getLabels()
  {
    return labels;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLabels(Mapping newLabels, NotificationChain msgs)
  {
    Mapping oldLabels = labels;
    labels = newLabels;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComposeFilePackage.DEPLOY__LABELS, oldLabels, newLabels);
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
  public void setLabels(Mapping newLabels)
  {
    if (newLabels != labels)
    {
      NotificationChain msgs = null;
      if (labels != null)
        msgs = ((InternalEObject)labels).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComposeFilePackage.DEPLOY__LABELS, null, msgs);
      if (newLabels != null)
        msgs = ((InternalEObject)newLabels).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComposeFilePackage.DEPLOY__LABELS, null, msgs);
      msgs = basicSetLabels(newLabels, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComposeFilePackage.DEPLOY__LABELS, newLabels, newLabels));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getMode()
  {
    return mode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMode(String newMode)
  {
    String oldMode = mode;
    mode = newMode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComposeFilePackage.DEPLOY__MODE, oldMode, mode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Placement getPlacement()
  {
    return placement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPlacement(Placement newPlacement, NotificationChain msgs)
  {
    Placement oldPlacement = placement;
    placement = newPlacement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComposeFilePackage.DEPLOY__PLACEMENT, oldPlacement, newPlacement);
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
  public void setPlacement(Placement newPlacement)
  {
    if (newPlacement != placement)
    {
      NotificationChain msgs = null;
      if (placement != null)
        msgs = ((InternalEObject)placement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComposeFilePackage.DEPLOY__PLACEMENT, null, msgs);
      if (newPlacement != null)
        msgs = ((InternalEObject)newPlacement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComposeFilePackage.DEPLOY__PLACEMENT, null, msgs);
      msgs = basicSetPlacement(newPlacement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComposeFilePackage.DEPLOY__PLACEMENT, newPlacement, newPlacement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getReplicas()
  {
    return replicas;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setReplicas(String newReplicas)
  {
    String oldReplicas = replicas;
    replicas = newReplicas;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComposeFilePackage.DEPLOY__REPLICAS, oldReplicas, replicas));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getResources()
  {
    return resources;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setResources(String newResources)
  {
    String oldResources = resources;
    resources = newResources;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComposeFilePackage.DEPLOY__RESOURCES, oldResources, resources));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RestartPolicy getRestart_policy()
  {
    return restart_policy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRestart_policy(RestartPolicy newRestart_policy, NotificationChain msgs)
  {
    RestartPolicy oldRestart_policy = restart_policy;
    restart_policy = newRestart_policy;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComposeFilePackage.DEPLOY__RESTART_POLICY, oldRestart_policy, newRestart_policy);
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
  public void setRestart_policy(RestartPolicy newRestart_policy)
  {
    if (newRestart_policy != restart_policy)
    {
      NotificationChain msgs = null;
      if (restart_policy != null)
        msgs = ((InternalEObject)restart_policy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComposeFilePackage.DEPLOY__RESTART_POLICY, null, msgs);
      if (newRestart_policy != null)
        msgs = ((InternalEObject)newRestart_policy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComposeFilePackage.DEPLOY__RESTART_POLICY, null, msgs);
      msgs = basicSetRestart_policy(newRestart_policy, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComposeFilePackage.DEPLOY__RESTART_POLICY, newRestart_policy, newRestart_policy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DeployConfigs getRollback_config()
  {
    return rollback_config;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRollback_config(DeployConfigs newRollback_config, NotificationChain msgs)
  {
    DeployConfigs oldRollback_config = rollback_config;
    rollback_config = newRollback_config;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComposeFilePackage.DEPLOY__ROLLBACK_CONFIG, oldRollback_config, newRollback_config);
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
  public void setRollback_config(DeployConfigs newRollback_config)
  {
    if (newRollback_config != rollback_config)
    {
      NotificationChain msgs = null;
      if (rollback_config != null)
        msgs = ((InternalEObject)rollback_config).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComposeFilePackage.DEPLOY__ROLLBACK_CONFIG, null, msgs);
      if (newRollback_config != null)
        msgs = ((InternalEObject)newRollback_config).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComposeFilePackage.DEPLOY__ROLLBACK_CONFIG, null, msgs);
      msgs = basicSetRollback_config(newRollback_config, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComposeFilePackage.DEPLOY__ROLLBACK_CONFIG, newRollback_config, newRollback_config));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DeployConfigs getUpdate_config()
  {
    return update_config;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUpdate_config(DeployConfigs newUpdate_config, NotificationChain msgs)
  {
    DeployConfigs oldUpdate_config = update_config;
    update_config = newUpdate_config;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComposeFilePackage.DEPLOY__UPDATE_CONFIG, oldUpdate_config, newUpdate_config);
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
  public void setUpdate_config(DeployConfigs newUpdate_config)
  {
    if (newUpdate_config != update_config)
    {
      NotificationChain msgs = null;
      if (update_config != null)
        msgs = ((InternalEObject)update_config).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComposeFilePackage.DEPLOY__UPDATE_CONFIG, null, msgs);
      if (newUpdate_config != null)
        msgs = ((InternalEObject)newUpdate_config).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComposeFilePackage.DEPLOY__UPDATE_CONFIG, null, msgs);
      msgs = basicSetUpdate_config(newUpdate_config, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComposeFilePackage.DEPLOY__UPDATE_CONFIG, newUpdate_config, newUpdate_config));
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
      case ComposeFilePackage.DEPLOY__LABELS:
        return basicSetLabels(null, msgs);
      case ComposeFilePackage.DEPLOY__PLACEMENT:
        return basicSetPlacement(null, msgs);
      case ComposeFilePackage.DEPLOY__RESTART_POLICY:
        return basicSetRestart_policy(null, msgs);
      case ComposeFilePackage.DEPLOY__ROLLBACK_CONFIG:
        return basicSetRollback_config(null, msgs);
      case ComposeFilePackage.DEPLOY__UPDATE_CONFIG:
        return basicSetUpdate_config(null, msgs);
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
      case ComposeFilePackage.DEPLOY__ENDPOINT_MODE:
        return getEndpoint_mode();
      case ComposeFilePackage.DEPLOY__LABELS:
        return getLabels();
      case ComposeFilePackage.DEPLOY__MODE:
        return getMode();
      case ComposeFilePackage.DEPLOY__PLACEMENT:
        return getPlacement();
      case ComposeFilePackage.DEPLOY__REPLICAS:
        return getReplicas();
      case ComposeFilePackage.DEPLOY__RESOURCES:
        return getResources();
      case ComposeFilePackage.DEPLOY__RESTART_POLICY:
        return getRestart_policy();
      case ComposeFilePackage.DEPLOY__ROLLBACK_CONFIG:
        return getRollback_config();
      case ComposeFilePackage.DEPLOY__UPDATE_CONFIG:
        return getUpdate_config();
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
      case ComposeFilePackage.DEPLOY__ENDPOINT_MODE:
        setEndpoint_mode((String)newValue);
        return;
      case ComposeFilePackage.DEPLOY__LABELS:
        setLabels((Mapping)newValue);
        return;
      case ComposeFilePackage.DEPLOY__MODE:
        setMode((String)newValue);
        return;
      case ComposeFilePackage.DEPLOY__PLACEMENT:
        setPlacement((Placement)newValue);
        return;
      case ComposeFilePackage.DEPLOY__REPLICAS:
        setReplicas((String)newValue);
        return;
      case ComposeFilePackage.DEPLOY__RESOURCES:
        setResources((String)newValue);
        return;
      case ComposeFilePackage.DEPLOY__RESTART_POLICY:
        setRestart_policy((RestartPolicy)newValue);
        return;
      case ComposeFilePackage.DEPLOY__ROLLBACK_CONFIG:
        setRollback_config((DeployConfigs)newValue);
        return;
      case ComposeFilePackage.DEPLOY__UPDATE_CONFIG:
        setUpdate_config((DeployConfigs)newValue);
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
      case ComposeFilePackage.DEPLOY__ENDPOINT_MODE:
        setEndpoint_mode(ENDPOINT_MODE_EDEFAULT);
        return;
      case ComposeFilePackage.DEPLOY__LABELS:
        setLabels((Mapping)null);
        return;
      case ComposeFilePackage.DEPLOY__MODE:
        setMode(MODE_EDEFAULT);
        return;
      case ComposeFilePackage.DEPLOY__PLACEMENT:
        setPlacement((Placement)null);
        return;
      case ComposeFilePackage.DEPLOY__REPLICAS:
        setReplicas(REPLICAS_EDEFAULT);
        return;
      case ComposeFilePackage.DEPLOY__RESOURCES:
        setResources(RESOURCES_EDEFAULT);
        return;
      case ComposeFilePackage.DEPLOY__RESTART_POLICY:
        setRestart_policy((RestartPolicy)null);
        return;
      case ComposeFilePackage.DEPLOY__ROLLBACK_CONFIG:
        setRollback_config((DeployConfigs)null);
        return;
      case ComposeFilePackage.DEPLOY__UPDATE_CONFIG:
        setUpdate_config((DeployConfigs)null);
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
      case ComposeFilePackage.DEPLOY__ENDPOINT_MODE:
        return ENDPOINT_MODE_EDEFAULT == null ? endpoint_mode != null : !ENDPOINT_MODE_EDEFAULT.equals(endpoint_mode);
      case ComposeFilePackage.DEPLOY__LABELS:
        return labels != null;
      case ComposeFilePackage.DEPLOY__MODE:
        return MODE_EDEFAULT == null ? mode != null : !MODE_EDEFAULT.equals(mode);
      case ComposeFilePackage.DEPLOY__PLACEMENT:
        return placement != null;
      case ComposeFilePackage.DEPLOY__REPLICAS:
        return REPLICAS_EDEFAULT == null ? replicas != null : !REPLICAS_EDEFAULT.equals(replicas);
      case ComposeFilePackage.DEPLOY__RESOURCES:
        return RESOURCES_EDEFAULT == null ? resources != null : !RESOURCES_EDEFAULT.equals(resources);
      case ComposeFilePackage.DEPLOY__RESTART_POLICY:
        return restart_policy != null;
      case ComposeFilePackage.DEPLOY__ROLLBACK_CONFIG:
        return rollback_config != null;
      case ComposeFilePackage.DEPLOY__UPDATE_CONFIG:
        return update_config != null;
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
    result.append(" (endpoint_mode: ");
    result.append(endpoint_mode);
    result.append(", mode: ");
    result.append(mode);
    result.append(", replicas: ");
    result.append(replicas);
    result.append(", resources: ");
    result.append(resources);
    result.append(')');
    return result.toString();
  }

} //DeployImpl