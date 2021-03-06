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
import org.palladiosimulator.somox.docker.compose.composeFile.Healthcheck;
import org.palladiosimulator.somox.docker.compose.composeFile.ValueOrList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Healthcheck</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.somox.docker.compose.composeFile.impl.HealthcheckImpl#getDisable <em>Disable</em>}</li>
 *   <li>{@link org.palladiosimulator.somox.docker.compose.composeFile.impl.HealthcheckImpl#getInterval <em>Interval</em>}</li>
 *   <li>{@link org.palladiosimulator.somox.docker.compose.composeFile.impl.HealthcheckImpl#getRetries <em>Retries</em>}</li>
 *   <li>{@link org.palladiosimulator.somox.docker.compose.composeFile.impl.HealthcheckImpl#getTest <em>Test</em>}</li>
 *   <li>{@link org.palladiosimulator.somox.docker.compose.composeFile.impl.HealthcheckImpl#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link org.palladiosimulator.somox.docker.compose.composeFile.impl.HealthcheckImpl#getStart_period <em>Start period</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HealthcheckImpl extends MinimalEObjectImpl.Container implements Healthcheck
{
  /**
   * The default value of the '{@link #getDisable() <em>Disable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDisable()
   * @generated
   * @ordered
   */
  protected static final String DISABLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDisable() <em>Disable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDisable()
   * @generated
   * @ordered
   */
  protected String disable = DISABLE_EDEFAULT;

  /**
   * The default value of the '{@link #getInterval() <em>Interval</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterval()
   * @generated
   * @ordered
   */
  protected static final String INTERVAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInterval() <em>Interval</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterval()
   * @generated
   * @ordered
   */
  protected String interval = INTERVAL_EDEFAULT;

  /**
   * The default value of the '{@link #getRetries() <em>Retries</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRetries()
   * @generated
   * @ordered
   */
  protected static final String RETRIES_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRetries() <em>Retries</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRetries()
   * @generated
   * @ordered
   */
  protected String retries = RETRIES_EDEFAULT;

  /**
   * The cached value of the '{@link #getTest() <em>Test</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTest()
   * @generated
   * @ordered
   */
  protected ValueOrList test;

  /**
   * The default value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimeout()
   * @generated
   * @ordered
   */
  protected static final String TIMEOUT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimeout()
   * @generated
   * @ordered
   */
  protected String timeout = TIMEOUT_EDEFAULT;

  /**
   * The default value of the '{@link #getStart_period() <em>Start period</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStart_period()
   * @generated
   * @ordered
   */
  protected static final String START_PERIOD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStart_period() <em>Start period</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStart_period()
   * @generated
   * @ordered
   */
  protected String start_period = START_PERIOD_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HealthcheckImpl()
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
    return ComposeFilePackage.Literals.HEALTHCHECK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDisable()
  {
    return disable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDisable(String newDisable)
  {
    String oldDisable = disable;
    disable = newDisable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComposeFilePackage.HEALTHCHECK__DISABLE, oldDisable, disable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getInterval()
  {
    return interval;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setInterval(String newInterval)
  {
    String oldInterval = interval;
    interval = newInterval;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComposeFilePackage.HEALTHCHECK__INTERVAL, oldInterval, interval));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getRetries()
  {
    return retries;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRetries(String newRetries)
  {
    String oldRetries = retries;
    retries = newRetries;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComposeFilePackage.HEALTHCHECK__RETRIES, oldRetries, retries));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ValueOrList getTest()
  {
    return test;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTest(ValueOrList newTest, NotificationChain msgs)
  {
    ValueOrList oldTest = test;
    test = newTest;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComposeFilePackage.HEALTHCHECK__TEST, oldTest, newTest);
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
  public void setTest(ValueOrList newTest)
  {
    if (newTest != test)
    {
      NotificationChain msgs = null;
      if (test != null)
        msgs = ((InternalEObject)test).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComposeFilePackage.HEALTHCHECK__TEST, null, msgs);
      if (newTest != null)
        msgs = ((InternalEObject)newTest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComposeFilePackage.HEALTHCHECK__TEST, null, msgs);
      msgs = basicSetTest(newTest, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComposeFilePackage.HEALTHCHECK__TEST, newTest, newTest));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getTimeout()
  {
    return timeout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTimeout(String newTimeout)
  {
    String oldTimeout = timeout;
    timeout = newTimeout;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComposeFilePackage.HEALTHCHECK__TIMEOUT, oldTimeout, timeout));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getStart_period()
  {
    return start_period;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setStart_period(String newStart_period)
  {
    String oldStart_period = start_period;
    start_period = newStart_period;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComposeFilePackage.HEALTHCHECK__START_PERIOD, oldStart_period, start_period));
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
      case ComposeFilePackage.HEALTHCHECK__TEST:
        return basicSetTest(null, msgs);
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
      case ComposeFilePackage.HEALTHCHECK__DISABLE:
        return getDisable();
      case ComposeFilePackage.HEALTHCHECK__INTERVAL:
        return getInterval();
      case ComposeFilePackage.HEALTHCHECK__RETRIES:
        return getRetries();
      case ComposeFilePackage.HEALTHCHECK__TEST:
        return getTest();
      case ComposeFilePackage.HEALTHCHECK__TIMEOUT:
        return getTimeout();
      case ComposeFilePackage.HEALTHCHECK__START_PERIOD:
        return getStart_period();
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
      case ComposeFilePackage.HEALTHCHECK__DISABLE:
        setDisable((String)newValue);
        return;
      case ComposeFilePackage.HEALTHCHECK__INTERVAL:
        setInterval((String)newValue);
        return;
      case ComposeFilePackage.HEALTHCHECK__RETRIES:
        setRetries((String)newValue);
        return;
      case ComposeFilePackage.HEALTHCHECK__TEST:
        setTest((ValueOrList)newValue);
        return;
      case ComposeFilePackage.HEALTHCHECK__TIMEOUT:
        setTimeout((String)newValue);
        return;
      case ComposeFilePackage.HEALTHCHECK__START_PERIOD:
        setStart_period((String)newValue);
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
      case ComposeFilePackage.HEALTHCHECK__DISABLE:
        setDisable(DISABLE_EDEFAULT);
        return;
      case ComposeFilePackage.HEALTHCHECK__INTERVAL:
        setInterval(INTERVAL_EDEFAULT);
        return;
      case ComposeFilePackage.HEALTHCHECK__RETRIES:
        setRetries(RETRIES_EDEFAULT);
        return;
      case ComposeFilePackage.HEALTHCHECK__TEST:
        setTest((ValueOrList)null);
        return;
      case ComposeFilePackage.HEALTHCHECK__TIMEOUT:
        setTimeout(TIMEOUT_EDEFAULT);
        return;
      case ComposeFilePackage.HEALTHCHECK__START_PERIOD:
        setStart_period(START_PERIOD_EDEFAULT);
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
      case ComposeFilePackage.HEALTHCHECK__DISABLE:
        return DISABLE_EDEFAULT == null ? disable != null : !DISABLE_EDEFAULT.equals(disable);
      case ComposeFilePackage.HEALTHCHECK__INTERVAL:
        return INTERVAL_EDEFAULT == null ? interval != null : !INTERVAL_EDEFAULT.equals(interval);
      case ComposeFilePackage.HEALTHCHECK__RETRIES:
        return RETRIES_EDEFAULT == null ? retries != null : !RETRIES_EDEFAULT.equals(retries);
      case ComposeFilePackage.HEALTHCHECK__TEST:
        return test != null;
      case ComposeFilePackage.HEALTHCHECK__TIMEOUT:
        return TIMEOUT_EDEFAULT == null ? timeout != null : !TIMEOUT_EDEFAULT.equals(timeout);
      case ComposeFilePackage.HEALTHCHECK__START_PERIOD:
        return START_PERIOD_EDEFAULT == null ? start_period != null : !START_PERIOD_EDEFAULT.equals(start_period);
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
    result.append(" (disable: ");
    result.append(disable);
    result.append(", interval: ");
    result.append(interval);
    result.append(", retries: ");
    result.append(retries);
    result.append(", timeout: ");
    result.append(timeout);
    result.append(", start_period: ");
    result.append(start_period);
    result.append(')');
    return result.toString();
  }

} //HealthcheckImpl
