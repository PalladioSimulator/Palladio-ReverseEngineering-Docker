/**
 * generated by Xtext 2.21.0
 */
package org.palladiosimulator.somox.docker.compose.composeFile.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.palladiosimulator.somox.docker.compose.composeFile.ComposeFilePackage;
import org.palladiosimulator.somox.docker.compose.composeFile.RestartPolicy;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Restart Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.somox.docker.compose.composeFile.impl.RestartPolicyImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.palladiosimulator.somox.docker.compose.composeFile.impl.RestartPolicyImpl#getDelay <em>Delay</em>}</li>
 *   <li>{@link org.palladiosimulator.somox.docker.compose.composeFile.impl.RestartPolicyImpl#getMax_attempts <em>Max attempts</em>}</li>
 *   <li>{@link org.palladiosimulator.somox.docker.compose.composeFile.impl.RestartPolicyImpl#getWindow <em>Window</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RestartPolicyImpl extends MinimalEObjectImpl.Container implements RestartPolicy
{
  /**
   * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected static final String CONDITION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected String condition = CONDITION_EDEFAULT;

  /**
   * The default value of the '{@link #getDelay() <em>Delay</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDelay()
   * @generated
   * @ordered
   */
  protected static final String DELAY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDelay() <em>Delay</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDelay()
   * @generated
   * @ordered
   */
  protected String delay = DELAY_EDEFAULT;

  /**
   * The default value of the '{@link #getMax_attempts() <em>Max attempts</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMax_attempts()
   * @generated
   * @ordered
   */
  protected static final String MAX_ATTEMPTS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMax_attempts() <em>Max attempts</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMax_attempts()
   * @generated
   * @ordered
   */
  protected String max_attempts = MAX_ATTEMPTS_EDEFAULT;

  /**
   * The default value of the '{@link #getWindow() <em>Window</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWindow()
   * @generated
   * @ordered
   */
  protected static final String WINDOW_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getWindow() <em>Window</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWindow()
   * @generated
   * @ordered
   */
  protected String window = WINDOW_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RestartPolicyImpl()
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
    return ComposeFilePackage.Literals.RESTART_POLICY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCondition(String newCondition)
  {
    String oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComposeFilePackage.RESTART_POLICY__CONDITION, oldCondition, condition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDelay()
  {
    return delay;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDelay(String newDelay)
  {
    String oldDelay = delay;
    delay = newDelay;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComposeFilePackage.RESTART_POLICY__DELAY, oldDelay, delay));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getMax_attempts()
  {
    return max_attempts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMax_attempts(String newMax_attempts)
  {
    String oldMax_attempts = max_attempts;
    max_attempts = newMax_attempts;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComposeFilePackage.RESTART_POLICY__MAX_ATTEMPTS, oldMax_attempts, max_attempts));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getWindow()
  {
    return window;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setWindow(String newWindow)
  {
    String oldWindow = window;
    window = newWindow;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComposeFilePackage.RESTART_POLICY__WINDOW, oldWindow, window));
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
      case ComposeFilePackage.RESTART_POLICY__CONDITION:
        return getCondition();
      case ComposeFilePackage.RESTART_POLICY__DELAY:
        return getDelay();
      case ComposeFilePackage.RESTART_POLICY__MAX_ATTEMPTS:
        return getMax_attempts();
      case ComposeFilePackage.RESTART_POLICY__WINDOW:
        return getWindow();
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
      case ComposeFilePackage.RESTART_POLICY__CONDITION:
        setCondition((String)newValue);
        return;
      case ComposeFilePackage.RESTART_POLICY__DELAY:
        setDelay((String)newValue);
        return;
      case ComposeFilePackage.RESTART_POLICY__MAX_ATTEMPTS:
        setMax_attempts((String)newValue);
        return;
      case ComposeFilePackage.RESTART_POLICY__WINDOW:
        setWindow((String)newValue);
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
      case ComposeFilePackage.RESTART_POLICY__CONDITION:
        setCondition(CONDITION_EDEFAULT);
        return;
      case ComposeFilePackage.RESTART_POLICY__DELAY:
        setDelay(DELAY_EDEFAULT);
        return;
      case ComposeFilePackage.RESTART_POLICY__MAX_ATTEMPTS:
        setMax_attempts(MAX_ATTEMPTS_EDEFAULT);
        return;
      case ComposeFilePackage.RESTART_POLICY__WINDOW:
        setWindow(WINDOW_EDEFAULT);
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
      case ComposeFilePackage.RESTART_POLICY__CONDITION:
        return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
      case ComposeFilePackage.RESTART_POLICY__DELAY:
        return DELAY_EDEFAULT == null ? delay != null : !DELAY_EDEFAULT.equals(delay);
      case ComposeFilePackage.RESTART_POLICY__MAX_ATTEMPTS:
        return MAX_ATTEMPTS_EDEFAULT == null ? max_attempts != null : !MAX_ATTEMPTS_EDEFAULT.equals(max_attempts);
      case ComposeFilePackage.RESTART_POLICY__WINDOW:
        return WINDOW_EDEFAULT == null ? window != null : !WINDOW_EDEFAULT.equals(window);
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
    result.append(" (condition: ");
    result.append(condition);
    result.append(", delay: ");
    result.append(delay);
    result.append(", max_attempts: ");
    result.append(max_attempts);
    result.append(", window: ");
    result.append(window);
    result.append(')');
    return result.toString();
  }

} //RestartPolicyImpl
